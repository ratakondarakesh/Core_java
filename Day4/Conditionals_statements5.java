package Day4;

import java.util.Scanner;
public class Conditionals_statements5 {
	public static void main(String[] args) {
		
		System.out.println("What is your age?");
		Scanner obj = new Scanner(System.in);
		
		int age = obj.nextInt();
		boolean countryCitizen = true;
		
		if (age >= 18) {
			System.out.println("You are old enough to vote.");
			if(countryCitizen) {
				System.out.println("you are countryCitizen, you can vote");
			}else {
				System.out.println("you are not countryCitizen, you cannot vote");
			}
		}else {
			System.out.println("You are not old enough to vote.");
		}
	
		obj.close();
	}
}










