package questions_on_exception;

public class Q4 
{
	public static void main(String[] args) 
	{
		try
		{
			int[] arr= {1,2,3,4};
			for(int i=0;i<=4;i++)
			{
				System.out.println("array elements are"+arr[i]);
			}
		}
		
		catch(ArrayIndexOutOfBoundsException rv)
		{
			System.out.println("ArrayIndexOutOfBoundException "+rv);
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}
		finally
		{
			System.out.println("Finally block executed ");
		}
	}

}
