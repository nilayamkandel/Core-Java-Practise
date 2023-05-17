class Student{
    String name;
    int age;

    public void studentWork(){
        System.out.println("i am a student");
    }
    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class ConstructorNonParameterised{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "neel";
        s1.age = 24;
        s1.studentInfo();
    }
    
}