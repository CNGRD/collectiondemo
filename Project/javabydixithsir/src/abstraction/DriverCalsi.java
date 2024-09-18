package abstraction;

public class DriverCalsi {

	public static void main(String[] args) 
	{
		CalsiVer1 v=new CalsiVer1();
		BasicCalsi b=new BasicCalsi();
		ClasiVer2 v2=new ClasiVer2();
		int r1=v.add(3, 4);
		System.out.println(r1);
		int r2=v.add(4,5,6);//15
		System.out.println(r2);
		int r3=v.sub(3, 2);
		System.out.println(r3);
		double r4=v.power(2, 3);
		System.out.println(r4);
		int r5=b.add(3,5,6);//14
		System.out.println(r5);
		int r6=b.add(3, 4);
		System.out.println(r6);
		int r7=b.sub(5, 3);
		System.out.println(r6);
		int r8=v2.add(3,7,8);//18
		System.out.println(r8);
		double r9=v2.square(2);
		System.out.println(r9);
		int r10=v2.add(3, 4);
		System.out.println(r10);
		double r11=v2.cube(3);
		System.out.println(r11);
		int r12=v2.sub(5, 8);
		System.out.println(r12);
	}

}
