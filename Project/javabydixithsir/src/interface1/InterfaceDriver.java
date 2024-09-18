package interface1;

public class InterfaceDriver {

	public static void main(String[] args) {
		BasicCalci b=new BasicCalci();
		CalciVer1 c1=new CalciVer1();
		CalciVer2 c2=new CalciVer2();
		System.out.println("Addition with varargs: "+b.add(5,4));
		System.out.println("Addition :"+b.add(3, 7));
		System.out.println("Subtraction :"+b.sub(10, 5));
		c1.add(2,3,3);
		c1.add(5, 5);
		c1.power(5, 2);
		c1.sub(15, 5);
		c2.add(3,4,5,6);
		c2.add(10, 50);
		c2.cube(5);
		c2.square(3);
		c2.sub(15, 7);
	}

}
