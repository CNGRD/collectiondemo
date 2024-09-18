package overriding_toString_equals_hashCode;

public class MainClass3 
{

	public static void main(String[] args) 
	{
		Rectangle rec1=new Rectangle(2.4,3.6);
		Rectangle rec2=new Rectangle(2.5,6.4);
		
		System.out.println(rec1);
		System.out.println(rec2);
		boolean res=rec1.equals(rec2);
		System.out.println(res);
		int h1=rec1.hashCode();
		int h2=rec2.hashCode();
		System.out.println(h1);
		System.out.println(h2);

	}

}
