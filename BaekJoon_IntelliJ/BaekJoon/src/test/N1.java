package test;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Result{
    public static int balancedSum(int[] arr ){
        int reulst = 0;
        for(int i = 1 ; i<arr.length-1;i++){
            int right_value = arr[arr.length-1]-arr[i+1];
            if(arr[i-1]==right_value)
                return i;
        }
        return reulst;
    }
}
public class N1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int [N+1];
        for(int i = 0 ; i<=N;i++){
            int val = Integer.parseInt(br.readLine());
            arr[i] = arr[i-1]+val; // 누적합으로 빠르게 풀 수있을 듯
        }
        int result =Result.balancedSum(arr);
        bw.write(result+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
