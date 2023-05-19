package classAndobject;
public class TriangleUsingConstructor {
    /*
     * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a 
     class named 'Triangle' with constructor having the three sides as its parameters
     */
     int a;
     int b;
     int c;

     TriangleUsingConstructor(int a, int b, int c){
          this.a = a;
          this.b = b;
          this.c = c;
     }

     void getArea(){
          int area = a * b * c;
          System.out.println("the area is : " + area);
     }

     void getPerimeter(){
          int perimeter = a + b + c;
          System.out.println("the area is : " + perimeter);
     }

     public static void main(String[] args) {
          TriangleUsingConstructor t1 = new TriangleUsingConstructor(3,4,5);
          t1.getArea();
          t1.getPerimeter();
          
     }

}
