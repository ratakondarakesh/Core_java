package Day6;

public class Method5 {
	
	public void checkAge(int Age) {
		if(Age < 18) {
			System.out.println("you are not old enough");
		}else {
			System.out.println("you are old enough");
		}
	}
	public static void main(String[] args) {
		Method5 obj = new Method5();
		obj.checkAge(23);
	}
}
