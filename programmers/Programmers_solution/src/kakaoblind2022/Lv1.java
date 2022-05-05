//신고결과받기 문제
package kakaoblind2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;
public class Lv1 {
	public static  int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int [id_list.length];
		int[] result = new int [id_list.length];
		Map<String,String> map = new HashMap<String, String>();
		HashMap<String,Integer> count_value = new HashMap<String,Integer>();
		for(String s :id_list)
			count_value.put(s, 0);
		for(String s :report) {
			String[] str = s.split(" ");
			if(map.containsKey(str[1])) {
				if(map.get(str[1]).contains(str[0]))
					continue;
				String x = map.get(str[1]) +" "+str[0];
				map.put(str[1], x);
			}
			else 
			map.put(str[1], str[0]);
		}
		for(int i= 0; i<id_list.length;i++) {
			if(map.get(id_list[i])!=null) {
			String[] str = map.get(id_list[i]).split(" ");
			if(str.length>=k) {
				for(int z = 0; z<str.length;z++)
					count_value.put(str[z],count_value.get(str[z])+1);
			}
			}
		}
		
		for(int x = 0 ; x<id_list.length;x++) {
			answer[x] =count_value.get(id_list[x]);
		}
		
			return answer;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = 2;
		String[] str = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"frodo neo","muzi neo","apeach frodo","muzi frodo","apeach muzi"};
		int[] result = solution(str,report,k);
		for(int i :result)
			System.out.println(i);
	}

}
