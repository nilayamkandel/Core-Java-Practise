package fileHandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileUsingOutputStream {
    public static void main(String[] args) throws IOException{
		FileOutputStream file = new FileOutputStream("c://morning.txt");
		file.write("welcome".getBytes());
		file.close();
		System.out.println("success");
	}
}
