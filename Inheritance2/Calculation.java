package Inheritance2;

public class Calculation {
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
        r.getArea();
        r.getPerimeter();
        System.out.println("");
        Rectangle square = new Square(10);
        square.getArea();
        square.getPerimeter();
        
    }

}
