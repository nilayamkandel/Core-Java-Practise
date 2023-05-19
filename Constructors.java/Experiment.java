public class Experiment {
// WAP using different name of instance variable  and parameter of constructor name  

    String userName;
	String password;

// here the name of instance variable and parameter of constructor is given different.
    Experiment(String un, String pw){
        userName = un;
        password = pw;
    }
	
	void print() {
		System.out.println("Username : " + userName);
		System.out.println("password : " + password);
	}
	
	public static void main(String[] args) {
// so here we send value of parameter otherwise it give error
		Experiment u = new Experiment("ram","9999");
		u.print();
	}
}
