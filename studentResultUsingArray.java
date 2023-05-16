import java.util.Scanner;

public class studentResultUsingArray {
    
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number of students");

       int size = sc.nextInt();

       String studentName[] = new String[size];
       int social[] = new int[size];
       int science[] = new int[size];
       int roll[] = new int[size];
       double percentage;

       for(int i = 0; i<size; i++){
            
            System.out.println("student detail : " + (i+1));

            System.out.println("Roll number : " );
            roll[i] = sc.nextInt();

            System.out.println("Name : "  );
            studentName[i] = sc.next();

            System.out.println("Marks in science : ");
            science[i] = sc.nextInt();

            System.out.println("Marks in social : ");
            social[i] = sc.nextInt();


            System.out.println(" ");
       }
            
            System.out.println("Roll number |   Student Name | Percentage |   Remarks  |" );
            System.out.println("------------------------------------------------------------");

            for(int i=0; i<size; i++){
            percentage = (science[i] + social[i])/2.0;
            String remarks;
            System.out.println("    " + roll[i] + "       |    " + studentName[i]+ "       |  " +  percentage + "%" + "   |  " + " Remarks");
            
            // if(percentage >= 80){
            //     System.out.println("Distinction");
                
            // }
            // else if(percentage >= 60 ){
            //     System.out.println("first divison");
               
            //     }
            // else if(percentage >= 40){
            //     System.out.println("second division");  
                
            // }
            // else{
            //     System.out.println("work hard");
                
            // }

            System.out.println(" ");
        
    }
}


}

    
 
       
        


    


