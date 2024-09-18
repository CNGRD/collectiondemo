package collections;

import java.util.PriorityQueue;

public class Pqueue 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer>  s=new PriorityQueue<Integer>();
		s.add(16);
		s.add(34);
		s.add(43);
		s.add(98);
		s.add(45);
		s.add(77);
		s.add(56);
		s.remove();
		s.remove();
		s.remove();
		s.remove();
		System.out.println(s);
	}

}
