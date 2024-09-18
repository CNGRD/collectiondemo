package sync;
class Square
{
	synchronized void drawSquare(char ch)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
			  System.out.print(" ");
			}
			for(int k=1;k<=4;k++)
			{
				System.out.print(" "+ch);
			}
			System.out.println();
		}
	}
}
class Demo extends Thread
{
	Square s;
	Demo(Square s)
	{
		this.s=s;
	}
	public void run()
	{
		s.drawSquare('*');
	}
}
class Sample extends Thread
{
	Square s;
	Sample(Square s)
	{
		this.s=s;
	}
	public void run()
	{
		s.drawSquare('#');
	}
}
public class SyncTest1 {

	public static void main(String[] args) {
		Square s=new Square();
		Demo d=new Demo(s);
		Sample sam=new Sample(s);
		d.start();
		sam.start();
		
	}

}
