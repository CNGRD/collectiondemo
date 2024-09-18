package equalMethod;

public class Box1Driver {

	public static void main(String[] args) 
	{
		Box1 b1=new Box1(10);
		Box1 b2=new Box1(10);
		//compare
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
	}

}
