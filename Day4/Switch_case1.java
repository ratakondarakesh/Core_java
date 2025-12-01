package Day4;

public class Switch_case1 {
	public static void main(String[] args) {
		String status = "on_the_way";

		switch (status) {
		    case "ordered":
		        System.out.println("Your food is being prepared.");
		        break;
		    case "on_the_way":
		        System.out.println("Delivery partner is coming to your location.");
		        break;
		    case "delivered":
		        System.out.println("Enjoy your meal!");
		        break;
		    default:
		        System.out.println("Unknown status");
		}

	}

}
