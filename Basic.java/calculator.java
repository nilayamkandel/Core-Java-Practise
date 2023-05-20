import java.util.*;
public class calculator {
   

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose one of the operation");
        int sum = a + b;
        System.out.println(sum);
        int sub = a - b;
        System.out.println(sub);
        int mul = a * b;
        System.out.println(mul);
        int div = a / b;
        System.out.println(div);
        int modulo = a % b;
        System.out.println(a % b);
    }
}

