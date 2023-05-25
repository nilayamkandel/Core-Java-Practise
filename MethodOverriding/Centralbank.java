package MethodOverriding;

public class Centralbank {
    protected void getBankName(){
        System.out.println("Central Bank");
    }

    protected void getInterestRate(){
        System.out.println("2%");
    }
     
    public void moneyExRate(){
        System.out.println("$1 = 132");
		System.out.println("yen 10 = 10");
		System.out.println("kdd 1 = 16");
    }
    
}
