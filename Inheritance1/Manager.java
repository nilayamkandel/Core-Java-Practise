package Inheritance1;

public class Manager extends Member{
    String department;

    void office(){
        super.printDetail();
        System.out.println("The department name is : " + department);

    }
}
