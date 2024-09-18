package methods;

class Sample1 
{
	public static int num;//default value is 0
	public static char ch;//default value is empty character
	public static boolean b;//default value is false
	public static double d;//default value is 0.0
	public static String n;//default value is null
	
	public static void add()
	{
		System.out.println(num);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(d);
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		add();
	}

}
