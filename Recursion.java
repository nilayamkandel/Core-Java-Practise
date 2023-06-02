import java.util.Scanner;
public class Recursion {
    //EXAMPLE - 1 [Print from 5-1]
    // public static void printNumb(int n) {
    //     if(n==0){
    //         return;
    //     }
    //     //this helps to print the value
    //     System.out.println(n);
    //     //function have to call itself
    //         printNumb(n-1); 
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printNumb(n);
    // }


   // EXAMPLE-2 [Print from 1-5]
    public static void printNumb(int n){
        if (n ==6){
            return;
        }
        System.out.println(n);
        printNumb(n + 1);

    }
    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }






































}
