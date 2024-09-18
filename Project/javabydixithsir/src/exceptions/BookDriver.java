package exceptions;

public class BookDriver {

	public static void main(String[] args) {
		Book b=null;
		b.price=100;
		System.out.println(b.price);//NullPointerException

	}

}
