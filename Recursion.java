import java.util.Scanner;
public class Recursion {
    //EXAMPLE - 1 [Print from 5-1]
    public static void printNumb(int n) {
        if(n==0){
            return;
        }
        //this helps to print the value
        System.out.println(n);
        //function have to call itself
            printNumb(n-1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumb(n);
    }
}
