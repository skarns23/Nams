package prefixsum;

import java.io.*;
import java.util.StringTokenizer;

public class N11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] sum_row = new int[N+1][N+1];
        int[][] sum_col = new int[N+1][N+1];
        int[][] arr = new int [N+1][N+1];
        for(int i = 1 ; i<=N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j<=N;j++){
                int val  = Integer.parseInt(st.nextToken());
                sum_row[i][j] = sum_row[i][j-1]+val;
                sum_col[i][j] = sum_col[i-1][j]+val;
            }
        }
        for(int i = 0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int diff_x = x2-x1;
            int diff_y = y2-y1;
            int sum = 0;
            if(diff_x == diff_y){
                bw.write(sum_row[x1][y1]-sum_row[x1-1][y1]+"\n");
                continue;
            } else if(diff_x>diff_y) {

                for(int j = 0 ; j<=diff_y;j++)
                    sum += sum_col[x2][y1+j]-sum_col[x1-1][y1];
            } else if(diff_y>=diff_x){
                for(int j = 0 ; j<diff_x;j++)
                    sum += sum_row[x1+j][y2]-sum_col[x1][y1-1];
            }
            bw.write(sum+"\n");
        }
        bw.flush();
    }
}
