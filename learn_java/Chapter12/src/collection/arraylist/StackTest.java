package collection.arraylist;
import java.util.ArrayList;
class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<>();
	public void push (String data) {
		arrayStack.add(data);
	}
	public String pop() {
		if( arrayStack.size()==0) {
			System.out.println("Stack is empty");
			return null;
		}
		String data =arrayStack.remove(arrayStack.size()-1);
		return data;
	}
}
public class StackTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack =new MyStack();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
