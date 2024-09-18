package overriding_toString_equals_hashCode;

public class MainClass 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee("TYS1187","Rakesh",2000.02);
		Employee e2=new Employee("TYS1189","chota Ganesh",2000.02);
		String res1=e1.toString();
		String r=e2.toString();
		System.out.println(res1);
		System.out.println(r);
		System.out.println("-----------------------");
		boolean res2=e1.equals(e2);
		System.out.println(res2);
		System.out.println("----------------------");
		int h1=e1.hashCode();
		int h2=e2.hashCode();
		System.out.println(h1);
		System.out.println(h2);
		
	}

}
