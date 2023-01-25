package exceptionhandling;


public class Example2 {
    public static void main(String[] args) {
        double result = divide(10, 5);
        System.out.println("Result: " + result);

        result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static double divide(double numerator, double denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
    }
}
