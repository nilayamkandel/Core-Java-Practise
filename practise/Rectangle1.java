import java.util.Scanner;

public class Rectangle1 {
    int l, b;
	Rectangle1(int l, int b){
		this.l = l;
		this.b = b;
	}
	
	int returnArea() {
		int area = l * b;
		System.out.println("the value of area is : " + area);
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and breadth");
		int len = sc.nextInt();
		int bed = sc.nextInt();
		
		Rectangle1 r1 = new Rectangle1(len,bed);
		r1.returnArea();
		
		
		
		
	}
}
