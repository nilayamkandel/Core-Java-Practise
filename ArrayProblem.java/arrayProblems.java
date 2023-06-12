import java.util.Scanner;
import java.util.Arrays;


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
            // this can also be written as int findNum[] = {1,12,13,14}

            // int findNum[] = new int[5];
            // findNum[0] = 1;
            // findNum[1] = 13;
            // findNum[2] = 12;
            // findNum[3] = 14;
            // int number;
            // Scanner sc = new Scanner(System.in);
            // System.out.println("enter the integer you are searching");
            // number = sc.nextInt();
            // for(int x: findNum){
            //     if(x == number){
            //         System.out.println("number available");
            //         return;
            //     }else{
            //         System.out.println("not found");
            //         return;
            //     }
            // }




// ========================================PROBLEM 3===========================================================
// Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

            
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the marks of the students");
            // int studentMarks[] = new int[5];
            // int sum = 0,  avg;
            // for(int i = 0; i < studentMarks.length; i++){
            //     studentMarks[i] = sc.nextInt();
            // }
            // for(int x: studentMarks){
            //     sum = sum + x;
            // }
            // System.out.println("the total sum is : " + sum);
            // avg = sum/5;
            // System.out.println("the average value is : " + avg);




// =============================================PROBLEM 4===================================================
//  Create a Java program to add two matrices of size 2x3

                // int a[][] = {{1,2,3},{4,5,6}};
                // int b[][] = {{7,8,9},{10,11,12}};
                // int c[][] = new int[2][3];

                // for(int i = 0; i<2; i++){
                //     for(int j = 0; j<3; j++){
                //         c[i][j] = a[i][j] + b[i][j];
                //         System.out.print(c[i][j]+" ");    
                //     }    
                //     System.out.println(); 
                // }




// =================================================PROBLEM 5================================================
// Write a Java program to reverse an array

                    // int arrayNum[] = {1,2,3,4,5};
                    // for(int i = 0; i < arrayNum.length; i++){
                    //     System.out.println(arrayNum[i] + " ");
                    // }
                    // System.out.println("these are the original array");
                    // System.out.println();
                    // System.out.println("Reverse array");
                    // for(int i = arrayNum.length-1; i>=0;i-- ){
                    //     System.out.println(arrayNum[i]+ " ");
                    //


// ============================================PROBLEM 6====================================================
//  Write a Java program to find the maximum element in an array.

                    // int maxNum[] = {10,21,3,14,5};
                    // int max;
                    // for(int i = 0; i < maxNum.length; i++){
                    // }
                    // max = maxNum[0];
                    // for(int i = 1;i<maxNum.length; i++){
                    //     if(maxNum[i] > max){
                    //         max = maxNum[i];
                    //     }
                    // }
                    // System.out.println("the maximum number is : " + max);



// ======================================PROBLEM 7============================================================
// Write a Java program to find whether an array is sorted or not
                    // int data[] = {3,4,5,74,27,69,83,47,92,85,9};
                    // Arrays.sort(data);
                    // System.out.println(Arrays.toString(data));





// =====================================PROBLEM 8===============================================================
// Take array as an input and search for given number x and print index where it occurs.

                    // int size;

                    // Scanner sc = new Scanner(System.in);
                    // System.out.println("Enter the size of number");
                    // size = sc.nextInt(); int searchNum;
                    // boolean found = true;

                    // int findNum[]= new int[size];
                    
                    // System.out.println("Enter the number");
                    // for(int i=0; i<findNum.length; i++){
                    //     findNum[i] = sc.nextInt();
                    // }

                    // System.out.println("enter the number you want to search");
                    // searchNum = sc.nextInt();
                    
                    // for(int i = 0; i<findNum.length; i++){
                    //     if(searchNum == findNum[i]){
                    //         System.out.println("the number is found");
                    //         found = true;
                    //         return;
                    //     }
                    //     found = false;
                        
                    // }
                    // if(found == false){
                    //     System.out.println("not found");
                    // }



// ============================================PROBLEM 9=========================================================
// take input from user and sort the element and find the maximum and minimum

                    
                   
//  Create a Java program to add two matrices of size 2x3

                int a[][] = {{3,2,3},{4,9,6}};
                int b[][] = {{4,8,9},{7,11,12}};
                int c[][] = new int[2][3];

                for(int i = 0; i<2; i++){
                    for(int j = 0; j<3; j++){
                        c[i][j] = a[i][j] + b[i][j];
                        System.out.print(c[i][j]+" ");    
                    }    
                    System.out.println(); 
                }

                   

                    







                    

                    






                    
                    
                   

                    


























    }


}

