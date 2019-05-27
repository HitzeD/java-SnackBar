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


		// 1:
		System.out.println("1: \n");
		jane.purchase(soda.getCost() * 3);
		soda.purchaseStuff(3);
		System.out.println("jane: " + jane.getOnHand());
		System.out.println(soda.getQuantity());
		// 2:
		System.out.println("2: \n");
		jane.purchase(pretzel.getCost());
		pretzel.purchaseStuff(1);
		System.out.println("Jane: " + jane.getOnHand());
		System.out.println(pretzel.getQuantity());
		// 3:
		System.out.println("3: \n");
		bob.purchase(soda.getCost() * 2);
		soda.purchaseStuff(2);
		System.out.println("bob: " + bob.getOnHand());
		System.out.println(soda.getQuantity());
		// 4:
		System.out.println("4: \n");
		jane.addCash(10);
		System.out.println(jane.getOnHand());
		// 5:
		System.out.println("5:\n");
		jane.purchase(chips.getCost());
		chips.purchaseStuff(1);
		System.out.println("jane: " + jane.getOnHand());
		System.out.println(chips.getQuantity());
		// 6:
		System.out.println("6: \n");
		pretzel.addQuantity(12);
		System.out.println(pretzel.getQuantity());
		// 7:
		System.out.println("7: \n");
		bob.purchase(pretzel.getCost() * 3);
		pretzel.purchaseStuff(3);
		System.out.println("Bob: " + bob.getOnHand());
		System.out.println(pretzel.getQuantity());

	}

	public static void main(String[] args)
	{
		vendMachine();
	}
}