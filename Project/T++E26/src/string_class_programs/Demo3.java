package string_class_programs;

public class Demo3 
{
	public static void main(String[] args) {
		String s1="Jsp";
		String s2="Qsp";
		String s3="Jsp";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		boolean b1=s1.equals(s2);
		boolean b2=s1.equals(s3);
		boolean b3=s2.equals(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		int i1=s1.hashCode();
		int i2=s2.hashCode();
		int i3=s3.hashCode();
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3
				);
		
	}

}
