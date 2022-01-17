package baekjoon;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Baekjoon2164 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Queue<Integer> que = new LinkedList<Integer>(); //Queue생성할때 기본 구조 
		for(int i=1;i<num+1;i++) //ArrayList로 진행할 경우 속도의 문제 발생
			que.add(i);
		while(que.size()!=1)
		{
			que.remove();
			que.add(que.remove());
		}
		System.out.print(que.remove());
	}

}
