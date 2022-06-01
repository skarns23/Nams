package kakaoblind_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Lv1_Report {
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int [id_list.length];
            String[] report_arr = Arrays.stream(report).distinct().toArray(String[]::new);
            HashMap<String, ArrayList<String>> result_map = new HashMap<>(); //key값으로 피신고자, value값으로 신고자를 담을 map
            HashMap<String, Integer> result_count = new HashMap<>(); //신고받을 메일수를 value갖는 map
            for(int i = 0 ; i< id_list.length;i++){
                result_map.put(id_list[i],new ArrayList<>());
                result_count.put(id_list[i],0 );
            }
            for(String s : report_arr){  // 신고리포트만큼의 반복문
                String[] str = s.split(" ");
                result_map.get(str[1]).add(str[0]);
            }
            for(String name : id_list){
                if(result_map.get(name).size()>=k){
                    for(String s : result_map.get(name)){
                        result_count.put(s,result_count.get(s)+1);
                    }
                }
            }
            for(int i =0 ; i < id_list.length;i++){
                answer[i] = result_count.get(id_list[i]);
            }
            return answer;
        }
    }
}
