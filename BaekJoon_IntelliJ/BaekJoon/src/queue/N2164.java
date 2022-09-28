package queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;


// https://www.acmicpc.net/problem/2164
// 카드2
// 오름차순인 Queue 의 맨 앞의 값을 제거 이후 맨 앞의 값을 제일 뒤로 옮겨 마지막에 남는 카드를 출력하는 문제
public class N2164 {

    public static void main(String[] args) throws IOException {
        // 카드 값을 담을 Queue와 입, 출력을 위한 설정
        Queue<Integer> que = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 총 카드의 수를 입력받는 변수 N
        int N = Integer.parseInt(br.readLine());

        // 1~N 까지의 카드 queue에 삽입
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
        // queue의 크기가 1이 될때까지 반복하는 while문
        while (!(que.size() == 1)) {
            que.poll(); // 제일 위에있는 카드 제거
            que.add(que.poll()); // 이후 위에있는 카드 맨 밑으로 넣어주는 과정
        }
        // 마지막으로 남은 카드 출력 
        bw.write(que.poll() + "");
        bw.flush();
    }
}