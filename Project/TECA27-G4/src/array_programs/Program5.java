package array_programs;

public class Program5 
{
	public static void main(String[] args) 
	{
		String s1="Motivation";
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
			
			
		}
		System.out.println(reverse);
	}

}
