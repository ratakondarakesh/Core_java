package Day3;

public class unary_operators {
	public static void main (String[] args) {
		
		int a= 10;
		int b= 15;
		boolean c = true;
		boolean d = false;
		
		// Unary plus and minus
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(+b);
		System.out.println(-b);
		
		// Increment operators
		
		// pre-increment
		System.out.println(++a);
		System.out.println(++b);
		
		// post-increment
		System.out.println(a++);
		System.out.println(b++);
		
		 // Decrement operators
		
		// pre-Decrement
		System.out.println(--a);
		System.out.println(--b);
		
		// post-Decrement
		System.out.println(a--);
		System.out.println(b--);
		
		// Logical NOT
		System.out.println(!c);
		System.out.println(!d);
	}
}
