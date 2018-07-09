package Javava;


class Book
{
	public void Bookdetails(String book, int page)
	{
		System.out.println(book+"  "+ page);
	}}
public class Must {

	public static void main(String[] args) {
	Book b1 = new Book();
	b1.Bookdetails("Sky", 45);
	Book b2 = new Book();
	b2.Bookdetails("Hidi", 75);
		
	
	}

}
