package MethodOverriding;

public class test {
    public static void main(String[] args) {
		
        //		static or early binding of object because the value is known before
                Nabilbank nb = new Nabilbank();               
                nb.getBankName();
                nb.getInterestRate();
                
                System.out.println("....");
        //		upcasting means here the class is parent class and constructor is of child class.	
                Centralbank b= new Nmbbank();	
                
                printBankInfo(b);
            }
            
        // late or dynamic binding of object. because it is known during run time. 
        // run time polymorphism. eutai method le output different diyo
           static void printBankInfo(Centralbank b) {
                b.getBankName();
                b.getInterestRate();
                System.out.println("...");
            }
}
