package pack1;

public class Bubblesort {

	public static void main(String[] args) {
		int arr[]= {5,6,7,8,1,7};//{1,5,6,7,7,8}
		System.out.println("elements before sort");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);
			if(i==arr.length-1)
				break;
				System.out.print(",");
		}
		int temp=0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 1; j < arr.length-i; j++) 
			{
				if (arr[j-1]>arr[j]) 
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println();
		System.out.println("elements after sort");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);
			if(i==arr.length-1)
				break;
				System.out.print(",");
		}
		
	}

}
