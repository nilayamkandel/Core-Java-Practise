import java.util.Scanner;

public class Methods6 {
// find the factorial of the number

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter one number");
    int n = sc.nextInt();

    factorialNum(n);
    
}

static void factorialNum(int n){
    if(n < 0){
        System.out.println("invalid factorial");   
        return;
    }
    int factorial = 1;
    for (int i = n; i >= 1; i--){
        factorial = factorial * i;
    }
    System.out.println("the factorial is : " + factorial);

}

}

