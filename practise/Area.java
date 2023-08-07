

import java.util.Scanner;

public class Area {
	int l;
	int b;

	void setDim(int len, int bth) {		
	}	
	int getArea(){
		int area = l * b;
		System.out.println("The area of a rectangle is : " + area);
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Area a1 = new Area();
		System.out.println("Enter the size of l");
		a1.l = sc.nextInt();
		
		System.out.println("Enter the size of b");
		a1.b = sc.nextInt();
		
		a1.getArea();

    }
		
		
	

}
