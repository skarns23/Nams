package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1966
// 프린터 큐 
// 프린터의 문서의 중요도 순으로 출력하며, 찾기로 한 위치의 문서가 출력되는 순서를 찾아야한다.
public class N1966 {
	
	
	public static void main(String[] args) throws IOException{
		
		// 우선 순위에 따라 정렬을 위한 우선 순위 큐 
		PriorityQueue<Value> pQue = new PriorityQueue<>();
		// 실제 순서대로 값을 담을 Queue
		Queue<Value> que = new LinkedList<>();
		
		// 입력을 위한 BufferedReader와 결과 문자열을 담을 StringBuilder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 총 케이스의 수를 담을 N 
		int N =  Integer.parseInt(br.readLine());
		for(int i = 0 ;i<N;i++) { // 총 케이스의 수만큼 반복하는 반복문 
			
			String str = br.readLine(); // 수열의 길이와 찾을 문서의 위치를 str에 받아옴
			// 수열의 값을 받기 위한 StringTokenizer
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int size = Integer.parseInt(str.split(" ")[0]); // 수열의 크기 값 추출
			int goalIndex = Integer.parseInt(str.split(" ")[1]); // 찾을 문서의 위치 값 추출 
			int count = 0 ; // 찾을 문서가 출력되는 순서를 위한 변수 
			for(int j = 0 ; j<size;j++) { // 수열의 값을 담는 과정 
				Value v = new Value(Integer.parseInt(st.nextToken()),j);
				pQue.add(v);
				que.add(v);
			}
			
			
			// 우선순위가 같고, 목표로 하는 인덱스의 인스턴스를 뽑는 경우 종료되는 while문
			while(true) { 
				// 우선 순위 큐의 정렬된 우선순위 값과 같은 경우 
				// 추출을 진행합니다.
				if(que.peek().priority == pQue.peek().priority) {
					if(que.peek().index == goalIndex) { // 추출하는 인스턴스의 인덱스가 목표 인덱스 인경우 
						count++; // 순서를 증가시키고, 결과 값에 담은 다음 종료
						sb.append(count+"\n");
						break;
					} // 인덱스 값이 다른 경우 
					count++; // 뽑는 순서 값을 증가시키고 우선 순위큐와 일반 큐 추출 
					que.poll();
					pQue.poll();
				}else {
					que.add(que.poll()); // 우선 순위 값이 다른 경우 큐의 값을 가장 뒤로 넣음 
				}
			}
			que.clear();
			pQue.clear();
		}
	
		
		System.out.println(sb.toString());
	}

}

// 우선 순위큐와 큐에 담을 Value 클래스 
class Value  implements Comparable<Value>{
	// 비교를 위한 Comparable 인터페이스 구현 
	int priority; // 우선 순위 담기
	int index;  // 해당 우선 순위의 인덱스 값 담기
	public Value (int priority, int index) {
		this.priority = priority;
		this.index = index; 
	}
	@Override
	public int compareTo(Value o) {
		// 우선 순위에 대해 내림 차순 정렬 
		return o.priority-this.priority;
	}
	
}
