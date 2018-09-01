package Javava;

class Book2 {
	String dBook;
	int Dpage;

	public void Bookdetails(String book, int page) {
		dBook = book;
		Dpage = page;
	}

	public void display() {

	System.out.println(dBook + "  " + Dpage);
	}

}

public class Must2 {

	public static void main(String[] args) {
		Book2 b1 = new Book2();
		b1.Bookdetails("ravi", 23);
		b1.display();
		Book2 b2 = new Book2();
		b2.Bookdetails("ramu", 21);
		b2.display();

	}

}
