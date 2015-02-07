package courses.io.seriliazation;

public interface Task {
    public Task next();

    public long sleepTime();
}
