package hash;
import java.util.*;
public class Maraton {
	
	public static String solution(String[] participant, String[] completion) {
		String answer ="";
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i =0; i<completion.length;i++) {
			if(!participant[i].equals(completion[i]) ) {
				answer += participant[i];
				return answer;
			}
		}
		answer += participant[participant.length - 1];
		return answer;
	}
	public static void main(String[] args) {
		 String[] participant = { "leo", "kiki", "eden" };
		 String[] completion = { "eden", "kiki" };
		 System.out.println(solution(participant,completion));
		 
	}

}
