package Inheritance;

public class PrivateParentChildTest {
    
    public static void main(String[] args) {

        PrivateParentExperiment p = new PrivateParentExperiment();
        p.print();

        PrivateChildExperiment c = new PrivateChildExperiment();
        c.output();

        c.print();
        

    }
}
