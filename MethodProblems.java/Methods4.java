import java.util.Scanner;
public class Methods4 {
// add two integer asking from user

    static int addTwoNum(int n1, int n2){
        int sum = n1 + n2;
        
        return sum;
        

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int n1 = sc.nextInt();

    System.out.println("enter the second number");
    int n2 = sc.nextInt();

    int sum = addTwoNum(n1, n2);
    System.out.println(sum);
    
}
}
