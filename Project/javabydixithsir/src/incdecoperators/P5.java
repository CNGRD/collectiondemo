package incdecoperators;

public class P5 {

	public static void main(String[] args) {
		int a=-5;
		int b=7;
		int c=a++ + ++b;
		System.out.println(a++);
		System.out.println(b);
		System.out.println(c);
		System.out.println(--a - b-- + --c);
	}

}
