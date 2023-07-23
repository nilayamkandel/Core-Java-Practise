package Array;

import java.util.Scanner;

//Write a Java program to find the index of an array element.
public class practise9 {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        System.out.println("enter number between 1 to 5");
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();
        
        for(int i=0;i<num.length;i++){
            num[i] = find;
        }
        System.out.println("the index of the given number is:" + find);
    }
}
