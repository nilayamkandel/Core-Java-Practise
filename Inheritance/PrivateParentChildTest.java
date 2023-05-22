package Inheritance;

public class PrivateParentChildTest {
    
    public static void main(String[] args) {

        PrivateParent p = new PrivateParent();
        p.print();

        PrivateChild c = new PrivateChild();
        c.output();

        c.print();
        

    }
}
