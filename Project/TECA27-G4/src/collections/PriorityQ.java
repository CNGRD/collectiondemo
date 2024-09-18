package collections;

import java.util.PriorityQueue;

public class PriorityQ 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> s1=new	PriorityQueue<Integer>();
		s1.add(25);
		s1.add(30);
		s1.add(18);
		s1.add(20);
		s1.add(8);
		s1.add(15);
		s1.add(9);
		System.out.println(s1);
		Integer a=45;
		System.out.println(s1.contains(a));
		
		
		}

}
