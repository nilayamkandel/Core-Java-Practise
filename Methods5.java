import java.util.Scanner;

public class Methods5 {
// wap to multiply 2 number and return the product

    static int mulNum(int a, int b){
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = mulNum(a,b);
        System.out.println("mul : " + mul);

    }
}
