package thread_programs;

public class Player2 extends Thread
{
	private VolleyBall vb;
	public Player2(VolleyBall vb)
	{
		this.vb=vb;
	}
	//@Overrided
	public void run()
	{
		vb.pass();
		
	}

}
