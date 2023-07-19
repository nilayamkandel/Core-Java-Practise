public class geometry {
    void area(int l, int b) {
        int a = l*b;
        System.out.println("the value of a is :" + a);
    }
    void area(int s) {
        int b = s*s*s;
        System.out.println("the value of b is :" + b);
    }
    
    public static void main(String[] args) {
       geometry g = new geometry();
       g.area(2, 3);
       g.area(4);
   }
}
