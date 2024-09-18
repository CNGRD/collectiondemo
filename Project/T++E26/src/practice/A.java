package practice;

public class A 
{
	public static void main(String[] args)
	{
		Integer i3=new Integer(10);
		Integer i4=10;
		System.out.println(i3==i4);
		
		Double d=13.9;//Implicit boxing
		System.out.println(d);//implicit call to toString()
		double d1=d;//Implicit unboxing
		System.out.println(d1);
	}

}
