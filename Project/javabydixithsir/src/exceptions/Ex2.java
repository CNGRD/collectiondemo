package exceptions;

public class Ex2 
{
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer();
		System.out.println(str);
		System.out.println(str.capacity());
		StringBuffer str1=new StringBuffer("Java");
		System.out.println(str1);
		System.out.println(str1.capacity());
		str1.append("Python");
		System.out.println(str1);
		System.out.println(str1.capacity());
		
	}

}
