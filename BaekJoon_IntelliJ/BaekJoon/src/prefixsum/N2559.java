package prefixsum;


import java.io.*;
import java.util.*;

//수열 문제
public class N2559 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int [N];
        int max_sum = Integer.MIN_VALUE;
        int pre_sum = 0;
        int start = 0;
        for(int i =0 ; i<N;i++){
            int value = Integer.parseInt(st.nextToken());
            arr[i] = value;
            if(i<K) {
                pre_sum += value;
                if(i == K-1){
                    if(max_sum<pre_sum)
                        max_sum = pre_sum;
                }
                continue;
            }
            else{
                pre_sum = pre_sum-arr[start]+value;
                start++;
                if(max_sum<pre_sum)
                    max_sum = pre_sum;
            }

        }
        bw.write(max_sum+"");
        bw.flush();
    }
}
