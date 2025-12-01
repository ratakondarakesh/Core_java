package Day3;

public class Ternary_operator {
	public static void main (String[] args) {
		
		int a = 100;
		int b = 15;
		
		int c = a>b ? 1:2;
		System.out.println(c);
		
		int d = ((a>b) && (a<b)) ? 1:2;
		System.out.println(d);
	}
}
