package objectWithMethod;


import java.util.Scanner;

public class testObjectAsReturnType {
    public static void main(String[] args) {
		
		testObjectAsReturnType t = new testObjectAsReturnType();
		Account acnt = t.getAccountData();
		t.printAccountData(acnt);
	}
	
//object as return type	
	Account getAccountData() {
		Scanner sc = new Scanner(System.in);
		
		Account acnt = new Account();
		
		acnt.setNumber(sc.nextInt());
		acnt.setName(sc.next());
		acnt.setBalance(sc.nextInt());
		acnt.setType(sc.next());
		acnt.setBankName(sc.next());
		
		return acnt;
		
	} 
	
	void printAccountData(Account ac) {
		System.out.println("Acc. number : " + ac.getNumber());
		System.out.println("Name : " + ac.getName());
		System.out.println("balance : " + ac.getBalance());
		System.out.println("type : "+ ac.getType());
		System.out.println("Bank : " + ac.getBankName());		
	}
}
