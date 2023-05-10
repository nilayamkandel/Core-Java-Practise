import java.util.Scanner;

public class takeFromUser {
    
    public static void main(String[] args){
        String name;
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);   
        name = sc.next();
        System.out.println("my name is : "  + name);
                
    }
}
