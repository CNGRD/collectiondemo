//Wap for below requirements
//a]Program for rectangle
//b]rectangle properties are length and width
//c]define a method to claculate area
//d]comapare rectangle using both the dimension
package overriding_toString_equals_hashCode;

import java.util.Objects;

public class Rectangle 
{
	private double length;
	private double width;
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}
	@Override
	public String toString() 
	{
		return "Area of rectangle " +(length*width);
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(length, width);
	}
	@Override
	public boolean equals(Object o1) 
	{
		Rectangle r1=(Rectangle)o1;
		return ((this.length==r1.length)&&(this.width==r1.width));
		
	}
	
	
	
	

}
