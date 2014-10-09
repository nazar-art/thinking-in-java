package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/*
 * Exercise 6: (1) Create two exception classes, each of which performs its own logging
	automatically. Demonstrate that these work.
 */

@SuppressWarnings("serial")
class LoggingExceptionOne extends Exception {
	private static Logger logger = Logger.getLogger("LoggingExceptionOne");
	
	public LoggingExceptionOne() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

@SuppressWarnings("serial")
class LoggingExceptiionTwo extends Exception {
	private static Logger logger = Logger.getLogger("LoggingExceptiionTwo");
	
	public LoggingExceptiionTwo() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class Exer_6 {
	public static void main(String[] args) {
		try {
			throw new LoggingExceptionOne();
		} catch (LoggingExceptionOne e) {
			System.err.println("Caught " + e);
		}
		
		try {
			throw new LoggingExceptiionTwo();
		} catch (LoggingExceptiionTwo e) {
			System.err.println("Caught " + e);
		}
	}
}
