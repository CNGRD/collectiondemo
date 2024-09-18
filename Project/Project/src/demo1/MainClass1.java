package demo1;

public class MainClass1 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee(231,"nik",81000.3);
		Employee e2=new Employee(232,"nithin",41000.3);
		System.out.println(e1);
		System.out.println(e2);
		boolean res=e1.equals(e2);
		System.out.println(res);
		int h1=e1.hashCode();
		int h2=e2.hashCode();
		System.out.println(h1);
		System.out.println(h2);
	}

}
