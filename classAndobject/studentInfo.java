package classAndobject;

public class studentInfo {
    int rollNumber;
	int phoneNumber;
	String name;
	String address;
	
	void detailOfStudent() {
		System.out.println("Student name : " + name);
		System.out.println("Student roll number : " + rollNumber);
		System.out.println("Student contact number : " + phoneNumber);
		System.out.println("Student address : " + address);
	}
	
	public static void main(String[] args) {
		studentInfo s1 = new studentInfo();
		s1.name = "Sam";
		s1.rollNumber = 2;
		s1.phoneNumber = 987635284;
		s1.address = "Tikathali-1";
		s1.detailOfStudent();
		System.out.println(" ");
		
		studentInfo s2 = new studentInfo();
		s2.name = "John";
		s2.rollNumber = 2;
		s2.phoneNumber = 987635284;
		s2.address = "Tikathali-1";
		s2.detailOfStudent();
		
	}
}
