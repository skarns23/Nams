package bruteforce;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

//단어 수학 https://www.acmicpc.net/problem/1339
public class N1339 {
    static HashSet<Character> set = new HashSet<>();
    static HashMap<Character,String> map = new HashMap<>();
    static Character[] chars;
    static String[] strArr;
    static int max = Integer.MIN_VALUE;
    static boolean[] visited =new boolean[10];
    public static int StringToInt(String str){
        String str_result = "";
        for(int i = 0 ; i<str.length();i++){
            str_result+=map.get(str.charAt(i));
        }
        return Integer.parseInt(str_result);
    }
    public static void dfs(int depth){
        if(depth==map.size()){
            int sum = 0;
            for(String s : strArr){
                sum += StringToInt(s);
            }
            if(max<sum)
                max = sum;
        }
        for(int i =9; i>9-map.size();i--){
            if(visited[i])
                continue;
            map.put(chars[depth],String.valueOf(i));
            visited[i] = true;
            dfs(depth + 1);
            visited[i] = false;

        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        strArr = new String[N];
        for(int i = 0 ; i<N;i++){
            strArr[i] = br.readLine();
            for(int j = 0 ; j<strArr[i].length();j++){
                set.add(strArr[i].charAt(j));
            }
        }
        chars = set.toArray(new Character[0]);
        for(char c : chars)
            map.put(c,null);
        dfs(0);
        System.out.println(max);


    }
}
