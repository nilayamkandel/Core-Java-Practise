import java.util.Scanner;

public class Complex {
    int x, y;
	void sum() {
		int add = x + y;
		System.out.println("the sum is : " + add);
	}
	void diff() {
		int difference = x - y;
		System.out.println("the diff is : " + difference);
	}
	void product() {
		int pro = x * y;
		System.out.println("the sum is : " + pro);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Complex c = new Complex();
		System.out.println("enter the numbers: ");
		c.x = sc.nextInt();
		c.y = sc.nextInt();
		c.sum();
		
		
	}
}
