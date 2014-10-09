package exceptions;

/*
 * Exercise 19: (2) 
 * Repair the problem in LostMessage.java by guarding the call in the
	finally clause.
 */

@SuppressWarnings("serial")
class VeryImportantException extends Exception {
	  public String toString() {
	    return "A very important exception!";
	  }
	}

	@SuppressWarnings("serial")
	class HoHumException extends Exception {
	  public String toString() {
	    return "A trivial exception";
	  }
	}

	public class Exer_19_LostMessage {
	  void f() throws VeryImportantException {
	    throw new VeryImportantException();
	  }
	  void dispose() throws HoHumException {
	    throw new HoHumException();
	  }
	  public static void main(String[] args) {
	    try {
	      Exer_19_LostMessage lm = new Exer_19_LostMessage();
	      try {
	        lm.f();
	      } finally {
	    lm.dispose();
	      }
	    } catch(Exception e) {
	      System.out.println(e);
	    }
	  }
	}
