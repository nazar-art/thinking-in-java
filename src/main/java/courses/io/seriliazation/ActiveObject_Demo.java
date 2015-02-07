package courses.io.seriliazation;

import java.io.*;

class HelloTask implements Task, Serializable {

    private String msg;
    private int counter;
    private long sleepTime;

    public HelloTask(String msg, int counter, long sleepTime) {
        this.msg = msg;
        this.counter = counter;
        this.sleepTime = sleepTime;
    }

    @Override
    public Task next() {
        System.out.println(msg + ":" + counter);
        counter--;
        return (counter == 0) ? null : this;
    }

    @Override
    public long sleepTime() {
        return sleepTime;
    }

    public String getMsg() {
        return msg;
    }

    public int getCounter() {
        return counter;
    }

    public long getSleepTime() {
        return sleepTime;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(msg);
        out.writeInt(counter);
        out.writeLong(sleepTime);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.msg = in.readUTF();
        this.counter = in.readInt();
        this.sleepTime = in.readLong();
    }
}

class TaskThread extends Thread {
    private Task task;
    private volatile boolean pause;

    public TaskThread(Task task) {
        this.task = task;
    }

    public void pauseOn() {
        this.pause = true;
        this.interrupt();
    }

    public void pauseOff() {
        this.pause = false;
    }

    @Override
    public void run() {
        while (task != null) {
            try {
                Thread.sleep(task.sleepTime()); //wait for next step
            } catch (InterruptedException e) {
                if (pause) {
                    while (pause); // wait for 'pauseOff'
                } else {
                    return;
                }
            }
            task = task.next(); // make next step
        }
    }

    public Task getTask() {
        return task;
    }
}


class ActiveObject implements Serializable {
    private transient TaskThread thread;

    public ActiveObject(Task task) {
        this.thread = new TaskThread(task);
        this.thread.start();
    }

    public void pauseStart() {
        thread.pauseOn();
    }

    public void pauseStop() {
        thread.pauseOff();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        // stop my activity
        thread.pauseOn();
        // serialize internal task
        Task task = thread.getTask();
        out.writeObject(task);
        // restart my activity
        thread.pauseOff();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        // deserialize internal task
        Task task = (Task) in.readObject();
        // start new activity
        this.thread = new TaskThread(task);
        this.thread.start();
    }
}

public class ActiveObject_Demo {
    public static void main(String[] args) throws Exception {
        ActiveObject oldActiveTask = new ActiveObject(new HelloTask("Hello", 20, 500));
        Thread.sleep(5000);

        byte[] rawData = writeActiveTask(oldActiveTask);
        System.out.println("rawData.length = " + rawData.length);
        System.out.println(new String(rawData));
//        ActiveObject newActiveTask_0 = readActiveTask(rawData);
//        ActiveObject newActiveTask_1 = readActiveTask(rawData);
//        ActiveObject newActiveTask_2 = readActiveTask(rawData);
    }

    private static byte[] writeActiveTask(ActiveObject activeTask) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        try (ObjectOutput out = new ObjectOutputStream(buff)) {
            out.writeObject(activeTask);
            out.flush();
            return buff.toByteArray();
        }
    }

    private static ActiveObject readActiveTask(byte[] rawData) throws IOException, ClassNotFoundException {
        try (ObjectInputStream src = new ObjectInputStream(new ByteArrayInputStream(rawData))) {
            return (ActiveObject) src.readObject();
        }
    }
}