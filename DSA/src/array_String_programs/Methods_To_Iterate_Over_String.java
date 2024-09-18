package array_String_programs;

public class Methods_To_Iterate_Over_String {

	public static void main(String[] args)
	{
		String[] arr= {"Apple","Banana","Orange"};
		
		//First method
		for (String val : arr)
		{
			System.out.println(val+" ");
			
		}
		System.out.println();
		
		//Second method
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		//Third method
		int i=0;
		while(i<=arr.length-1)
		{
			System.out.println(arr[i]+" ");
			i++;
		}
	}

}
