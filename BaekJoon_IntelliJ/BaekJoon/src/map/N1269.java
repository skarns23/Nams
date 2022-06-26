package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st  = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minus = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N;i++)
            map.put(Integer.parseInt(st.nextToken()),0);
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i <M;i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                map.remove(num);
                minus++;
            }
            if (minus>=N)
                break;
        }
        System.out.println(N+M-(minus*2));

    }

}
