import java.util.Scanner;

public class area1 {
    int l,  b;
	void setDim(int len, int bth) {
		
	}
	int getArea() {
		int area =  l*  b;
		System.out.println("the area of rectangle is:");
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		area1 a = new area1();
		a.l = sc.nextInt();
		a.b = sc.nextInt();
		a.getArea();
		
	}
}
