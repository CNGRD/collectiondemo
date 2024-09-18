package objects;
class Book
{
	
}
 class BookExample2 {

	public static void main(String[] args) {
		Book b1=new Book();
		Book b2=b1;
		Book b3=b2;
		System.out.println(b1==b2);
		System.out.println(b1==b3);
		System.out.println(b2==b3);
	}

}
