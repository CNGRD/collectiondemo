package demo1;

public class Teca27G4 
{

	public static void main(String[] args) 
	{
		Teca27G4 t1=new Teca27G4();
		String s1=t1.toString();
		Teca27G4 t2=new Teca27G4();
		boolean b1=t1.equals(t2);
		int h1=t1.hashCode();
		int h2=t2.hashCode();
		System.out.println(t1);
		System.out.println(s1);
		System.out.println(t2);
		System.out.println(b1);
		System.out.println(h1);
		System.out.println(h2);
	}

}
