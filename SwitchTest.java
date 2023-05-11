import java.util.Scanner;

public class SwitchTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    /*
     * syntax
     * switch(expression){
     *  case 1:
     *      statement;
     *  break;
     * 
     *  case 2:
     *      statement;
     *  break;
     *      .....
     *      .....
     *      ....
     * default:
     * }
     */



//  PROBLEM 1
//  calculate the days of the week
// int day = 3;
// switch (day) {
//     case 1: System.out.println("sunday"); break;
//     case 2: System.out.println("sunday"); break;
//     case 3: System.out.println("sunday"); break;
//     case 4: System.out.println("sunday"); break;
//     case 5: System.out.println("sunday"); break;
//     case 6: System.out.println("sunday"); break;
//     case 7: System.out.println("sunday"); break;
//     default: System.out.println("Enter number from 1 to 7");
// }



// PROBLEM 2
/*
		 * calculate the following post:
		 * post 	basicSalary		Bonus	TotalSalary
		 * .....	..........		.....	...........
		 * MD		35900			20.67%	?
		 * CEO 		23400			18%		?
		 * MANAGER	18700			17.88%	?
		 * HELPER	12789			11%		?
		 */
// String post = "";
// double basicSalary, bonus;
// double totalIncome;

// Scanner sc = new Scanner(System.in);

// System.out.println("Enter either one of the post : MD, CEO, MANAGER, HELPER");
// post = sc.next();

// switch(post){
//     case "MD": 
//     basicSalary = 35900;
//     bonus = 20.67; 
//     totalIncome =  (basicSalary + (20.67 * 35900)/100);
//     System.out.println("the total salary is : " + totalIncome);
//     break;

//     case "CEO":
//     basicSalary = 23400;
//     bonus = 18;
//     totalIncome = (basicSalary + (18*23400)/100);
//     System.out.println("the total salary is : " + totalIncome);
//     break;

//     case "MANAGER":
//     basicSalary = 23400;
//     bonus = 18;
//     totalIncome = (basicSalary + (18*23400)/100);
//     System.out.println("the total salary is : " + totalIncome);
//     break;

//     case "HELPER":
//     basicSalary = 23400;
//     bonus = 18;
//     totalIncome = (basicSalary + (18*23400)/100);
//     System.out.println("the total salary is : " + totalIncome);
//     break;

//     default: System.out.println("no such post");
// }


// PROBLEM 3
// Calculate add/sub/mul/div (+,-,*,/) of two integer value given by user using switch

int n1=0;
int n2 = 0;
String operator;

Scanner sc = new Scanner(System.in);

System.out.println("Enter one number n1");
n1 = sc.nextInt();

System.out.println("Enter second number n2");
n2 = sc.nextInt();

System.out.println("Enter one operator amone add, sub, mul, div");
operator = sc.next();

switch(operator.toLowerCase()){
    case "add":
    System.out.println("the value of sum is : " + (n1 + n2));
    break;

    case "sub":
    System.out.println("the value of sum is : " + (n1 - n2));
    break;

    case "mul":
    System.out.println("the value of mul is : " + (n1*n2));
    break;

    case "div":
    System.out.println("the value of div is : " + (n1/n2));
    break;

    default: 
    System.out.println("no such operator");
}




























     }
}
