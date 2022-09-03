package dp;

import java.io.BufferedReader;
import java.util.Scanner;

public class N1463 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==1){
            System.out.println(0);
            return ;
        }else if(N<=3){
            System.out.println(1);
            return ;
        }
        int[] dp = new int [N+1];
        dp[2] = 1;
        dp[3] = 1;
        for(int i =4;i<=N;i++){
            if(i%3==0){
                dp[i] = Math.min(dp[i/3]+1,dp[i]);
            }
            if(i%2==0){
                dp[i] = Math.min(dp[i/2]+1,dp[i]);
            }
            if(dp[i-1] !=0){
                
            }
        }
    }
}
