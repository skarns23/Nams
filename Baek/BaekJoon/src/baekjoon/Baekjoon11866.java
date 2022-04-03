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
		int count = 0;
		for(int i = 1 ; i<=size;i++) {
			que.offer(i);
		}
		while(true) {
			count++;
			int num = que.poll();
			if(count%space == 0 &&que.size()>0) {
				System.out.print(num+", ");
				continue;
			}
			else if((count%space == 0 )&&(que.size()==0)){
				System.out.println(num+">");
				break;
			}
			count %=space;
			que.add(num);
		}
		
		
	}

}
