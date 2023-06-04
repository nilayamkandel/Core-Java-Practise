package classAndobject;

class pen{
    String type;
    String color;

    public void work(){
        System.out.println("It writes");
    }
    public void showProperty(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class OopsClass {
    public static void main(String args[]){
        pen p1 = new pen();
        p1.type = "gel pen";
        p1.color = "pink";
        p1.work();
        p1.showProperty();
    
        pen p2 = new pen();
        p2.type = "ball pen";
        p2.color = "black";
      }
}
