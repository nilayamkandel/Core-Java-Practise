package Array;
//Write a Java program to sum values of an array.
public class practise5 {
    public static void main(String[] args) {
        int sum = 0;
        int num[] = {2,3,4,5,6,78,9,5};     
        for(int x:num){
            sum = sum + x;
        }System.out.println("the sum is:"+ sum);

    }
}
