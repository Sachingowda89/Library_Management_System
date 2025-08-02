package bookregistration.book;

public class Book {
  private String bkIsbn;
  private String author;
  private String title;
  private String yearPub;
  public String getBkIsbn() {
	return bkIsbn;
  }
  public void setBkIsbn(String bkIsbn) {
	this.bkIsbn = bkIsbn;
  }
  public String getAuthor() {
	return author;
  }
  public void setAuthor(String author) {
	this.author = author;
  }
  public String getTitle() {
	return title;
  }
  public void setTitle(String title) {
	this.title = title;
  }
  public String getYearPub() {
	return yearPub;
  }
  public void setYearPub(String yearPub) {
	this.yearPub = yearPub;
  }
  public Book(String bkIsbn, String author, String title, String yearPub) {
	super();
	this.bkIsbn = bkIsbn;
	this.author = author;
	this.title = title;
	this.yearPub = yearPub;
	
  }
  @Override
  public String toString() {
	return "Book [bkIsbn=" + bkIsbn + ", author=" + author + ", title=" + title + ", yearPub=" + yearPub + "]";
  }
 
  
}
