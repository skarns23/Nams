package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17298
// 오큰수
// 현재 인덱스의 값보다 오른쪽에 있으면서 값이 더 큰 경우 오큰수라 한다.
// 문제 해결 아이디어 - 스택의 최상위 값과 수열의 값을 순회하며 비교
// 수열의 값이 더 큰 경우, 스택의 최상위 값이 수열 값보다 같거나 작아질때까지 추출
public class N17298 {
    public static void main(String[] args) throws IOException {
        // 입, 출력을 위한 초기설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 수열의 인덱스를 담을 stack 선언
        Stack<Integer> stack = new Stack<>();
        // 수열의 크기를 담을 변수 N 선언
        int N = Integer.parseInt(br.readLine());

        // 버퍼에 담은 문자열을 하나씩 끊어서 사용하기위한 StringTokenizer
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 결과 값을 담을 배열 result 선언
        int[] result = new int [N];
        // 수열의 값을 담을 arr 배열 선언
        int[] arr = new int [N];
        for(int i = 0 ;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 결과 값의 모든 값을 오큰수가 존재하지않는 경우인 -1로 설정
        Arrays.fill(result,-1);
        // 수열을 탐색하는 for문
        for(int i = 0; i<N;i++){
            // 스택의 최상위 값이 현재 수열의 값보다 작은 경우 오큰수이므로 값 설정
            while(!stack.isEmpty() && (arr[stack.peek()]<arr[i])){
                result[stack.pop()] = arr[i];
            }
            // 이후 수열 값 스택에 넣어줌
            stack.push(i);
        }
        for(int i :result){
            bw.write(i+" ");
        }
        bw.flush();
    }
}