package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class N1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s;
        HashMap<Integer, String> map_num = new HashMap<>();
        HashMap<String,Integer>  map_name = new HashMap<>();
        int N = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);
        for(int i = 1 ; i<=N;i++){
            s = br.readLine();
            map_num.put(i,s);
            map_name.put(s,i);
        }
        for(int i= 0 ;i <M;i++){
            s = br.readLine();
            if(map_name.containsKey(s)){
                System.out.println(map_name.get(s));
            }else if(map_num.containsKey(Integer.parseInt(s))){
                System.out.println(map_num.get(Integer.parseInt(s)));
            }
        }

        }
}
