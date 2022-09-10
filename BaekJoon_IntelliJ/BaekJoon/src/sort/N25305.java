package sort;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N25305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[N] ;
        Arrays.fill(arr,-1);
        for(int i = 0 ; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,Collections.reverseOrder());
        bw.write(arr[K-1]+"");
        bw.flush();
    }
}
