import java.util.Scanner;

public class array_practise1 {
    // Create an array of 5 floats and calculate their sum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float num[] = new float[3];
        for(int i=0;i<3;i++){
            num[i] = sc.nextInt();
        }
        for(float x : num){
            sum = sum + x;
        }System.out.println("the sum is : " + sum);


    }
   

}
