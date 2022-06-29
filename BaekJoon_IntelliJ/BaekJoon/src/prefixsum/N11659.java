package prefixsum;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        arr[0] = 0;
        for(int i = 1 ; i<=N;i++)
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        for(int i = 0 ;i <M;i++){
            st  = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end  = Integer.parseInt(st.nextToken());
            int prefix_sum = arr[end] - arr[start-1];
            bw.write(prefix_sum+"\n");
        }
        bw.flush();
    }
}
