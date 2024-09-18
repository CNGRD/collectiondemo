package arrays;

public class TwoDByteArray 
{
	public static void main(String[] args) 
	{
		byte[][] b=new byte[2][4];
		b[0][1]=4;
		b[0][2]=0;
		b[0][3]=0;
		b[0][0]=0;
		b[1][2]=4;
		b[1][0]=0;
		b[1][1]=0;
		b[1][3]=0;
		System.out.println(b.length);
		System.out.println(b[0][1]);
		System.out.println(b[1][2]);
		

	}

}
