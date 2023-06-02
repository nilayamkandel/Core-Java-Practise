package Polymorphism;
// WAP using same method but different datatype to justify polymorphism
// polymorphism with method overloading.
// 1. changing data type name
// 2. adding more parameter 
public class polygon {
            
    void Square(int a) {
        System.out.println(" the value of a is : " + a);       
      }
      
    void Square(String a) {
        System.out.println(" the value of a is : " + a);       
      }
      
     
public static void main(String[] args) {
          polygon p = new polygon();
          p.Square(1);
          p.Square("1");
        }
}

