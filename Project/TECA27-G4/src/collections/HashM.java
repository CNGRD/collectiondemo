package collections;

import java.util.HashMap;

public class HashM 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"Raja");
		h.put(2,"Rani");
		h.put(3,"Senapathi");
		h.put(4,"Bahubali");
		h.put(5,"Jansi");
		System.out.println(h);
		System.out.println(h.get(4));
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.containsKey(3));
		System.out.println(h.containsValue("Jansi"));
		System.out.println(h.replace(4,"Prabhas"));
		System.out.println(h);
		System.out.println(h.replace(3,"Senapathi","Rana"));
		System.out.println(h);
		System.out.println(h.remove(3));
		System.out.println(h);
		System.out.println(h.remove(4,"Prabhas"));
		System.out.println(h);
		System.out.println(h.size());
	}

}
