import java.util.Scanner;

public class arrayProblems {

    public static void main(String[] args) {

// ==================================== ========PROBLEM 1==================================================================
//  Create an array of 5 floats and calculate their sum.

        // float calculateSum[] = new float[5];
        // float sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 5 numbers");

        // for(int i=0; i < calculateSum.length; i++){
        //     calculateSum[i] = sc.nextFloat();
        //     sum = sum + calculateSum[i];
        // }
        // System.out.println("the value of sum is : " + sum);




// ================================================PROBLEM 2=====================================================
// Write a program to find out whether a given integer is present in an array or not

            int findNum[] = new int[5];
            findNum[0] = 1;
            findNum[1] = 13;
            findNum[2] = 12;
            findNum[3] = 14;
// this can also be written as int findNum[] = {1,12,13,14}

            int number;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the integer you are searching");
            number = sc.nextInt();

            for(int x: findNum){
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
