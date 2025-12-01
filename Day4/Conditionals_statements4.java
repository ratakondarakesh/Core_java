package Day4;

import java.util.Scanner;
public class Conditionals_statements4 {
	public static void main(String[] args) {
		
		System.out.println("Type any number.");
		Scanner input = new Scanner(System.in);
	
		int num = input.nextInt();
		
		
		if(num < 0) {
			System.out.println("number is negative.");
		}else if(num > 0) {
			System.out.println("number is positive.");
		}else {
			System.out.println("number is 0.");
		}
		
		input.close();
	}
}
