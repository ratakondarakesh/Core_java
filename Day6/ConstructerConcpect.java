package Day6;

class First {
	int a = 10;
	int b = 90;
	// this keyword is used to refer the present instance variable

	public First(int c, int d) {
		a = c;
		b = d;

	}

	public void printtheconstructervarabiles( ) {
		System.out.println(a);
		System.out.println(b);
	}
}

public class ConstructerConcpect {
	public static void main(String args[]) {
		First obj = new First(20, 30);
		obj.printtheconstructervarabiles();
	}
}



