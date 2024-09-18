package arrays;

class P1 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3};//static array
		System.out.println(a[0]);
		int[] b=new int[3];
		b[0]=10;
		b[1]=15;
		b[2]=20;
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
	}

}
