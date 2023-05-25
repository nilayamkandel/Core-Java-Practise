package MethodOverriding;

public class Nabilbank extends Centralbank {

    @Override
    protected void getBankName() {
        System.out.println("Nabil bank");
    }

    @Override
    protected void getInterestRate() {
        System.out.println("13%");
    }

    
}
