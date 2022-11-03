package greedy;

import java.io.*;
import java.util.PriorityQueue;
// https://www.acmicpc.net/problem/1715
// 카드 정렬하기
// 카드의 묶음이 있을떄 하나의 묶음으로 만들기위한 비교횟수를 구하는 문제
// 묶음이 여러개 존재하는 경우 가장작은 묶음 두개를 합한뒤 다시 넣어주고 다시 가장작은 묶음 두가지를
// 비교하는 행위를 반복하는 것을 통해 우선순위 큐를 쓰기생각함
public class N1715 {
    public static void main(String[] args) throws IOException {
        // 입출력을 위한 Reader와 Writer 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // N의 경우 총 카드 묶음의 수
        int N = Integer.parseInt(br.readLine());
        // 카드묶음을 오름차순으로 정렬할 우선순위 큐
        // Integer 클래스의 경우 compare 메서드가 구현되어있음으로 오버라이딩하지 않음
        PriorityQueue<Integer> pQue = new PriorityQueue<>();
        // 카드묶음을 우선순위 큐에 넣기위한 for문
        for(int i =0;i<N;i++){
            pQue.add(Integer.parseInt(br.readLine()));
        }
        // 비교횟수를 담을 변수 answer 생성
        int answer = 0;
        // 카드묶음의 수가 마지막 두묶음이 남을떄까지 가장 작은 두묶음씩 묶음
        // 두 묶음을 하나로 합치는 경우 비교횟수가 생기기때문에 비교횟수 변수에 더해줌
        // 이후 우선순위 큐에 넣어 오름차순의 순서를 유지함
        while(pQue.size()>2){
            int value = pQue.poll()+ pQue.poll();
            answer += value;
            pQue.add(value);
        }
        // 그러나 묶음이 1개인 경우에는 비교할 대상이 없기떄문에 비교횟수는 0임
        if(N==1){
            answer = 0;
        }else { // 아닌 경우 남은 두묶음을 합치며 비교횟수를 연산하여 변수에 더해줌
            int temp = pQue.poll() + pQue.poll();
            answer += temp;
        }
        // 이후 비교횟수를 담은 answer 출력
        bw.write(answer+"");
        bw.flush();
        bw.close();
    }
}
