package thread_programs;

public class Player1 extends Thread
{
	private VolleyBall vb;
	public Player1(VolleyBall vb)
	{
		this.vb=vb;
	}
	//@Overrided
	public void run()
	{
		
		vb.smash();
	}

}
