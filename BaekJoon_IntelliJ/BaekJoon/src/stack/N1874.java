package stack;

import java.io.*;
import java.util.Stack;
// https://www.acmicpc.net/problem/1874
// 스택 수열
// 주어진 수열에 맞게 스택에서 값을 추출할 수 있는지 여부를 판단 및 추출하는 과정을 나타내는 문제
public class N1874 {
    // push 하는 경우 담을 문자열
    static String plus = "+\n";

    // pop 하는 경우 담을 문자열
    static String minus = "-\n";

    // 1~N 까지 증가하는 수로 활용할 변수 value
    static int value = 0;
    static Stack<Integer> stack;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        // 입출력을 위한 BufferedReader 와 BufferedWriter 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열 메모리 누수를 막기위해 StringBuilder 사용

        // 순차적으로 정수 값을 담을 스택
        stack = new Stack<>();
        // 총 들어올 수열의 길이 N
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int [N]; // 수열을 담을 배열 arr
        for(int i = 0 ; i<N;i++) { // 배열에 수열을 담는 과정
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 수열의 인덱스를 나타낼 변수 index
        int index = 0;

        // while 문의 조건인 isEmpty()에 걸리지 않게 하기 위해 stack에 초기 값을 넣어줌
        push(); // Stack에 초기 값으로 1을 넣고, StringBuilder 에 +를 추가해줌

        while(!stack.isEmpty()) { // stack이 비어있는 경우 끝나는것으로 간주
            if(arr[index]>stack.peek()) { // 현재 stack 의 가장 위에 있는 값이 현재 수열의 값보다 작은 경우
                push(); // stack 정수 값을 push
            }else if(arr[index]<stack.peek()) { // stack의 최상단 값이 현재 수열보다 큰 경우 stack의 순서를 오름차순으로 유지할 수 없음
                sb.setLength(0); // 쌓아놓은 StringBuilder 초기화
                sb.append("NO"); // 불가능하기때문에 NO 삽입
                break;  // while문 탈출
            }

            // 현재 수열의 값과 stack 최상단 값이 같은 경우
            if(arr[index]==stack.peek()) {
                stack.pop(); // 값을 추출
                index++; // 이후 수열의 인덱스를 뒤로 옮겨줌
                sb.append(minus); // 추출 (pop)했으므로 StrinbBuilder에 minus 문자열 넣어줌
                if(stack.isEmpty()&&value<N){ // 값을 추출한 후 바로 비어있는 경우 while 문이 종료됨
                    // 해당 문제 해결을 위해 value가 최대 값보다 작은 경우 stack에 값을 넣어줌
                    push();
                }
            }

        }
        bw.write(sb.toString());
        bw.flush();
    }
    public static void push(){
        stack.push(++value);
        sb.append(plus);
    }
}