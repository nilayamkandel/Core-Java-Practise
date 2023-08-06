public class MethodOverloading {
// WAP to show method overloading   
    void printSum(int a, int b){
        int  sum = a + b;
        System.out.println("the total sum is : " + sum);
    }

    void printSum(String a, String b){
        
        System.out.println("the total sum is : " + a + " " + b);
    }
    public static void main(String[] args) {
        MethodOverloading m =  new MethodOverloading();
        m.printSum(20, 30);
        m.printSum("neel", "kandel");
        System.out.println("----------------");

    }
}

