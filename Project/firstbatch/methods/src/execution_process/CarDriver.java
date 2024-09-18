package execution_process;

class CarDriver 
{

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Car c=new Car();
		c.speed();
		c.distance();
		c.time();
		System.out.println("main ends");

	}

}
