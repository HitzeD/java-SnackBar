package snackbar;

public class VendingMachine
{
	private int id;
	private String name;

	public VendingMachine (int id, String name)
	{
		this.id = id;
		this.name = name;
	}

// Methods

	// get and set id's

	public int getId()
	{
		return id;
	}

	public int setId(int id)
	{
		this.id = id;
	}

	// get and set name's

	public String getName()
	{
		return name;
	}

	public String setName(String name)
	{
		this.name = name
	}

}