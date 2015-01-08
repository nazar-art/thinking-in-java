package courses.procedural.recursion;

import courses.procedural.util.Evaluator;

import java.util.ArrayList;

public class ExpressionCalculator {
    public static void main(String[] args) {
        ArrayList<String> expressions = new ArrayList<>();
        expressions.add("3+4*5");
        expressions.add("(3+4)*5");
        expressions.add("1-(2-(3-(4-5)))");

        for (String expression : expressions) {
            Evaluator e = new Evaluator(expression);
            int value = e.getExpressionValue();
            System.out.printf(">>>%s = %d\n", expression, value);
        }
    }
}
