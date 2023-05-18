package classAndobject;

// Print the average of three numbers entered by user by creating a class named 'Average' having a method 
// to calculate and print the average.

import java.util.Scanner;

public class Average {
    int n1;
	int n2;
	int n3;
	
	
	void Calculate() {
		double avg;
		avg = (n1 + n2 + n3)/3.0;
		System.out.println("the average value is : " + avg);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three number");
		
		Average a1 = new Average();
		
		a1.n1 = sc.nextInt();
		a1.n2 = sc.nextInt();
		a1.n3 = sc.nextInt();
		
		a1.Calculate();
		
	}
	
	
}
