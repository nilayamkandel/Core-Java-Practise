package fileHandling;
import java.io.File;
import java.util.Arrays;
public class FileTest {
    public static void main(String[] args) {
		File file = new File("c://product.txt");
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		
		File folder = new File("c://java8am");
		folder.mkdir();
		
		// get all file names from folder
		String[] fileNames = folder.list();
		System.out.println(Arrays.toString(fileNames));
		
		//get all files from folder
		File[] files = folder.listFiles();
		System.out.println();
	}
}
