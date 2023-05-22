package Inheritance1;

public class Info {

    public static void main(String[] args) {

    Employee e = new Employee();
    e.Name = "neel";
    e.Age= 34;
    e.Address = "lalitpur";
    e.phoneNumber = "9876543";
    e.Salary = 90000;
    e.specialization = "Software engineer";
    e.special();

    System.out.println(" ");

    Manager m = new Manager();
    m.Name = "himanshu";
    m.Age = 23;
    m.Address = "balkot";
    m.phoneNumber = "9876352";
    m.Salary = 8000;
    m.department = "Computer Engineering Department";
    m.office();
    

    }

}
