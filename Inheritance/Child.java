package Inheritance;

public class Child extends Parent{
    
    static void output(){
        System.out.println("this is child class");
    }

    public static void main(String[] args) {

       Child c = new Child();
       c.output(); 
       c.print();
       
    }
}
