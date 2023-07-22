import java.util.Scanner;

public class switch_practise2 {
    public static void main(String[] args) {
        System.out.println("enter the character like : -,+,*,/");
        Scanner sc = new Scanner(System.in);
        char Calculation = sc.next().charAt(0);
        
        int a = 8;
        int b = 6;

        switch(Calculation){
            case '+':
            System.out.println("the sum is :" + (a+b));
            break;
            case '-':
            System.out.println("the sum is :" + (a-b));
            break;
            default:
            System.out.println("wrong character");

        }
    }
}
