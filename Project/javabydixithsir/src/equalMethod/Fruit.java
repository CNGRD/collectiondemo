package equalMethod;

public class Fruit 
{
	private String name;
	private String color;
	//getters
	String getName()
	{
		return name;
	}
	String getColor()
	{
		return color;
	}
	//setters
	void set(String name,String color)
	{
		this.name=name;
		this.color=color;
	}
	Fruit()
	{
		
	}
	Fruit(String name,String color)
	{
		this.name=name;
		this.color=color;
	}
	//override equals
	public boolean equals(Object o)
	{
		Fruit f=(Fruit)o;
		return this.color==f.color;
	}

}
