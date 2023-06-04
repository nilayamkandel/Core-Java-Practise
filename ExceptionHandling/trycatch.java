package ExceptionHandling;

public class trycatch {
    public static void main(String[] args) {
        try{
            int a = 100/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("the value of a is : " );
    }
}
