package methods;

class Laptop 
{
	public void brand()
	{
		System.out.println("HP");
	}
	public static void ram()
	{
		System.out.println("8GB RAM");
	}
	public static void main(String[] args) 
	{
		Laptop l=new Laptop();
		l.brand();
		ram();
	}

}
