package dp;

import java.io.*;


// https://www.acmicpc.net/problem/9251
// LCS 최장 공통 부분 수열 문제
// 마지막 문자가 포함되는지에 따른 점화식 도출과 2차원 테이블 구성을 통한 문제해결이 핵심
public class N9251 {

    public static void main(String[] args) throws IOException {

        // 입출력을 위한 초기설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 비교될 문자열 입력 받음
        String str1 = br.readLine();
        String str2 = br.readLine();
        // 2차원 테이블 구성을 위한 dp 배열
        int[][] dp = new int [str1.length()+1][str2.length()+1];
        for(int i =1;i<=str1.length();i++){ //행을 탐색할  for 문
            for(int j =1;j<=str2.length();j++){ // 열을 탐색할 for문
                if(str1.charAt(i-1)==str2.charAt(j-1)){ // 문자가 같은 경우 테이블의 대각선에 존재하는 값 +1로 최대 값 초기화
                    dp[i][j]= dp[i-1][j-1]+1;
                }else{ // 아닌 경우 이전 행 혹은 이전 열의 값 중 최대 값으로 선택
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }

        }
        bw.write(dp[str1.length()][str2.length()]+"");
        bw.flush();

    }
}
