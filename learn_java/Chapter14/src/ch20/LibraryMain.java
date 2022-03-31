package ch20;

import java.util.ArrayList;

class FastLibrary{
	
	public ArrayList<String> shelf = new ArrayList<String>();
	
	public FastLibrary() {
		shelf.add("ÅÂ¹é»ê¸Æ1");
		shelf.add("ÅÂ¹é»ê¸Æ2");
		shelf.add("ÅÂ¹é»ê¸Æ3");
		/*
		 * shelf.add("ÅÂ¹é»ê¸Æ4"); shelf.add("ÅÂ¹é»ê¸Æ5"); shelf.add("ÅÂ¹é»ê¸Æ6");
		 */
	}
	
	public synchronized String lendBook() throws InterruptedException { //¸Ç ¾Õ¿¡ ÀÖ´Â Ã¥À» ºô¸°´Ù°í °¡Á¤
		Thread t = Thread.currentThread();
		while(shelf.size() == 0) {
			System.out.println(t.getName()+" waiting start");
			wait();
			System.out.println(t.getName()+" waiting end");
			
		}
		if(shelf.size()>0) {
		String book = shelf.remove(0);
		System.out.println(t.getName()+" : "+book +" lend");
		return book;
		}
		else
			return null;
	}
	
	
	public synchronized void returnBook(String book) {
		
		Thread t = Thread.currentThread();
		shelf.add(book);
		notifyAll();
		System.out.println(t.getName()+" : "+book +" return");
		
	}
}

class Student extends Thread{
	
	public Student(String nm) {
		super(nm);
	}
	public void run() {
		
		try {
			String title = LibraryMain.lib.lendBook();
			if(title == null) {
				return ;
			}
			sleep(5000);
			LibraryMain.lib.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
public class LibraryMain {
	public static FastLibrary lib = new FastLibrary();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");
		Student std5 = new Student("std5");
		Student std6 = new Student("std6");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}

}
