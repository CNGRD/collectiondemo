package methods;

public class Student 
{
	public void name()
	{
		System.out.println("Raj");
	}
	public void branch()
	{
		System.out.println("CSE");
	}
	public static void dob()
	{
		System.out.println("01-jan-1947");
	}
	public static void age()
	{
		System.out.println("18");
	}
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.name();
		s.branch();
		dob();
		age();

	}

}
