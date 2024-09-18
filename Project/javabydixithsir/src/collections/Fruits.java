package collections;

public class Fruits {
	String color;
	int price;
	Fruits(String color,int price)
	{
		this.color=color;
		this.price=price;
	}
	public int compareTo(Object o)
	{
		Fruits f=(Fruits)o;
		if(price==f.price)
		{
			return 0;
		}
		else if(price>f.price)
		{
			return 1;
		}
		else
			
			return -1;
	}
	

}
