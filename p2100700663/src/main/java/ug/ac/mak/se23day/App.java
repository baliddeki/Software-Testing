package ug.ac.mak.se23day;

/**
 * Hello world!
 *
 */
public class App {
    public static int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
