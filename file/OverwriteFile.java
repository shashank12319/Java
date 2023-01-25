package file;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OverwriteFile {

    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Input the contents of the file."
                + "\n===================================");
        
        String content = scObj.nextLine();
        scObj.close();
        try {
            FileWriter writerObj = new FileWriter("C:\\Users\\dell\\eclipse-workspace\\File\\demofile.txt", false);
            writerObj.write(content);
            writerObj.close();

            System.out.println("================================\n"
                    + "File successfully overwritten.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}