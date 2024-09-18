package array_String_programs;

import java.util.Arrays;

public class Sort_String_Array {

	public static void main(String[] args) 
	{
		String[] arr = { "Apple",   "Cat",    "Ball", "Cartoon", "Banana", "Avocado" };
		//sort
		Arrays.sort(arr);
		for(String str:arr)
		{
			System.out.println(str+" ");
		}

	}

}
