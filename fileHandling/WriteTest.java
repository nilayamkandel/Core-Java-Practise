package fileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteTest {
    public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("c://product.txt",true);
		
		file.write("Name = tv\n");
		file.write("Price = 500000\n");
		file.write("Company = samsung\n");
		file.write("Quantity = 800\n");
		
		
		System.out.println("success");
	}
}
