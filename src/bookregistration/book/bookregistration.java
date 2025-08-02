package bookregistration.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bookregistration {

	private HashMap<String, Book> bk=new HashMap<String, Book>();
	
	void addBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the bkisn");
		String Isbn=sc.nextLine();
		System.out.println("enter the author");
		String author=sc.nextLine();
		System.out.println("enter the title");
		String title=sc.nextLine();
		System.out.println("enter the year");
		String year=sc.nextLine();
		 Book b=new Book(Isbn,author,title,year);
		 if(!bk.containsKey(Isbn))
		 {
			 bk.put(Isbn,b);
		 }
		 else
		 {
			 System.out.println("book is already exist");
		 }		
	}
	
	void removebook(String isbon)
	{
		if(bk.containsKey(isbon)) {
			bk.remove(isbon);
			System.out.println("book is removed");
		}
		else {
			System.out.println("no such book found");
		}		
	}
	
	Book search(String isbn)
	{
		return bk.get(isbn);
	}
	void printall() {
		
	 System.out.println(this.bk);
	}
	
}
