package Day6;

public class Method7 {
	
	public static int doubleGame(int i) {
		return i*2;
	}
	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
			System.out.println("double of "+ i + " is "+ doubleGame(i));
		}
	}

}
