package execution_process;

class Watch
{
	public static int count=5;
	public int puppies=3;
	public void color()
	{
		String color="black";
		System.out.println("color of dog :"+color);
		System.out.println("Number of dogs:"+count);
		System.out.println("Number of puppies:"+puppies);
	}
	public static void bark()
	{
		String sound="bow-bow";
		System.out.println("Sound "+sound);
		System.out.println("Number of dogs:"+count);
		Watch w=new Watch();
		System.out.println("Number of puppies:"+w.puppies);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Watch w=new Watch();
		w.color();
		bark();
		System.out.println("main ends");
		

	}

}
