package stack;

import java.util.*;
public class Level2_2 {
    class Box{ //map�� ���� �뵵�� ��� 
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
		Arrays.sort(priorities); // �켱���� ������ ���ؼ� ���� ū �������� �̾Ƴ��� ����
        int answer = 1; //��µǴ� ���� 
		int count = priorities.length-1; //priorities �迭�� �ڿ������� Ȯ�� 
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