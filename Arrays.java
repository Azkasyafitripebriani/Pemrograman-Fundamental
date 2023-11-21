import java.util.Scanner;

 class Systemprogram {
	public static void main(String[] args) {
		String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot chocolate"};
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		// check if the imput is an integer
		if (sc.hasNextInt()) {
			
			choice = sc.nextInt();
			
			// check if the choice is within the valid range
			if (choice >= 0 && choice < menu.length) {
				String selectedDrink = menu[choice];
				System.out.println(selectedDrink);
			} else {
				System.out.println("Invalid");
			}
		} else {
			System.out.println("Invalid input. please enter a valid integer.");
		}
		
		sc.close();
	}
}