package hash;
import java.util.*;
public class Spy {

	static int solution(String[][]clothes) {
		int answer= 1 ;
		HashMap<String,Integer> map = new HashMap<>();
		for(int i = 0 ; i<clothes.length;i++) {
			if(!map.containsKey(clothes[i][1])) {
				map.put(clothes[i][1], 1);
			}
			else
			{
				map.put(clothes[i][1],map.get(clothes[i][1])+1);	
			}
		}
		for(int value :map.values())
			answer*=value+1;
		return answer-1;
	}
	public static void main(String[] args) {
		String[][] str = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(str));
	}

}
