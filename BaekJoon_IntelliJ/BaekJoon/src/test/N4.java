package test;

import java.io.*;

class N4Result {
    public static String press(String str,int k){
        int cnt = 1;
        String result = str;
        int start_index= 0;
        for(int i = 0; i<result.length()-1;i++){
            if(result.charAt(i)==result.charAt(i+1)){
                cnt++;
            }else{
                cnt=1;
                start_index=i;
            }
            if(cnt == k){
                String ans = result.substring(0,i-cnt+2)+result.substring(i+2);
                return ans;
            }
        }
        return result;
    }
    public static String compressWord(String word, int k) {
        // Write your code here
        String result = word;
        while(true){
            String new_result = N4Result.press(result,k);
            if(!result.equals(new_result))
            {
                result= new_result;
            }else{
                break;
            }
        }
        return result;
    }
}
public class N4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br .readLine();

        int k = Integer.parseInt(br .readLine().trim());

        String result = N4Result.compressWord(word, k);

        bw.write(result);
        bw.newLine();

        bw.close();
        bw.close();
    }
}
