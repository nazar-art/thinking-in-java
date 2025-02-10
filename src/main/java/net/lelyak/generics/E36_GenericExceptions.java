package net.lelyak.generics;

/*
 * Exercise 36: (2) Add a second parameterized exception to the Processor class and
 *	demonstrate that the net.lelyak.exceptions can vary independently.
 */

import java.util.*;

interface Processor<T, E extends Exception, F extends Exception> {
    void process(List<T> resultCollector) throws E, F;
}

@SuppressWarnings("serial")
class ProcessRunner<T, E extends Exception, F extends Exception> extends

        ArrayList<Processor<T, E, F>> {

    List<T> processAll() throws E, F {

        List<T> resultCollector = new ArrayList<T>();

        for (Processor<T, E, F> processor : this)
            processor.process(resultCollector);

        return resultCollector;
    }
}

@SuppressWarnings("serial")
class Failure1_1 extends Exception {
}

@SuppressWarnings("serial")
class Failure1_2 extends Exception {
}

class Processor1 implements Processor<String, Failure1_1, Failure1_2> {

    static Random rnd = new Random(47);
    static int count = 3;

    public void process(List<String> resultCollector) throws Failure1_1,
            Failure1_2 {
        if (count-- > 1)
            resultCollector.add("Hep!");
        else
            resultCollector.add("Ho!");
        if (count < 0)
            if (rnd.nextBoolean())
                throw new Failure1_1();
        throw new Failure1_2();
    }
}

@SuppressWarnings("serial")
class Failure2_1 extends Exception {
}

@SuppressWarnings("serial")
class Failure2_2 extends Exception {
}

class Processor2 implements Processor<Integer, Failure2_1, Failure2_2> {
    static Random rnd = new Random(47);
    static int count = 2;

    public void process(List<Integer> resultCollector) throws Failure2_1,
            Failure2_2 {
        if (count-- == 0)
            resultCollector.add(47);
        else {
            resultCollector.add(11);
        }
        if (count < 0)
            if (rnd.nextBoolean())
                throw new Failure2_1();
        throw new Failure2_2();
    }
}

public class E36_GenericExceptions {

    public static void main(String[] args) {

        ProcessRunner<String, Failure1_1, Failure1_2> runner = new ProcessRunner<>();
        for (int i = 0; i < 3; i++)
            runner.add(new Processor1());

        try {
            System.out.println(runner.processAll());
        } catch (Failure1_1 e) {
            System.out.println(e);
        } catch (Failure1_2 e) {
            System.out.println(e);
        }

        ProcessRunner<Integer, Failure2_1, Failure2_2> runner2 = new ProcessRunner<>();
        for (int i = 0; i < 3; i++)
            runner2.add(new Processor2());

        try {
            System.out.println(runner2.processAll());
        } catch (Failure2_1 e) {
            System.out.println(e);
        } catch (Failure2_2 e) {
            System.out.println(e);
        }
    }
}