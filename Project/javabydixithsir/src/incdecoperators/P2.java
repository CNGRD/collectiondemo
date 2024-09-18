package incdecoperators;

public class P2 
{

	public static void main(String[] args) 
	{
		int a=20;
		int b=-10;
		int c=a + ++b;
		int d=a++ - b++ + ++c;
		System.out.println(a+","+b+","+c+","+d);

	}

}
