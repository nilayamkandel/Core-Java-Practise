package Inheritance1;

public class Employee extends Member{

    String specialization;

    void special(){
        super.printDetail();
        System.out.println("the specialization is : " + specialization);
        
    }
   
   
}
