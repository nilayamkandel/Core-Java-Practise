import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        if(salary>=30000){
            System.out.println("good salary");
        }
        else{
            System.out.println("not good");
        }
    }

}
