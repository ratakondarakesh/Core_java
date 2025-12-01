package Day4;

//class contians Feilds And Methods to acess that we need the object of the class

class Our {

	public void first_floor() {
		System.out.println(30);
	}

	public int secound_floor() {
		return 20;
	}
	
}

public class Normal {
	public static void main(String args[]) {

		Our obj = new Our();
		obj.first_floor();
		System.out.println(obj.secound_floor());
		
	}

}
