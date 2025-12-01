package Day2;

import java.util.Scanner;

public class ScannerExample1 {
	public static void main (String[] args) {
//		Scanner LB = new Scanner(System.in);
//		
//		System.out.println("What is the length of the Rectangle?");
//		int Length = LB.nextInt();
//		
//		System.out.println("what is the breadth of the Rectangle?");
//		int Breadth = LB.nextInt();
//		
//		int Area = Length*Breadth;
//		System.out.println("Area of the Rectangle is "+ Area);
//		LB.close();
		
		int l,b;
		
		Scanner Area = new Scanner(System.in);
		l = Area.nextInt();
		b = Area.nextInt();
		
		System.out.println(l*b);
		Area.close();
	}
}
