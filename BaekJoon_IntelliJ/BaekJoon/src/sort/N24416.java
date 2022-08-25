package sort;

import java.io.*;

public class N24416 {
    static int count1 =1;
    static int count2 =1;
    static int[] arr;
    public static int fibo(int n){

        if(n==1 || n==2){
            return 1;
        }else{
            count1++;
            return fibo(n-1) +fibo(n-2);
        }
    }
    public static int fibo2(int n){

        for(int i =3;i <n;i++){
            arr[i] = arr[i-1]+arr[i-2];
            count2++;
        }
        return arr[n-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = 0;
        try{
            num = Integer.parseInt(br.readLine());
        }catch (Exception e){

        }
        arr = new int[num];
        arr[1]=1;
        arr[2]=1;
        fibo(num);
        fibo2(num);
        bw.write(count1+" "+count2);
        bw.flush();
    }


}
