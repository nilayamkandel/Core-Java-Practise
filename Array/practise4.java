package Array;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class practise4 {
    public static void main(String[] args) {
        
        int num[] = {4,3,7,2,0,0,1};
        System.out.println("converting to string" + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("the sorted nums are:" + Arrays.toString(num));
       
        
}
}

