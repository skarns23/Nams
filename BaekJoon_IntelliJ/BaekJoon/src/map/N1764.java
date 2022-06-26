package map;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class N1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);
        String[] arr_N = new String[N];
        String[] arr_M = new String[M];
        for(int i = 0 ; i<N;i++){
            arr_N[i] = br.readLine();
        }
        for(int i = 0; i<M;i++)
            arr_M[i] = br.readLine();
        Arrays.sort(arr_N);
        Arrays.sort(arr_M);
       HashMap<String,Integer> map = new HashMap<>();
       for(String s :arr_N){
           map.put(s,0);
       }
        ArrayList<String> list = new ArrayList<>();
       int count = 0;
       for(String s :arr_M){
           if(map.containsKey(s)) {
               list.add(s);
               count++;
           }
       }
        Collections.sort(list);
        System.out.println(count);
        for(String s:list)
            System.out.println(s);

    }
}
