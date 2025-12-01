package Day6;

public class Method4 {
	public void myMethod(String name, int age) {
		System.out.println(name+" is "+ age);
	}
	
	public static void main(String[] args) {
		Method4 obj = new Method4();
		obj.myMethod("Rakesh", 23);
		obj.myMethod("ganesh", 24);
		obj.myMethod("Rahul", 25);
		
		
	}
}
