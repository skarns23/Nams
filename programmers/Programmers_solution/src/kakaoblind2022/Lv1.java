//신고결과받기 문제
package kakaoblind2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class Lv1 {
	public static  int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int [id_list.length];
		HashMap<String,HashSet<String>> map = new HashMap<>();
		//report 결과를 담을 map
		HashMap<String,Integer> report_count = new HashMap<String, Integer>();
		for(String s :id_list) {
			map.put(s, new HashSet<>()); //id_list와 초기설정
			report_count.put(s, 0); //메일 수를 받을 report_count map을 초기화 
		}
		for(String s : report) {
			String[] str = s.split(" ");
			map.get(str[1]).add(str[0]); // 피신고자를 key로 신고자를 중복을 허용하지않는 HashSet에 넣어 줌 
		}
		
		for(String s : id_list) {
			if(map.get(s).size()>=k) {
				for(String name : map.get(s)) {
					report_count.put(name, report_count.get(name)+1);
				}
			}
		}
		int i =0;
		for(String s :id_list) {
			if(report_count.get(s)!=0) {
			answer[i] = report_count.get(s);
			}
			i++;
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = 2;
		String[] str = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int[] result = solution(str,report,k);
		for(int i :result)
			System.out.println(i);
	}

}
