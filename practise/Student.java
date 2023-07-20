public class Student {
    String name;
	int roll_no;
	
	void studentDetail() {
		System.out.println("the name is : " + name);
		System.out.println("the roll_no is : " + roll_no);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "john";
		s.roll_no = 2;
		s.studentDetail();
	}
}
