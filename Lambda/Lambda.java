package Lambda;
interface show{
    void run();
}

public class Lambda {
    public static void main(String[] args) {
        show obj = () -> System.out.println("hello world");
            
        
      obj.run();
    }
    
}
