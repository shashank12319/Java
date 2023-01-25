package exceptionhandling;


import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        // Case 1: No null strings
        List<String> strings1 = Arrays.asList("abc", "def", "ghi");

        try {
            processStrings(strings1);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // Case 2: One null string
        List<String> strings2 = Arrays.asList("abc", null, "ghi");

        try {
            processStrings(strings2);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void processStrings(List<String> strings) throws NullPointerException {
        for (String s : strings) {
            if (s == null) {
                throw new NullPointerException("Error: String is null.");
            }
            // processing code goes here
        }
    }
}

