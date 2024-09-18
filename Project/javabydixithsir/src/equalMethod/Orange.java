package equalMethod;

public class Orange extends Fruit
{
	private String color;
	private double price;
	private char vitamin;
	Orange(String color,double price,char vitamin)
	{
		this.color=color;
		this.price=price;
		this.vitamin=vitamin;
	}
	public boolean equals(Object o)
	{
		Orange o1=(Orange)o;
		return this.color==o1.color;
	}
	//Getter
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
