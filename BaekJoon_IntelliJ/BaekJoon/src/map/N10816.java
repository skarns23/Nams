package map;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> map = new HashMap<>();
        st  =new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N;i++){
            int number = Integer.parseInt(st.nextToken());
            map.put(number,map.getOrDefault(number,0)+1);
        }
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i =0  ; i<M;i++){
            int test_num = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(test_num,0)+" ");
        }
        bw.flush();
    }
}
