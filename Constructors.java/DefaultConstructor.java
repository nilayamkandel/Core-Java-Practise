public class DefaultConstructor {
// write the program showing the used of default constructor passing some default values.
    String userName;
	String password;
	
// ================Default constructor=========================	
	DefaultConstructor(){
		userName = "test";
		password = "1234";
	}
	
	void print() {
		System.out.println("Username : " + userName);
		System.out.println("password : " + password);
	}
	
	public static void main(String[] args) {
//	here DefaultConstructor() is a constructor and  here role of new is to allocate the memory for object.
		DefaultConstructor u = new DefaultConstructor();
		u.print();
	}
}

