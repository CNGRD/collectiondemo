package methods;

public class  Demo1
{
	public void learn()//non static method
	{
		System.out.println("learn to live");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Demo1 d=new Demo1();//object creation
		d.learn();//accessing non static method with object reference
		System.out.println("main ends");
	}

}
