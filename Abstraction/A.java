package Abstraction;

public class A extends Marks{
    float total;

    A(int a, int b, int c){
       
        total = a + b+ c;
    }

    @Override
    float getPercentage() {
       float percentage;
       percentage = (total)/3;


        return percentage;
    }

   
    
}
