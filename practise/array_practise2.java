import java.util.Scanner;

public class array_practise2 {
//Write a program to find out whether a given integer is present in an array or not.
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num[] = new int [3];
        for(int i=0; i<3; i++){
            System.out.println("enter the number");
            num[i] = sc.nextInt();
        }
        int number;
        
        System.out.println("enter the value you are searching");
        number = sc.nextInt();
        for(int x: num){
            if(x == number){
                System.out.println("number available");
                return;
            }else{
                System.out.println("not found");
                return;
            }
        }   
      
        
    }
}
