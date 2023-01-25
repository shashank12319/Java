package exceptionhandling;


public class Example3 {
    public static void main(String[] args) {
        int number = parseInt("123");
        System.out.println("Number: " + number);

        number = parseInt("abc");
        System.out.println("Number: " + number);
    }

    public static int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Error: Not a valid integer.");
            return -1;
        }
    }
}
