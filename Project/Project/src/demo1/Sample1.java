package demo1;

public class Sample1 
{

	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		System.out.println(s1);
		int a=s1.hashCode();
		System.out.println(a);
		Sample s2=new Sample();
		boolean b=s1.equals(s2);
		System.out.println(b);
		
	}

}
