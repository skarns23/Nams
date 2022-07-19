package test;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class N2Result{
    public static String getLargestNumber(String num) {
        // Write your code here

        int[] arr = new int[num.length()];
        int count = 0;
        for(int i = 0;i <num.length();i++){
            arr[i] = Integer.parseInt(num.charAt(i)+"");
            if(i>0){
                if(arr[i]%2==arr[i-1])
                    count++;
            }
        }
        if(count == 0 ){
            return num;
        }else if(count== num.length()-1){
            String result="";
            int[] count_arr = new int [10];
            for(int a : arr)
                count_arr[a]++;

            for(int i =9;i>=0;i--){
                if(count_arr[i]==0)
                    continue;
                for(int j=0; j<count_arr[i];j++)
                    result+=(char)i-'0';
            }
            return result;
        }
        for (int i = 1;i<arr.length-1;i++){
            boolean swap = false;
            for(int j = arr.length-1 ; j>0;j--){
                if(arr[j-1]%2==arr[j]%2){
                    if(arr[j-1] <arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swap = true;
                    }
                }
            }
            if(swap==false){
                break;
            }
        }
        String result = "";
        for(int a : arr)
            result += Integer.parseInt(a+"");
        return result;
    }
}
public class N2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = bufferedReader.readLine();

        String result = N2Result.getLargestNumber(num);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}
