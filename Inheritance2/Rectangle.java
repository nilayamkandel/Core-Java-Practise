package Inheritance2;

public class Rectangle {
    
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void getArea(){
        int area = length * breadth;
        System.out.println("the area is : " + area);
    }

    void getPerimeter(){
        int perimeter = 2 * (length + breadth);
        System.out.println("the perimeter is : " + perimeter);

    }
}
