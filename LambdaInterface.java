@FunctionalInterface
interface A{
    void show();
}


public class LambdaInterface {

    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
                System.out.println("hello");
            }
        };
        obj.show();
    }
    
}
