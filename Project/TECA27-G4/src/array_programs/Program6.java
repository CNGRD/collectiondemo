package array_programs;

public class Program6 
{
	public static void main(String[] args) 
	{
		String s1="Motivation";
		char[] ch=new char[10];
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println("array elements are "+i);
			ch[i]=s1.charAt(i);
		}
		System.out.println("reverse of array elements");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}

}
