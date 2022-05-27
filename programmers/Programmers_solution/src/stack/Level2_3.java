package stack;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_3 {
	
	public int solution(int bridge_length,int weight,int[] truck_weights) {
		int answer = 0;
		Queue<Integer> que = new LinkedList<>();
		int sum_weight = 0;
		for(int i :truck_weights) {
			while(true) {
				if(que.isEmpty()) {
					que.add(i);
					answer++;
					sum_weight +=i;
					break;
				}
				else if (bridge_length == que.size()) {
					sum_weight-=que.poll();
				}
				else {
					if(sum_weight+i<=weight) {
						que.add(i);
						answer++;
						sum_weight+=i;
						break;
					}
					else {
						answer++;
						que.add(0);
					}
					
				}
			}
		}
		return answer+bridge_length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.ceil((double)10/7));
	}

}
