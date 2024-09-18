package collections;

public class Demo1 {
	public static void test()
	{
		System.out.println("Hey folks!!!!!!");
	}
	public static int add(int a,int b)
	{
		int res;
		res=a+b;
		test();
		return res;
	}

	public static void main(String[] args) 
	{
		int r=add(5,6);
		System.out.println(r);

	}

}
