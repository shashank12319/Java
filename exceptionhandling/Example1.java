package exceptionhandling;



import java.util.Arrays;

@SuppressWarnings("unused")
public class Example1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int element = getElement(array, 2);
        System.out.println("Element at index 2: " + element);

        element = getElement(array, 5);
        System.out.println("Element at index 5: " + element);
    }

    public static int getElement(int[] array, int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
            return -1;
        }
    }
}
