import java.util.*;
public class P131128 {

    class Solution {
        public String solution(String X, String Y) {
            String answer = "";
            boolean flag = true;
            StringBuilder sb = new StringBuilder();
            int[] arr1  =new int [10];
            int[] arr2 = new int [10];
            for(int i = 0 ;i<X.length();i++){
                arr1[X.charAt(i)-'0']++;
            }
            for(int i = 0 ;i<Y.length();i++){
                arr2[Y.charAt(i)-'0']++;
            }
            for(int i = 9;0<=i;i--){
                while(arr1[i]>0 &&arr2[i]>0){
                    sb.append(i);
                    arr1[i]--;
                    arr2[i]--;
                    if(i!=0){
                        flag = false;
                    }
                }
            }
            answer = sb.toString();
            return answer.length()==0?"-1" :flag?"0":answer;

        }
    }
}
