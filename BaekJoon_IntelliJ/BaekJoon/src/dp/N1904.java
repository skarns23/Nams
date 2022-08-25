package dp;

import java.io.*;


/*
* https://www.acmicpc.net/problem/1904
* 00과 1 타일을 가지고 만들 수 있는 이진 수의 개수 구하기
* */
public class N1904 {

    public static void main(String[] args) throws IOException {
        //입출력을 위한 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //길이 N을 입력 받음
        int num = Integer.parseInt(br.readLine());
        // 길이만큼의 배열을 생성
        int [] arr= new int [num+1];

        //초기 값 설정 1인 경우에 대해 만들 수 있는 경우의 수는 1 한가지
        arr[0] = 1;
        arr[1] = 1;

        // 길이에 따른 2진 수열의 개수는 이전 길이의 수열의 갯수의 조합으로 이루어짐
        for(int i =2;i<=num;i++){
            arr[i] = (arr[i-1]+arr[i-2])%15746;
        }
        bw.write(arr[num]+"");
        bw.flush();
    }
}
