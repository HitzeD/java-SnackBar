package snackBar;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double quantity;
	private double cost;
	private int machineId;

	public Snack (String name, double quantity, double cost, int machineId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.machineId = machineId;
	}

// Methods --------------------------------------------

	// get and set id ---------------

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	// get and set name ----------------

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	// get quantity ---------------

	public double getQuantity()
	{
		return quantity;
	}

	// get and set cost ----------------

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	// get and set machine id

	public int getMachine()
	{
		return machineId;
	}

	public void setMachine(int machineId)
	{
		this.machineId = machineId;
	}

	public double addQuantity(int add)
	{
		return quantity = quantity + add;
	}

	public double purchaseStuff(int gone)
	{
		return quantity = quantity - gone;
	}

	public double totalCost()
	{
		return quantity * cost;
	}









}





















