package stack;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_3_1 {
	class Truck{
		int weight;
		int len;
		public Truck(int we) {
			this.weight = we;
			this.len=1;
		}
		public void moving() {
			len++;
		}
	}
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0 ;
		Queue<Truck> wait = new LinkedList<>();
		Queue<Truck> on_bridge = new LinkedList<>();
		for(int i : truck_weights) {
			wait.offer(new Truck(i));
			
		}
		int sum_weight = 0 ;
		
		while(!wait.isEmpty() || !on_bridge.isEmpty()) {
			answer++;
			if(on_bridge.isEmpty()) {
				Truck tr = wait.poll();
				sum_weight  +=tr.weight;
				wait.offer(tr);
				continue;
			}
			for(Truck t : on_bridge) {
				t.moving();
			}
			if(on_bridge.peek().len >bridge_length) {
				Truck tr = on_bridge.poll();
				sum_weight -= tr.weight;
			}
			if(!wait.isEmpty() && sum_weight+wait.peek().weight<=weight ) {
				Truck tr = wait.poll();
				sum_weight+=tr.weight;
				on_bridge.offer(tr);
				
			}
			
		}
			
		return answer;
	}


}
