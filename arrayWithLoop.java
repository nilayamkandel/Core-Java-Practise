import java.util.Scanner;

public class arrayWithLoop {

    public static void main(String[] args) {
        System.out.println("Enter the number ofsubject");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] showResult = new int[size];
        

        for(int i=0; i< size; i++){
            System.out.println("enter the marks got in different subject");
            showResult[i] = sc.nextInt(); 
        } 
    }
}
