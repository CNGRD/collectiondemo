package methods;

class Car 
{
	public void distance()
	{
		double speed=60.0;
		double time=2.0;
		double d=speed*time;
		System.out.println("distance travelled by car :"+d);
	}
	public void speed()
	{
		double distance=120.0;
		double time=3.0;
		double s=distance/time;
		System.out.println("Speed of the car:"+s);
	}
	public void time()
	{
		double distance=250.0;
		double speed=110.0;
		double t=distance/speed;
		System.out.println("Time taken by car:"+t);
	}
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




