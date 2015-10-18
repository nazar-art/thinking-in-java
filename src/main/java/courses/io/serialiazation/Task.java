package courses.io.serialiazation;

public interface Task {
    public Task next();

    public long sleepTime();
}
