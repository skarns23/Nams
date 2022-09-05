package dp;


import java.util.Scanner;

public class N10844 {
    static Long[][] dp;
    static long mod = 1000000000;
    public static long dfs(int n,int value){
        if(n==1){
            return dp[n][value];
        }
        if(dp[n][value]==null) {
            if (value == 0) {
                dp[n][value] = dfs(n - 1, value + 1)%mod;
            } else if (value == 9) {
                dp[n][value] = dfs(n - 1, value - 1) %mod;
            } else {
                dp[n][value] = (dfs(n - 1, value + 1)%mod + dfs(n - 1, value - 1)%mod)%mod;
            }
        }

        return dp[n][value]%mod ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new Long[N+1][10];
        dp[1][0] = 0L;
        long sum = 0L;
        for(int i =1;i<=9;i++){
            dp[1][i] = 1L;
        }
        for(int i =0;i<=9;i++){
            sum+=dfs(N,i);
            sum %= mod;
        }
        System.out.print(sum);

    }
}

