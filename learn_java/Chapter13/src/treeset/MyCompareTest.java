package treeset;
import java.util.*;


class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2)*-1;
	}
	
}
public class MyCompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Kim");
		set.add("Nam");
		set.add("Park");
		
		System.out.println(set);
	}

}
