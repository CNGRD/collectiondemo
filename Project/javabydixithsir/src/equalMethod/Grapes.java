package equalMethod;

public class Grapes extends Fruit
{
	String color;
	double price;
	char vitamin;
	Grapes(String color,double price,char vitamin)
	{
		this.color=color;
		this.price=price;
		this.vitamin=vitamin;
		
	}
	//override Equals
	public boolean equals(Object o)
	{
		Grapes g=(Grapes)o;
		return this.color==g.color;
	}
	//getters
	String getColor()
	{
		return color;
	}
	double getPrice()
	{
		return price;
	}
	char getVitamin()
	{
		return vitamin;
	}
	//setters
	void set(String color,double price,char vitamin)
	{
		this.color=color;
		this.price=price;
		this.vitamin=vitamin;
	}
}
