package wrapper_class_Programs;

public class Sample
{
	public static void main(String[] args)
	{
		//BOXING
		int i=9;
		Integer i1=new Integer(i);
		System.out.println(i1);//implicit call to toString()
		
		boolean b=i1.equals(i1);
		System.out.println(b);
		
		int rv=i1.hashCode();
		System.out.println(rv);
		
		//UNBOXING
		int i2=i1.intValue();
		System.out.println(i2);
		
		
	}

}
