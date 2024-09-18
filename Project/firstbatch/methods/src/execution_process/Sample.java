package execution_process;

class Sample 
{
	public static void subject()
	{
		System.out.println("subject starts");
		System.out.println("learn JAVA");
		System.out.println("subject ends");
	}
	
	public static void course()
	{
		System.out.println("course starts");
		subject();
		System.out.println("course ends");
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		course();
		
		System.out.println("main ends");

	}

}
