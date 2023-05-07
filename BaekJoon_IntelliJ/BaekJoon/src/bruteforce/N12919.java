package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N12919 {
    public static int result = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String start = br.readLine();
        String target = br.readLine();
        dfs(start,target);
        bw.write(result+"");
        bw.flush();
        bw.close();

    }

    public static void dfs(String str, String target){
        if(str.length()==target.length()){
            result = str.equals(target)?1 : 0;
            return ;
        }

        if(result==1 || str.length()>target.length()) {
            return ;
        }

        if(target.startsWith("A")) {
            dfs(str,method1(target));

        }
        if(target.startsWith("B")) {
            dfs(str,method2(target));

        }
    }
    public static String method1(String str){
        return str.substring(1);
    }

    public static String method2(String str){
        StringBuilder sb = new StringBuilder();
            sb.append(str.substring(1));
            sb.reverse();
        return sb.toString();
    }
}
