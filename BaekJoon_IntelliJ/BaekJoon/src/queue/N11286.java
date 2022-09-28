package queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;


// https://www.acmicpc.net/problem/11286
// 절댓값 힙
// 입력 값이 0이 아닌 정수의 경우 배열에 넣는다
// 입력 값이 0인 경우 절댓값이 가장 작은 작으며, 같은 값이 여러 개인 경우 가장 작은 값 출력 후 제거

public class N11286 {
    public static void main(String[] args) throws IOException {
        // BufferedReader, BufferedWriter 사용을 위한 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 절댓값 힙 문제의 경우, 값을 넣으면서 정해진 기준으로 정렬을 해줘야함
        // 그에따라 우선순위 큐를 활용
        // 또한 정렬의 순서가 절댓값이 작은 경우 -> 그 중 음수인 경우
        // 이여서 새로운 클래스를 생성하여, 비교연산을 재정의 해줌
        PriorityQueue<Num> pQue = new PriorityQueue<>();

        // 연산의 수를 나타내는 N
        int N = Integer.parseInt(br.readLine());

        // 연산을 입력받는 반복문
        for(int i = 0 ;i<N;i++) {
            int value = Integer.parseInt(br.readLine());
            if(value==0) { // 들어온 연산이 0 인경우
                // Queue가 비어있는 경우 0 출력, Queue에 값이 존재하는 경우 root value 출력
                bw.write(pQue.isEmpty()?"0\n":pQue.poll().getValue()+"\n");
                continue;
            }
            // value 값이 0이 아닌 정수인 경우 Num 인스턴스 생성하여 삽입
            pQue.add(new Num(value,Math.abs(value)));
        }

        bw.flush();


    }
}
// 우선순위에 저장할 객체의 경우 비교를 위해 Comparable Interface를 구현해야함
// Comparable Interface를 상속받아 comepareTo 메소드 재정의
class Num implements Comparable<Num> {

    private int value;
    private int absValue;

    public Num(int value, int absValue) {
        this.value = value;
        this.absValue = absValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getAbsValue() {
        return absValue;
    }

    public void setAbsValue(int absValue) {
        this.absValue = absValue;
    }

    // 절댓값이 같은 경우 입력 값으로 비교
    // 오름차순으로 정렬 하게끔 설정
    @Override
    public int compareTo(Num o) {

        if(this.absValue==o.absValue) {
            return this.value - o.value;
        }
        // 절댓값이 다른 경우 절댓값에 대해 오름차순 정렬
        return this.absValue - o.absValue;

    }

}
