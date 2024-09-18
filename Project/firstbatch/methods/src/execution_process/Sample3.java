package execution_process;

class Sample3 
{
	public static int count=3;
	public String color="Blue";
	
	public static void marker()
	{
		System.out.println("marker count is :"+count);
		System.out.println("marker color is "+new Sample3().color);
	}
	public void job()
	{
		System.out.println("Marker job is to write");
		System.out.println("marker details:");
		marker();
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Sample3 s=new Sample3();
		s.job();
		System.out.println("number of faculty:"+count);
		System.out.println("Shirt color of Faculty :"+s.color);
		System.out.println("main starts");

	}

}
