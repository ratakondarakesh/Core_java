package Day5;

public class While_loop1 {
	public static void main(String[] args) {
		
		int dice = 1;
		
		while(dice <= 6) {
			
			if(dice < 6) {
				System.out.println("no yatzy");
			}else {
				System.out.println("yatzy");
			}dice += 1;
		}
		System.out.println(dice);
	}
	
}
