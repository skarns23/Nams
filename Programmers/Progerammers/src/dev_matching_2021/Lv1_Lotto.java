package dev_matching_2021;

import java.util.Arrays;

public class Lv1_Lotto {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int count = 0 ;
            int zero = 0;
            Arrays.sort(lottos); //나의 로또번호 정렬
            Arrays.sort(win_nums); //로또 당첨 번호 정렬
            zero = (int) Arrays.stream(lottos).filter(n->n==0).count(); // 0의 갯수를 카운트
            for(int i = 0 ;i <lottos.length;i++) { //같은 번호의 갯수를 찾는 반복문
                if(lottos[i]==0)
                    continue;
                int finalI = i;
                if(Arrays.stream(win_nums).anyMatch(n->n==lottos[finalI])) //로또번호가 같은 경우
                    count++; // 갯수 증가
               /* for(int j =0;j<win_nums.length;j++) {
                    if(lottos[i]==win_nums[j])
                        count++;*/

//                }
            }
            int max_match = 7-(count+zero);
            int min_match = 7-count;
            max_match = max_match >6 ? 6 : max_match;
            min_match = min_match >6 ? 6 :min_match;
            int[] result = new int [] {max_match,min_match};
            return result;
        }
    }
}
