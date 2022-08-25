package bruteforce;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
//단어 수학 https://www.acmicpc.net/problem/1339 그리디

public class N1339GREED {


    static int N;
    static int sum = 0;
    static HashMap<Character, Integer> map = new HashMap<>();
    public static void setWeight(String str){

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<N;i++){
            String str = br.readLine();
            for(int j = 0; j<str.length();j++){
                char c = str.charAt(j);
                if(!map.containsKey(c)){
                    map.put(c,(int)Math.pow(10,str.length()-(j+1)));
                    continue;
                }
                map.put(c,map.get(c)+(int)Math.pow(10,str.length()-(j+1)));
            }
        }
        Integer[] arr  = map.values().toArray(new Integer[0]);
        Arrays.sort(arr, Collections.reverseOrder());
        int value = 9;
        for(int i :arr){
            sum += i*value;
            value--;
        }
        System.out.println(sum);
    }
}
