package Inheritance3;

public class Square extends Rectangle{
    void getSquare(){
        super.getShape();
        super.getRectangle();
        System.out.println("square is a rectangle");
    }
}
