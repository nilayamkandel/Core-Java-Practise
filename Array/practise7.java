package Array;

import javax.swing.event.SwingPropertyChangeSupport;

// Write a Java program to calculate the average value of array elements.
public class practise7 {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8};
        int sum =0; double avg;
        for(int x: num){
             sum = sum + x;
        } 
        System.out.println("the sum is: " + sum);
        avg= sum/8;
        System.out.println("the average is: "+ avg);
    }
    

    
}
