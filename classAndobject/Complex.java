package classAndobject;
// Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with 
//separate methods for each operation whose real and imaginary parts are entered by user.

import java.util.Scanner;

public class Complex {
    double real;
	double img;
	
	void sum() {
		double sum = real + img;
		System.out.println("the value of sum is : " + sum);
	}
	
	void difference() {
		double diff = real - img;
		System.out.println("the value of difference is : " + diff);
		
	}
	
	void product() {
		double multiply = real * img;
		System.out.println("the value of product is : " + multiply);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Complex s1 = new Complex();
		
		System.out.println("Enter the real number");
		s1.real = sc.nextDouble();
		System.out.println("Enter the imaginary number");
		s1.img = sc.nextDouble();
		s1.sum();
		System.out.println(" ");
		
		Complex d1 = new Complex();
		System.out.println("Enter the real number");
		d1.real = sc.nextDouble();
		System.out.println("Enter the imaginary number");
		d1.img = sc.nextDouble();
		d1.difference();
		System.out.println(" ");
		
		Complex p1 = new Complex();
		System.out.println("Enter the real number");
		p1.real = sc.nextDouble();
		System.out.println("Enter the imaginary number");
		p1.img = sc.nextDouble();
		p1.product();
		System.out.println(" ");
		
		
	}
    
}
