public class Rectangle {
    int l, b;
	
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	int Area() {
		int r = l * b;
		System.out.println("the area of rectangle is :" + r);
		return r;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,5);
		r1.Area();
		
		Rectangle r2 = new Rectangle(5,8);
		r2.Area();
	}
}
