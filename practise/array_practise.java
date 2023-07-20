import java.util.Scanner;

//WAP to store and print total price, avg price of 5 books

public class array_practise {
    public static void main(String[] args) {
        int sum =0 ;int avg;
        Scanner sc = new Scanner(System.in);
        int books[] = new int[2];

        for(int i=0;i<2;i++){
            System.out.println("enter book price");
            books[i] = sc.nextInt();
        } 
        for(int x: books){
            sum = sum +x;
        }System.out.println("the sum of book is: " + sum);
        avg = sum/2;
        System.out.println("the avg is :" + avg);

    }
    
}
