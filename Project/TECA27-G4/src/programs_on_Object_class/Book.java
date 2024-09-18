package programs_on_Object_class;

import java.util.Objects;

public class Book 
{
	private int bookId;
	private String bookName;
	private String author;
	private double price;
	private int pages;
	public Book(int bookId, String bookName, String author, double price, int pages) 
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}
	@Override
	public String toString() 
	{
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", pages=" + pages + "]";
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(bookId);
	}
	public boolean equals(Object o1)
	{
		Book b1=(Book)o1;
		double d1=this.price;
		double d2=b1.price;
		boolean res1=(d1==d2);
		return res1;
	}
}
