package stack;

import java.util.*;
public class Level2_2 {
    class Box{ //map과 같은 용도로 사용 
		int index;
		int pri;
		public Box(int index,int pri) {
			this.index = index;
			this.pri = pri;
		}
	}
    public int solution(int[] priorities, int location) {
        Queue<Box> que = new LinkedList<>();
		for(int i=0; i<priorities.length;i++)
			que.add(new Box(i,priorities[i]));
		Arrays.sort(priorities); // 우선순위 정렬을 통해서 가장 큰 순위부터 뽑아내기 위함
        int answer = 1; //출력되는 시점 
		int count = priorities.length-1; //priorities 배열을 뒤에서부터 확인 
		while(!que.isEmpty()) {
			Box now = que.poll(); 
			if(now.pri ==priorities[count] && now.index ==location) {
				break;
			}
			else if(now.pri ==priorities[count] && now.index !=location)
			{
				count--;
                answer++;
			}
			else {
				que.add(now);
			}
		}
		
		return answer;
    }
}