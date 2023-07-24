package Array;

import java.util.Scanner;

//Write a Java program to test if an array contains a specific value.
public class practise8 {

    //trick 1 to solve

    // public static void main(String[] args) {
    //     System.out.println("enter the number you are searching");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     boolean found = false;

    //     int num[] = {2,3,4,5,6,7,8};
    //     for(int x: num){
    //         if(n ==x){
    //             found = true;
                 
    //             break;
                   
    //         }
    //     }
    //     if(found){
    //         System.out.println(n + " it exists" );
    //     }
    //     else{
    //         System.out.println(n + " doesn't exist" );
    //     }
    // }

    //trick 2 to solve
        static boolean findNum(int[] num,int item){
            for(int x: num){
                if(x==item){
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to search");
        int item = sc.nextInt();
        System.out.println(findNum(num,item));

        


       
    }
    
}
