package pojo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        area[] a = new area[2];
        Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<2; i++) {
			area lb = new area();
			
			System.out.println("enter length");
			lb.setLength(sc.nextInt());
			
			System.out.println("enter breadth");
			lb.setBreadth(sc.nextInt());
			
			a[i] = lb;	
	}
		for(area lb : a) {
			System.out.println(lb);
		}
		
	}

}

