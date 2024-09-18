package exception_handling;

public class CheckVoting 
{
	public void checkAge(int age) throws Exception
	{
		if(age>=18)
		{
			System.out.println("age is legal");
		}
		else
		{
			throw new Exception("age is illegal");
		}
	}
	
	public static void main(String[] args) throws Exception 0
	
	{
		CheckVoting c1=new CheckVoting();
		c1.checkAge(16);
		
	}

}
