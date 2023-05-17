package classAndobject;

public class Student {
    String name;
	int roll_no;
	
	void studentDetail() {
		System.out.println("my name is : " + name);
		System.out.println("my roll number is : " + roll_no);
		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "john";
		s1.roll_no = 2;
		s1.studentDetail();
	}
}
