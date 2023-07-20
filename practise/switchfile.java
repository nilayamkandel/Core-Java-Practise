import java.util.Scanner;

public class switchfile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the post : md,ceo,manager,helper ");
        String post = sc.next();
        double basicSalary;
        double bonus;
        double totalSalary;
        
        switch(post){
            case "md":
            basicSalary = 2000;
            bonus = 0.05*basicSalary;
            totalSalary = basicSalary + bonus;
            System.out.println("the salary of md is : " + totalSalary);
            break;

            case "ceo":
            basicSalary = 2200;
            bonus = 0.05*basicSalary;
            totalSalary = basicSalary + bonus;
            System.out.println("the salary of md is : " + totalSalary);
            break;

            case "manager":
            basicSalary = 2400;
            bonus = 0.07*basicSalary;
            totalSalary = basicSalary + bonus;
            System.out.println("the salary of md is : " + totalSalary);
            break;

            case "helper":
            basicSalary = 2500;
            bonus = 0.02*basicSalary;
            totalSalary = basicSalary + bonus;
            System.out.println("the salary of md is : " + totalSalary);
            break;

            default:
            System.out.println("invalid position");


        }

    }
}
