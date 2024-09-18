package collections;

import java.util.HashSet;

public class HashSet1 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(67);
		h.add(27);
		h.add(85);
		System.out.println(h);
		int hash=h.hashCode();
		System.out.println(hash);
	}

}
