package array;

public class Book {
	private String bookName;
	private String author;
	public Book() {}
	public Book(String bookName,String  author)
	{
		this.author=author;
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showInfor()
	{
		System.out.println(this.bookName+", "+this.author);
	}
}
