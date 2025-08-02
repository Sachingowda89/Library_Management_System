package bookregistration.book;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookregistration lib=new bookregistration();
		
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("\n 1.Add Book");
			System.out.println("\n 2.remove Book");
			System.out.println("\n 3.search Book");
			System.out.println("\n 4.deisplay Book");
			System.out.println("\n 5.exit Book");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			sc.nextLine(); 
			switch(ch)
			{
			case 1:{
				lib.addBook();
				break;
			}
			case 2:{

		         System.out.println("remove the book");
		         String isbn=sc.nextLine();
		         lib.removebook(isbn);
				break;
			}
			case 3:{
		    	System.out.println("enter the isbn to search");
		        String isbn=sc.next();
		        Book b=lib.search(isbn);
		        if (b!=null)
		        {
		        	System.out.println(b);
		        }
		        else
		        	System.out.println("no book found");
				break;
			}
			case 4:{
				lib.printall();
				break;
			}case 5:{
				System.exit(0);
				break;
			}
			default:
				throw new IllegalArgumentException("unexpected");
			
			}
		}
		
	}

}