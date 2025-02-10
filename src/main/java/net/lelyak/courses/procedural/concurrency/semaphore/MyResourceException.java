package net.lelyak.courses.procedural.concurrency.semaphore;

public class MyResourceException extends Exception {
    public MyResourceException() {
        super();
    }

    public MyResourceException(String message) {
        super(message);
    }

    public MyResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyResourceException(Throwable cause) {
        super(cause);
    }
}
