package snackBar;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double onHand;

	public Customer (String name, double onHand)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.onHand = onHand;
	}

// Methods

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getOnHand()
	{
		return onHand;
	}

	public double addCash(double pay)
	{
		return onHand = onHand + pay;
	}

	public double purchase(double cash)
	{
		return onHand = onHand - cash;
	}

}