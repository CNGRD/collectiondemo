package demo1;

public class MainClass2 
{

	public static void main(String[] args) 
	{
		Employee1  e1=new Employee1(100,"Dinga",50000.01);
		Employee1  e2=new Employee1(101,"Dingi",50000.01);
		String s1=e1.toString();
		String s2=e2.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("------------------------");
		boolean b1=e1.equals(e2);
		System.out.println(b1);
		System.out.println("------------------------");
		int h1=e1.hashCode(); 
		int h2=e2.hashCode();
		System.out.println(h1);
		System.out.println(h2);
		
	}

}
