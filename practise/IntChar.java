public class IntChar {
    
	void firstMethod(int n, char c) {
		System.out.println("the value is : " + n + " " + c);
	}
	void firstMethod(char c, int n) {
		System.out.println("the value is : " + c + " " + n);
	}
	public static void main(String[] args) {
		IntChar a = new IntChar();
		a.firstMethod('a', 2);
		a.firstMethod(9, 'b');
		
	}

}
