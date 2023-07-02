package implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class N20291 {
    /*
    * 파일을 확장자 별로 정리해서 몇 개씩 있는지 알려줘
       보기 편하게 확장자들을 사전 순으로 정렬해 줘
    */

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        TreeMap<String,Integer> map = new TreeMap<>();
        for(int i=0;i<N;i++){
           String str = br.readLine().split("\\.")[1];
           map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String key : map.keySet()){
            bw.write(key+" "+map.get(key)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
