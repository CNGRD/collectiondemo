package demo1;

public class Sample2 
{

	public static void main(String[] args) 
	{
		Sample2 s1=new Sample2();
		int res=s1.hashCode();
		System.out.println(s1);
		System.out.println(res);
		Sample2 s2=new Sample2();
		int res1=s2.hashCode();
		System.out.println(s2);
		System.out.println(res1);
		
	}

}
