public class PrintNumber {
    void printn(int a) {
		System.out.println("the value is : " + a);
	}

	void printn(String a) {
		System.out.println("the value is : " + a);
	}
	
	void printn(double a, double b) {
		System.out.println("the value is :  " + a +" " + b);
	}
	
	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		p.printn(3);
		p.printn("2");
		p.printn(2.3, 2.0);
	}
}
