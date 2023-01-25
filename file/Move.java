package file;


//Java program to illustrate renaming and
//moving a file permanently to a new location
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

public class Move
{
	public static void main(String[] args) throws IOException
	{
		Path temp = Files.move
		(Paths.get("C:\\Users\\dell\\eclipse-workspace\\File\\filename.txt"),
		Paths.get("C:\\Users\\dell\\Downloads"));

		if(temp != null)
		{
			System.out.println("File renamed and moved successfully");
		}
		else
		{
			System.out.println("Failed to move the file");
		}
	}
}
