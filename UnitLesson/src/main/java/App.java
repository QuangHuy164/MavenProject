package unit.maven;

public class App {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            return Double.NaN;
        }
        double result = numerator / denominator;
        return Double.parseDouble(df2.format(result));
    }

    public static String returnTwoChars(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public static Double div(Double a, Double b) {
        if (a == null || b == null || b == 0) {
            return null;
        }
        return Double.parseDouble(df2.format(a / b));
    }
}
