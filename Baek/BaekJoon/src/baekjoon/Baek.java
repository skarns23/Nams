package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Baek {

	public static String[] solution(String[] data,String word) {
		ArrayList<String> list = new ArrayList<String>();
		HashMap<Integer,String> map = new HashMap<>();
		for(String s :data) {
			String[] str = s.split(" ");
			if(Integer.parseInt(str[2])==0) {
				map.put(Integer.parseInt(str[0]), str[1]);
			}else {
				map.put(Integer.parseInt(str[0]), map.get(Integer.parseInt(str[2]))+"/"+str[1]);
			}
		}
		
		for(int i =0; i<map.size()+1;i++) {
			if((map.get(i)!=null) &&map.get(i).contains(word))
				list.add(map.get(i));
		}
		
		if(list.size()==0) {
			String[] answer = {"Your search for (" +word+") didn't return any results"};
			return answer;
		}
		String[] answer = new String[list.size()];
		for(int i =0;i<list.size();i++) {
			answer[i]=list.get(i);
			
		}
		return answer;
	}
	public static void main(String[] args) {
		
		String[][][] str = new String[2030][12][31];
	}

}
