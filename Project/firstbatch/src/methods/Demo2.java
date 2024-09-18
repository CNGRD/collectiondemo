package methods;

public class Demo2 
{
	public static int num1;
	public int num2;
	public static void add()//static method
	{
		Demo2 d1=new Demo2();
		num1=10;//static variable
		d1.num2=20;//non static variable
		System.out.println(num1+d1.num2);
	}
	public void sub()//non static method
	{
		num1=20;//static variable
		num2=10;//non static variable
		System.out.println(num1-num2);
		
	}
	public static void main(String[] args) 
	{
		Demo2 d=new Demo2();
		add();
		d.sub();
	}

}
