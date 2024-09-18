package programs_on_Object_class;

public class MainClass 
{

	public static void main(String[] args) 
	{
	Book b1=new Book(1,"Wings of fire","Abdul kalam sir",500,1000);
	Book b2=new Book(2,"Power of Sub concious mind","Author",700,80);
	String s1=b1.toString();
	String s2=b2.toString();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println("--------------------------------------------");
	boolean res=b1.equals(b2);
	System.out.println(res);
	System.out.println("********************************************");
	int h1=b1.hashCode();
	int h2=b2.hashCode();
	System.out.println(h1);
	System.out.println(h2);
	}
	

}
