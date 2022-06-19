package map;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N10815 {

    public static void main(String[] args) throws IOException {
        HashMap<Integer,Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input_num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<input_num;i++){
            map.put(Integer.parseInt(st.nextToken()),1);
        }
        int num_case = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<num_case;i++){
            int number = Integer.parseInt(st.nextToken());
            if(map.containsKey(number)){
                bw.write("1 ");
            }
            else
                bw.write("0 ");
        }
        bw.flush();



    }
}
