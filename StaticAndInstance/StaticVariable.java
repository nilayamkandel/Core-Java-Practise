package StaticAndInstance;

public class StaticVariable {
    int rollno;
    String name;
    static String college = "ISMT";

    StaticVariable(int r, String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college + "\n");
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable(11, "neelayam");
        StaticVariable s2 = new StaticVariable(22, "hianshu");

        s1.display();
        s2.display();
    }
}
