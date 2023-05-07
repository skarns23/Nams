package bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N13549 {
    public static int[] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        dp = new int [100001];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[start] = 0;
        bfs(start,target,0);
        bw.write(dp[target]+"");

        bw.flush();
        bw.close();

    }

    public static void bfs(int start,int target, int depth){
        Queue<int[]> que = new LinkedList<>();
        int[] arr = new int[] {start,target,depth};
        que.add(arr);
        while(!que.isEmpty()){
            int[] temp = que.poll();
            dp[temp[0]] = Math.min(dp[temp[0]],temp[2]);

            if(temp[0]*2<dp.length&&dp[temp[0]*2]>temp[2]){
                que.add(new int[]{temp[0]*2,temp[1],temp[2]});
            }
            if(0<=temp[0]-1&&temp[0]-1<dp.length&&dp[temp[0]-1]>temp[2]+1){
                que.add(new int[]{temp[0]-1,temp[1],temp[2]+1});
            }
            if(0<=temp[0]+1&&temp[0]+1<dp.length&&dp[temp[0]+1]>temp[2]+1){
                que.add(new int[]{temp[0]+1,temp[1],temp[2]+1});
            }
        }

    }
}
