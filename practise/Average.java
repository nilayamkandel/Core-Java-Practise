public class Average {
    int a = 2;
	int b = 2;
	int c = 3;
	
	void Calculate() {
		int sum = a+b+c;
		System.out.println("the sum is : " + sum);
		int avg = sum/3;
		System.out.println("==================");
		System.out.println("the average is : " +avg);
		System.out.println("-------------");
	}


	
	public static void main(String[] args) {
		Average a = new Average();
		a.Calculate();
	}
}
