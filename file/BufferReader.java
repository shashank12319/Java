package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
  public static void main(String[] args) {
    String filePath = "demofile.txt";
	
    String currentWorkingDirectory = System.getProperty("user.dir");
    System.out.println("Current working directory: " + currentWorkingDirectory);
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

