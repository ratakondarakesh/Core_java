package Day6;

public class Method8 {
	public int mymethod(int a, int b) {
		return a + b;
	}
	public double mymethod(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		 Method8 obj = new Method8();
		 int a = obj.mymethod(10, 20);
		 double b = obj.mymethod(20.5, 20.5);
		 
		 System.out.println(a);
		 System.out.println(b);
	}

}
