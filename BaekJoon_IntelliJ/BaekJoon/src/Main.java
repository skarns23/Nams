import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int [N+1];
        int[] arr = new int [N+1];
        for(int i=1;i<=N;i++){
            arr[i] = sc.nextInt();
        }
        dp[1] =arr[1];
        if(N>=2){
            dp[2] =arr[1]+arr[2];
        }
        for(int i =3;i<=N;i++){
            dp[i] = Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
        }
        Arrays.sort(dp);
        System.out.println(dp[N]);
    }
}