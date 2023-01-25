package exceptionhandling;


import java.util.Arrays;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        String s = "Hello world ";
        List<String> words = splitString(s);
        System.out.println(words);

         s = null;
        words = splitString(s);
        System.out.println(words);
    }

    public static List<String> splitString(String s) {
        try {
            return Arrays.asList(s.split("\\s+"));
        } catch (NullPointerException e) {
            System.out.println("Error: String is null.");
            return null;
        }
    }
}
