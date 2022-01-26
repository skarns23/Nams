package object;

class Book{
	String title;
	String author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return this.title+", "+this.author;
	}
}
public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("µŒ¿’¿⁄πŸ","¿∫¡æ¥‘");
		System.out.println(book);
		String str = new String("Test");
		System.out.println(str);
	}

}
