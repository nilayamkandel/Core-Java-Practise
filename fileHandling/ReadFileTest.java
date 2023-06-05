package fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileTest {
    public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("c://product.txt");
		BufferedReader br = new BufferedReader(file);
		String line;
		
		while((line = br.readLine())!= null) {
			System.out.println(line);
		}
	}
}
