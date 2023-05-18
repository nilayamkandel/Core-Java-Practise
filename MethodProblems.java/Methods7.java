import java.util.Scanner;

public class Methods7 {
// WAP to find SI and amount as input, processing and output

    static void inputNum(){
        double p = 30000;
        int t = 3;
        double r = 9.3;
        
        processingNum(p, t, r);

    }

    static void processingNum(double p, int t, double r){
        double amount,  SI;
        SI = (p*t*r)/100; 
        amount =  p +  SI;

        output(amount, SI);
    }

    static void output(double amount, double SI ){
        System.out.println("the value of amount is " + amount);
        System.out.println("the value of SI is : " + SI);
    }


    public static void main(String[] args) {
       inputNum();

        
        
    }
    
}
