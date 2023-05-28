package Abstraction4;

import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        Area a[] = new Area[2];
        Scanner sc = new Scanner(System.in);

        for(int i= 0; i<2; i++){
            Area a1 = new Area();
            a1.RectangleArea(sc.nextDouble(), sc.nextDouble());

            a1.SquareArea(sc.nextDouble());

            // a1.CircleArea(sc.nextDouble());
            a[i] = a1;

        }

        for(int i = 0; i <3; i++){
            Area a2 = new Area();
            a2.CircleArea(sc.nextDouble());
            a[i] = a2;
        }
        
        


        





       
    }
}
