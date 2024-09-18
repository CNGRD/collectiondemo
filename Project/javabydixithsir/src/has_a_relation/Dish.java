package has_a_relation;

class Dish
{
	private String dName;
	private double price;
	public int length;
	//getter
	String getDname()
	{
		return dName;
	}
	double getPrice()
	{
		return price;
	}
	//setters
	void setDname(String dName)
	{
		this.dName=dName;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	//CONSTRUCTORS
	Dish()
	{
		
	}
	Dish(String dName,double price)
	{
		setDname(dName);
		setPrice(price);
	}
	
}
