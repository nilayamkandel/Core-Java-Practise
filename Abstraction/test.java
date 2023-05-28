package Abstraction;

public class test {
    
    public static void main(String[] args) {
        
        Marks m = new A(50,35,46);
        float x = m.getPercentage();
        System.out.println("the percentage is " + x);
    }
}
