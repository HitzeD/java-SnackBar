package snackBar;

public class Snack
{
	private int id;
	private String name;
	private double quantity;
	private double cost;
	private int machineId;

	public Snack (int id, String name, double quantity, double cost, int machineId)
	{
		this.id = id;
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

	public int setId(int id)
	{
		this.id = id;
	}

	// get and set name ----------------

	public String getname()
	{
		return name;
	}

	public String setName(String name)
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

	public double setCost(double cost)
	{
		this.cost = cost;
	}

	// get and set machine id

	public int getMachine()
	{
		return machineId;
	}

	public int setMachine(int machineId)
	{
		this.machineId = machineId;
	}

	public double addQuantity()
	{
		
	}

}