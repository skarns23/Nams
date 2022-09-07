package dp;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2565
// 전깃줄 문제
// 교차하지 않도록 만들기 위해 제거해야하는 전선의 수를 구하는 문제
public class N2565 {

    public static void main(String[] args) throws IOException {
        // 입출력을 위한 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 총 전선의 개수
        int N = Integer.parseInt(br.readLine());
        // A 전봇대, B 전봇대의 값을 담을 배열
        int[][] arr = new int [N][2];
        // A 전봇대의 위치에서 겹치지않고 설치할 수 있는 전선의 수를 나타내는 dp 배열
        int[] dp = new int [N];
        StringTokenizer st;

        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        // 2차원 배열 arr 중 A 전봇대를 내림차순으로 정렬
        Arrays.sort(arr,(o1,o2)->{
            return o1[0]-o2[0];
        });
        // 교차하는 전선의 경우 반대로 생각하면
        // 전체 전선의 수 - 최대 겹치지않고 연결할 수 있는 전선의 수 이다
        // LIS를 활용하여 겹치지 않도록 설치할 수 있는 전선의 수를 구한다.
        for(int i = 0;i<N;i++){
            dp[i] = 1; // 최소 값인 1로 설정
            for(int j =0;j<i;j++){
                if(arr[i][1]>arr[j][1]){ // 자신보다 인덱스의 위차가 낮은 값 중, B 전봇대와 연결된 값이 작은 경우
                    // 교차하지 않기때문에 해당 조건문을 활용
                    // 이후 자신보다 겹치지않고 연결가능한 수가 많을경우 값 변경 
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            System.out.println(i+" "+dp[i]);
        }
    }
}
