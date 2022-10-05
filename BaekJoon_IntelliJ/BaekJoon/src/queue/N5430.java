package queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5430
// AC
// 정수 배열에 R은 뒤집기 D는 첫번째 수버리기이며, 모든 함수를 진행한뒤 남는 것을 출력하는 문제 
public class N5430 {

    // 문제 해결을 위한 DeQue 생성
    static Deque<Integer> dQue = new LinkedList<>();
    // 결과 값을 담을 StringBuilder 생성
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위한 BufferedReader와 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 총 테스트 케이스의 수 N
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // flag의 경우 값을 뽑는 위치를 설정  true -> 맨 앞, false -> 맨 뒤
            boolean flag = true;

            // stop의 경우 덱이 비어있는데 뽑을려고하는 경우 중지 시키기 위함
            boolean stop = false;

            // 함수의 조합 (RDD)를 str에 담음
            String str = br.readLine();

            // 총 들어올 수열의 길이 값
            int len = Integer.parseInt(br.readLine());
            String value = br.readLine();
            // 수열이 들어올 때 배열의 출력과 같이 ',',  '[', ']' 포함되어서 처리하는 과정
            // subString을 통해 대괄호가 없는 부분을 추출하고, StringTokenizer를 통해 , 단위로 분리
            StringTokenizer st = new StringTokenizer(value.substring(1,value.length()-1), ",");
            for (int j = 0; j < len; j++) // 덱에 수열 값을 담아줌
                dQue.add(Integer.parseInt(st.nextToken()));

            for (int k = 0; k < str.length(); k++) {
                if (stop) // 에러가 발생한 경우 종료
                    break;
                char c = str.charAt(k); // 함수의 각 자리를 문자로 변환하는 과정
                switch (c) { // 해당 문자가 어떤 문자인지 판별을 위한 switch-case 문
                    case 'R': // 뒤집는 경우 flag 변수의 true, false 값을 반전
                        flag = !flag;
                        break;
                    case 'D': // 추출하는 경우 뽑는 방향을 넘겨, 해당 방향을 통해 추출
                        stop = drop(flag); // 추출 후 결과 값으로 boolean형 반환
                        // false인 경우 정상 추출, true인 경우 덱이 비어있을 때 추출을 진행하였음으로 종료
                        break;
                }
            }
            if(!stop) { // 에러가 발생하지 않은 경우
                if(!flag) { // 방향이 역방향인 경우
                    sb.append("[");
                    while(!dQue.isEmpty()) { // 큐가 빌때까지 뒤에서부터 뽑아 옴
                        sb.append(dQue.removeLast());
                        if(dQue.size()>=1) // 정수뒤에 ,를 붙이고, 마지막에는 ,를 붙이지 않기위한 조건 문
                            sb.append(",");
                    }

                }else {
                    sb.append("[");
                    while(!dQue.isEmpty()) {// 큐가 빌때까지 앞에서부터 뽑아 옴
                        sb.append(dQue.removeFirst());
                        if(dQue.size()>=1)// 정수뒤에 ,를 붙이고, 마지막에는 ,를 붙이지 않기위한 조건 문
                            sb.append(",");
                    }

                }
                sb.append("]\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();

    }
    // 덱에서 방향에 맞춰 뽑는 함수 drop
    public static boolean drop(boolean flag) {
        if (dQue.isEmpty()) { // 덱이 비어있는 경우 error를 결과 값에 담음
            // 이후 true 값을 반환화여 에러가 발생한 것을 알림
            sb.append("error\n");
            return true;
        }
        if (flag) {  // 순 방향으로 추출해야하는 경우
            dQue.removeFirst();
        } else { // 역방향 추출인 경우
            dQue.removeLast();
        }
        return false;

    }
}
