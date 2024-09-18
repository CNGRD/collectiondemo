package oops_concepts;


class Human
{
	private String name; 
	private int age;
	
	public String getName()
	{
		return name;
	}
	public void setName(String a)
	{
		name=a;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int b)
	{
		age=b;
	}
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Human obj=new Human();
		obj.setName("Nithin");
		obj.setAge(25);
		String myName=obj.getName();
		int myAge=obj.getAge();
		System.out.println(myName);
		System.out.println(myAge);

	}

}
