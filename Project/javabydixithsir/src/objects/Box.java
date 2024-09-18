package objects;

public class Box 
{
	double len;
	double wid;
	double area;
	Box()
	{
		System.out.println("Box is getting ready!!!");
	}
	Box(double len)
	{
		this();
		this.len=len;
		System.out.println("Length is initialized");
	}
	Box(double len,double wid)
	{
		this(len);
		this.wid=wid;
		System.out.println("Width is Initialized");
	}
	Box(double len,double wid,double area)
	{
		this(len,wid);
		this.area=area;
		System.out.println("Area is Initialized and area of box is :"+area);
		
	}

}
