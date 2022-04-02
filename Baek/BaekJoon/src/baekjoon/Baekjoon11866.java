package baekjoon;
import java.util.*;
public class Baekjoon11866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int space = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		System.out.print("<");
		int index = space-1;
		for(int i = 1 ;i<=size;i++) {
			que.add(i);
		}
		System.out.print(que.remove(space-1)+", ");
		
		while(!que.isEmpty()) {
			index +=space-1;
			index %=que.size();
			if(que.size()>1) 
				System.out.println(que.remove(index)+", ");
			else
				System.out.println(que.remove(index)+">");
		
		}
		
		
	}

}
