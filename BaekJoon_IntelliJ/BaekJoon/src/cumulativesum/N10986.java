package cumulativesum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10986
// 나머지 합
// 수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
//즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.
public class N10986 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수의 갯수 N과 구간 합에 모듈레이터 연산을 진행할 M 초기화
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // count - 결과 값, arr - 누적 합 저장 배열, result - 각 누적합을 모듈레이터 연산한 값의 개수들
        // 연산을 진행하며 int 범위를 초과할 수 있어서 long 타입으로 선언
        long count = 0;
        long[] arr = new long[N];
        long[] result = new long[M];
        st = new StringTokenizer(br.readLine());

        // 누적합 배열 초기화 시 i-1로 선언하면 0번째 인덱스에서 에러 발생하므로 0번째 인덱스 초기화
        arr[0] = Integer.parseInt(st.nextToken());
        for(int i = 1; i < N;i++){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        // 모듈레이터 연산을 통해 0인 경우 정답 값에 바로 더하고, 모듈레이터 후 남은 값의 갯수를 셈
        for(int i = 0; i < N;i++){
            int remain = (int)(arr[i] % M);
            count = remain == 0 ? count +1 : count;
            result[remain]++;
        }

        // 조합 연산을 통해 추가적으로 만들어 낼 수 있음 조합 값을 더 해줌
        for(int i = 0; i < result.length;i++){
           if(result[i] > 1)
               count = count + (result[i] * (result[i]-1)/2);
        }
        bw.write(count+"");
        bw.flush();

    }
}
