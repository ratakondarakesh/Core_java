package Day4;

import java.util.Scanner;

public class Conditional_statements2 {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("what are your marks?");
		int marks = Sc.nextInt();
		
		
		if(marks>=90) {
			System.out.println("you got 'A' grade");
		}else if(marks>=80) {
			System.out.println("you got 'B' grade");
		}else if(marks>=70) {
			System.out.println("you got 'C' grade");
		}else if(marks>=60) {
			System.out.println("you got 'd' grade");
		}else {
			System.out.println("you got 'Failed'");
		}Sc.close();
		
	}
}
