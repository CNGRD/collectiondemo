package sync;
class Pyramid
{
	synchronized void draw_pyramid(char ch)
	{
		for(int i=0;i<5;i+=2)
		{
			for(int j=5-i;j>0;j-=2)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
class A extends Thread
{
	Pyramid p;
	A(Pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('*');
	}
}
class B extends Thread
{
	Pyramid p;
	B(Pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('#');
	}
}
public class SyncTest {

	public static void main(String[] args) {
		Pyramid pobj=new Pyramid();
		A threadA=new A(pobj);
		B threadB=new B(pobj);
		threadA.start();
		threadB.start();
		

	}

}
