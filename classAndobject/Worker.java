package classAndobject;
import java.util.Scanner;

/*
 * Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 
6 hours.
 */

public class Worker {
    int Salary;
	int hours;

	 void getInfo(int Salary, int hours) {
		this.Salary = Salary;
		this.hours = hours;
	}
	
	void AddSal() {
		if(Salary < 500) {
			Salary+= 10;
		}
	}
	
	void AddWork() {
		if(hours > 6) {
			Salary = Salary + 5;
		}	
	}
	
	void result() {
		System.out.println("The salary is : " + Salary);	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary and time");
		int Salary = sc.nextInt();
		int hours = sc.nextInt();
		Worker e = new Worker();
		e.getInfo(Salary,  hours);
		e.AddSal();
		e.AddWork();
		e.result();	
		
	}
}
