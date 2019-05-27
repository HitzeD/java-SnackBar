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
		System.out.println("1:");
		jane.purchase(soda.getCost() * 3);
		soda.purchaseStuff(3);
		System.out.println("Jane: $" + jane.getOnHand());
		System.out.println(soda.getQuantity() + " Sodas \n");
		// 2:
		System.out.println("2:");
		jane.purchase(pretzel.getCost());
		pretzel.purchaseStuff(1);
		System.out.println("Jane: $" + jane.getOnHand());
		System.out.println(pretzel.getQuantity() + " Pretzels \n");
		// 3:
		System.out.println("3:");
		bob.purchase(soda.getCost() * 2);
		soda.purchaseStuff(2);
		System.out.println("Bob: $" + bob.getOnHand());
		System.out.println(soda.getQuantity() + " Sodas \n");
		// 4:
		System.out.println("4:");
		jane.addCash(10);
		System.out.println("Jane: $" + jane.getOnHand() + "\n");
		// 5:
		System.out.println("5:");
		jane.purchase(chips.getCost());
		chips.purchaseStuff(1);
		System.out.println("Jane: $" + jane.getOnHand());
		System.out.println(chips.getQuantity() + " Chips \n");
		// 6:
		System.out.println("6:");
		pretzel.addQuantity(12);
		System.out.println(pretzel.getQuantity() + " Pretzels \n");
		// 7:
		System.out.println("7:");
		bob.purchase(pretzel.getCost() * 3);
		pretzel.purchaseStuff(3);
		System.out.println("Bob: $" + bob.getOnHand());
		System.out.println(pretzel.getQuantity() + " Pretzels \n");

	}

	public static void main(String[] args)
	{
		vendMachine();
	}
}