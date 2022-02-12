package stack;
import java.util.*;
public class Level2_2 {

	static int solution(int[] priorities, int location) {
		Queue<HashMap<Integer,Integer>> que = new LinkedList<>();
		for(int i =0; i <priorities.length;i++) {
			HashMap<Integer, Integer> map = new HashMap<>();
			map.put(i, priorities[i]);
			que.add(map);
		}
		while(true) {
			if(que.remove().)
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
