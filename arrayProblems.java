import java.util.Scanner;

public class arrayProblems {

    public static void main(String[] args) {

// ==================================== ========PROBLEM 1==================================================================
//  Create an array of 5 floats and calculate their sum.

        float calculateSum[] = new float[5];
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");

        for(int i=0; i < calculateSum.length; i++){
            calculateSum[i] = sc.nextFloat();
            sum = sum + calculateSum[i];
        }
        System.out.println("the value of sum is : " + sum);
        








    }
}
