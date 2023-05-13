import java.util.Scanner;

public class Methods3 {
// print name using method
    static void writeName(String name){
        System.out.println(name);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("What is your name?");
        String name = sc.next();
       writeName(name);       
    }
}

