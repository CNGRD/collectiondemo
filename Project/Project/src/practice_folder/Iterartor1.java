package practice_folder;

import java.util.Enumeration;
import java.util.Vector;

public class Iterartor1 
{

	public static void main(String[] args) 
	{
		Vector<Double> b1=new Vector<Double>();
		b1.add(3.4);
		b1.add(6.7);
		b1.add(7.8);
		b1.add(2.4);
		b1.add(5.6);
		Enumeration<Double> i1=b1.elements();
		System.out.println(i1.hasMoreElements());
		System.out.println(i1.nextElement());
		System.out.println(i1.nextElement());
		
	}

}
