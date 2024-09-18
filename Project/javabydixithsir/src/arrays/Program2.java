package arrays;

public class Program2 
{
	public static void main(String[] args) 
	{
		int[] a2=new int[9];
		for(int i=0;i<=a2.length-1;i++)
		{
			a2[i]=i+1;
			if(i==3)
			{
				System.out.println(a2[i]+" is the fourth element");
			}
		}
	}

}
