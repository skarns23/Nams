package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;

public class N14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);
        HashMap<String, Integer> map  = new HashMap<>();
        for(int i = 0 ; i<N;i++)
        {
            map.put(br.readLine(),0);
        }
        int count = 0 ;
        for(int i = 0 ; i<M;i++){
            String s  = br.readLine();
            if(map.containsKey(s))
                count++;
        }
        System.out.println(count);
    }
}
