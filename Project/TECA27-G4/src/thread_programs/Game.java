package thread_programs;

public class Game 
{

	public static void main(String[] args) 
	{
		VolleyBall vb=new VolleyBall();
		Player1 p1=new Player1(vb);
		Player2 p2=new Player2(vb);
		p1.start();
		p2.start();
	}

}
