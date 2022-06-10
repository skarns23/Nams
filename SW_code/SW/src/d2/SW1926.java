package d2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SW1926 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = sc.nextInt();
        char[] ch = {'3','6','9'};
        for(int i = 1; i<=num;i++){
            String s = Integer.toString(i);
            if(s.contains("3") || s.contains("6")||s.contains("9")){
                for(char c : ch){
                    int count = (int) s.chars().filter(n->n==c).count();
                    for(int j =0;j<count;j++)
                    {
                        bw.write("-");
                    }
                }
                bw.write(" ");
            continue;
            }
            bw.write(s+" ");
        }

        bw.flush();
    }

}
