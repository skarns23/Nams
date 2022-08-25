package brute_force;
import java.util.*;
public class MinSquare {

    class Solution {

        public int solution(int[][] sizes) {
            int answer = 0;
            swap(sizes,0);
            int first=sizes[0][0];
            int second=sizes[0][1];

            for(int i=1;i<sizes.length;i++){
                swap(sizes,i);
                if(first<sizes[i][0]){
                    first=sizes[i][0];
                }
                if(second<sizes[i][1]){
                    second= sizes[i][1];
                }
            }
            answer = first*second;



            return answer;
        }
        public  void swap(int[][] arr,int line){
            if(arr[line][0]<arr[line][1]){
                int temp = arr[line][0];
                arr[line][0] = arr[line][1];
                arr[line][1] = temp;
            }
        }
    }
}
