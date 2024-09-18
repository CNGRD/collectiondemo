package thread_programs;

public class VolleyBall 
{
	synchronized public void pass()
	{
		System.out.println("Pass the ball");
		notify();
	}
	synchronized public void smash()
	{
		try 
		{
			wait();
		} 
		catch (InterruptedException e) 
		
		{
			
			e.printStackTrace();
		}
		System.out.println("Smash the ball");
	}
}
