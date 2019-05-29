package snackBar;

public class Main
{
	private static void vendMachine ()
	{
		Customer jane = new Customer ("Jane", 45.25);
		Customer bob = new Customer ("Bob", 33.14);

		VendingMachine food = new VendingMachine ("Food");
		VendingMachine drink = new VendingMachine ("Drink");
		VendingMachine office = new VendingMachine ("Office");

		Snack chips = new Snack ("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack ("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack ("Pretzels", 30, 2.00, food.getId());
		Snack soda = new Snack ("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack ("Water", 20, 2.75, drink.getId());


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

		// Stretch

		System.out.println("Snack: " + chips.getName() + "\n" + "Machine: " + food.getName() + "\n" + "Amount Left: " + chips.getQuantity() + "\n" + "Total Cost: $" + chips.totalCost() + "\n");
		System.out.println("Snack: " + chocolateBar.getName() + "\n" + "Machine: " + food.getName() + "\n" + "Amount Left: " + chocolateBar.getQuantity() + "\n" + "Total Cost: $" + chocolateBar.totalCost() + "\n");
		System.out.println("Snack: " + pretzel.getName() + "\n" + "Machine: " + food.getName() + "\n" + "Amount Left: " + pretzel.getQuantity() + "\n" + "Total Cost: $" + pretzel.totalCost() + "\n");
		System.out.println("Snack: " + soda.getName() + "\n" + "Machine: " + drink.getName() + "\n" + "Amount Left: " + soda.getQuantity() + "\n" + "Total Cost: $" + soda.totalCost() + "\n");
		System.out.println("Snack: " + water.getName() + "\n" + "Machine: " + drink.getName() + "\n" + "Amount Left: " + water.getQuantity() + "\n" + "Total Cost: $" + water.totalCost() + "\n");

	}

	public static void main(String[] args)
	{
		vendMachine();
	}
}