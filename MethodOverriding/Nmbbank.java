package MethodOverriding;

public class Nmbbank extends Centralbank{

    @Override
    protected void getBankName() {
        System.out.println("NMB");
    }

    @Override
    protected void getInterestRate() {
        System.out.println("17%");
    }
    
}
