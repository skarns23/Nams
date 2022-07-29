package hash;
import java.util.*;
public class Pocketmon {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int a : nums){
                map.put(a,0);
            }
            answer = map.size()>=nums.length/2 ? nums.length/2 : map.size();
            return answer;
        }
    }
}
