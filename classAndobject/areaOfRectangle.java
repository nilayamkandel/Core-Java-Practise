package classAndobject;
import java.util.Scanner;
// Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
// First method named as 'setDim' takes length and breadth of rectangle as parameters and the second 
// method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered 
// through keyboard.

public class areaOfRectangle {
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
		
		areaOfRectangle a1 = new areaOfRectangle();
		System.out.println("Enter the size of length");
		a1.l = sc.nextInt();
		
		System.out.println("Enter the size of breadth");
		a1.b = sc.nextInt();
		
		a1.getArea();

    }
    
}
