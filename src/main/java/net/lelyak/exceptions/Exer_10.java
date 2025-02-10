package net.lelyak.exceptions;

/*
 * Exercise 10: (2) 
 * Create a class with two methods, f( ) and g( ). In g( ), throw an
	exception of a new type that you define. In f( ), call g( ), catch its exception and, 
	in the catch clause, throw a different exception (of a second type that you define). 
	Test your code in main( ).
	**************
	Exercise 11: (1) Repeat the previous exercise, but inside the catch clause, wrap g( )’s
	exception in a RuntimeException.

 */

@SuppressWarnings("serial")
class FirstException extends RuntimeException {

}

@SuppressWarnings("serial")
class SecondException extends RuntimeException {

}

class Testing {
    void f() throws SecondException {
        try {
            g();
        } catch (FirstException e) {
            throw new RuntimeException();
        }
    }

    void g() throws FirstException {
        throw new FirstException();
    }
}

public class Exer_10 {
    public static void main(String[] args) {
        Testing testing = new Testing();
//		try {
        testing.f();
//		} catch (SecondException e) {
//			System.out.println("Caught " + e);
//		}
    }
}
