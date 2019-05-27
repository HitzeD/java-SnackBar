package snackBar;

public class Main
{
	private static void vendMachine ()
	{
		Customer jane = new Customer ("Jane", 45.25, 1);
		Customer bob = new Customer ("Bob", 33.14, 2);

		VendingMachine food = new VendingMachine (1, "Food");
		VendingMachine drink = new VendingMachine (2, "Drink");
		VendingMachine office = new VendingMachine (3, "Office");

		Snack chips = new Snack (1, "Chips", 36, 1.75, 1);
		Snack chocolateBar = new Snack (2, "Chocolate Bar", 36, 1.00, 1);
		Snack pretzel = new Snack (3, "Pretzels", 30, 2.00, 1);
		Snack soda = new Snack (4, "Soda", 24, 2.50, 2);
		Snack water = new Snack (5, "Water", 20, 2.75, 2);


		System.out.println("jane: " + jane.getOnHand());
		System.out.println("bob: " + bob.getOnHand());

	}

	public static void main(String[] args)
	{
		vendMachine();
	}
}