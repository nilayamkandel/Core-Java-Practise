class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age  = s2.age;
    }
    
    Student(){}
}

public class Copy1Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "neel";
        s1.age = 24;
        
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
