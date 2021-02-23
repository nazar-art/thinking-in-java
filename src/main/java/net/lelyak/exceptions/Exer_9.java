package net.lelyak.exceptions;

@SuppressWarnings("serial")
/*
 * Exercise 9: (2) 
 * Create three new types of net.lelyak.exceptions. Write a class with a method that
 throws all three. In main( ), call the method but only use a single catch clause that will
 catch all three types of net.lelyak.exceptions.
 */

class ExceptBase extends RuntimeException {
}

@SuppressWarnings("serial")
class ExceptOne extends ExceptBase {
}

@SuppressWarnings("serial")
class ExceptTwo extends ExceptBase {
}

@SuppressWarnings("serial")
class ExceptThree extends ExceptBase {
}

class ThrowExcept {
    public void exceptionsComing() throws ExceptOne, ExceptTwo, ExceptThree {
        throw new ExceptOne();
    }
}

public class Exer_9 {
    public static void main(String[] args) {
        ThrowExcept except = new ThrowExcept();
        try {
            except.exceptionsComing();
        } catch (ExceptBase e) {
            e.printStackTrace();
        }
    }
}
