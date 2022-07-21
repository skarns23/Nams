package bruteforce;

import java.io.*;
import java.util.HashSet;

//단어 수학 https://www.acmicpc.net/problem/1339
public class N1339 {
    static HashSet<Character> set = new HashSet<>();
    static String[] strArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        strArr = new String[N];
        for(int i = 0 ; i<N;i++){
            strArr[i] = br.readLine();
            for(int j = 0 ; j<strArr[i].length();i++){
                set.add(strArr[i].charAt(j));
            }
        }


    }
}
