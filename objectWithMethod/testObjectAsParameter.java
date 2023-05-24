package objectWithMethod;

import java.util.Scanner;

public class testObjectAsParameter {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account acnt = new Account();
		
		acnt.setNumber(sc.nextInt());
		acnt.setName(sc.next());
		acnt.setBalance(sc.nextInt());
		acnt.setType(sc.next());
		acnt.setBankName(sc.next());
		

// since the method is inside the class we make object of class to use the 	method.	
		testObjectAsParameter t = new testObjectAsParameter();
		t.printAccountData(acnt);
		
	}
	
// method ma object pass gareko by making class type variable and making object in main method.
//		object as parameter
	void printAccountData(Account ac) {
		System.out.println("Acc. number : " + ac.getNumber());
		System.out.println("Name : " + ac.getName());
		System.out.println("balance : " + ac.getBalance());
		System.out.println("type : "+ ac.getType());
		System.out.println("Bank : " + ac.getBankName());	
}
}