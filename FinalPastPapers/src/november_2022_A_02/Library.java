package november_2022_A_02;

//  Completed

import java.util.HashMap;
import java.util.Map;

class Book <T>{
	private T bookTitle;
	private T bookISBN;
	
	public Book(T bookTitle, T bookISBN) {
		super();
		this.bookTitle = bookTitle;
		this.bookISBN = bookISBN;
	}

	public T getBookISBN() {
		return bookISBN;
	}
	public T getBookTitle() {
		return bookTitle;
	}
	
}
 
 

public class Library{
	public static void main(String [] args) {
		
		Map<Integer, Book> bookList = new HashMap<Integer, Book>();
		
		Book<String> b1 = new Book<String>("Harry Potter", "ISBN12345");
		bookList.put(1, b1);
		
		Book<String> b2 = new Book<String>("Rings of Power", "123456");
		bookList.put(2, b2);
		
		for (int id : bookList.keySet()) {
			Book value = bookList.get(id);
			System.out.println("Book ID is : " + id + " and the ISBN is : " + value.getBookISBN());
		}
		

	}
}