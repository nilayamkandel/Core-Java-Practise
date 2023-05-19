package classAndobject;
// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a 
// class named 'Triangle' without any parameter in its constructor.

public class Triangle {
    int a;
    int b;
    int c;

    void getArea(){
        double area = 0.5*(b*c);
        System.out.println("the area is : " + area);

    }

    void getPerimeter(){
        int perimeter = a + b + c;
        System.out.println("the perimeter is : " + perimeter);
    }

    Triangle(){}

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.a = 3;
        t1.b = 4;
        t1.c = 5;

        t1.getArea();
        t1.getPerimeter();
    }




}
