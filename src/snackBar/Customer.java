package snackBar;;

public class Customer
{
	private int id;
	private String name;
	private double onHand;

	public Customer (String name, double onHand, int id)
	{
		this.name = name;
		this.onHand = onHand;
		this.id = id;
	}

// Methods

	public String getName()
	{
		return name;
	}

	public String setName(String name)
	{
		return this.name = name;
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