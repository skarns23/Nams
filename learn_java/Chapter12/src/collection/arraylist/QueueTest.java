package collection.arraylist;
import java.util.*;

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	public String deQueue() {
		int len = arrayQueue.size();
		if(len ==0) {
			System.out.println("Queue is empty");
			return null;
		}
		
		return arrayQueue.remove(0);
	}
	public String peek() {
		int len = arrayQueue.size();
		if(len ==0) {
			System.out.println("Queue is empty");
			return null;
		}
		
		return arrayQueue.get(arrayQueue.size()-1);
	
	}
	
}
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
