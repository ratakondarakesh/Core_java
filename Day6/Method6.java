package Day6;

public class Method6 {
	public int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Method6 obj = new Method6();
		int result = obj.add(25,25);
		System.out.println(result);
	}
}
