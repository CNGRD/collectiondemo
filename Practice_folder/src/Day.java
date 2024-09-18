
public class Day 
{
	public static int count=1;
	public static void wish()
	{
		if(count<=5)
		{
			System.out.println("Good Morning");
		}
		count++;
		wish();
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		wish();
		System.out.println( "Main Ends");
	}

}
