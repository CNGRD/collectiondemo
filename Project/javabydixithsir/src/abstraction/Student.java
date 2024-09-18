package abstraction;

abstract public class Student 
{
	String name;
	Student(String name)
	{
		this.name=name;
	}
	void attendClass()
	{
		System.out.println("Get knowledge");
	}
	abstract void bunk();
	

}
