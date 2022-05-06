//�Ű����ޱ� ����
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
		//report ����� ���� map
		HashMap<String,Integer> report_count = new HashMap<String, Integer>();
		for(String s :id_list) {
			map.put(s, new HashSet<>()); //id_list�� �ʱ⼳��
			report_count.put(s, 0); //���� ���� ���� report_count map�� �ʱ�ȭ 
		}
		for(String s : report) {
			String[] str = s.split(" ");
			map.get(str[1]).add(str[0]); // �ǽŰ��ڸ� key�� �Ű��ڸ� �ߺ��� ��������ʴ� HashSet�� �־� �� 
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
