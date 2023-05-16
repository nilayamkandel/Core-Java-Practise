package classAndobject;

import java.util.Scanner;

public class addInteger {
    static int a;
    static int b;

    static void addNum(){
        int sum =  a +  b;
        System.out.println("the sum is : " + sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        a = sc.nextInt();
        b = sc.nextInt();
        addNum();

        addInteger add = new addInteger();
        add.a = 5;
        add.b = 10;
        add.addNum();

        addInteger sum = new addInteger();
        sum.a = 45;
        sum.b = 23;
        sum.addNum();


        

    }
}
