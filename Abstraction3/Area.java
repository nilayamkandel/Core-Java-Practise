package Abstraction3;

public class Area extends Shape{
    double area;

    @Override
    void RectangleArea(double length, double breadth) {
        area = length * breadth;
        System.out.println("area of rectangle is :" + area);


    }

    @Override
    void SquareArea(double side) {
        System.out.println("area of square is :" + side * side);
     
    }

    @Override
    void CircleArea(double radius) {
        System.out.println("area  of circle is: " + 3.14*radius*radius);
        
    }
    
}
