package equalMethod;

public class BoxDriver 
{

	public static void main(String[] args) 
	{
		Box b1=new Box(10);
		Box b2=b1;
		//compare
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}
