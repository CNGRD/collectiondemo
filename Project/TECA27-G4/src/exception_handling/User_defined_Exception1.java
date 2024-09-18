package exception_handling;

class DingaException extends Exception
{
	public String toString()
	{
		return "Exception occured";
	}
	
}
public class User_defined_Exception1 
{
	public static void main(String[] args) throws DingaException  
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println(i);
			}
			else
			{
				throw new DingaException();
			}
		}
	}

}
