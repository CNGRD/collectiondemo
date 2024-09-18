package overriding_toString_equals_hashCode;

import java.util.Objects;

public class Book 
{
	private String bookTitle;
	private String bookAuthor;
	private double bookPrice;
	private int bookEdition;
	public Book(String bookTitle, String bookAuthor, double bookPrice, int bookEdition) 
	{
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookEdition = bookEdition;
	}
	@Override
	public String toString() 
	{
		return "Book [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice
				+ ", bookEdition=" + bookEdition + "]";
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(bookEdition);
	}
	@Override
	public boolean equals(Object o1) 
	{
		Book b=(Book)o1;
		return this.bookEdition==b.bookEdition;
		
	}
	

}
