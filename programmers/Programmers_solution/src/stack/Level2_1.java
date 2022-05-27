package stack;
import java.util.*;
public class Level2_1 {


	static int [] solution(int[] progresses,int[] speeds) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<progresses.length;i++) {
			int pro  = progresses[i];
			int spd = speeds[i];
			int count = 0;
			while(pro<100) {
				pro +=spd;
				count++;
			}
			list.add(count);
		}
		int fir = list.get(0);
		int count =1;
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i= 1; i<list.size();i++) {
			if(list.get(i)<=fir) {
				count++;
			}
			else {
				ans.add(count);
				count=1;
				fir = list.get(i);
			}
		}
		ans.add(count);
		int[] answer = new int [ans.size()];
		for(int i =0; i<ans.size();i++) {
			answer[i] = ans.get(i);
			System.out.println(answer[i]);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int [] {95, 90, 99, 99, 80, 99};
		int[] spd = new int [] {1, 1, 1, 1, 1, 1};
		solution(arr,spd);
	}

}
