package bruteforce;
import java.util.*;
public class level1 {
	
	public static int[] solution(int[] answers) {
		
		int[] std1  = new int[] {1,2,3,4,5};
		int[] std2 = new int [] {2,1,2,3,2,4,2,5};
		int[] std3 = new int[] {3,3,1,1,2,2,4,4,5,5};
		int[] arr = new int [3];
		int [] tmp = new int [3];
		for(int i =0;i<answers.length;i++) {
			if(answers[i]==std1[i%5]) {
				arr[0]++;
				tmp[0]++;
			}
			if(answers[i]==std2[i%8])
				{
				arr[1]++;
				tmp[1]++;
				}
			if(answers[i]==std3[i%10])
				{
					arr[2]++;
					tmp[2]++;
				}
		}
		Arrays.sort(tmp);
		int max = tmp[2];
		ArrayList<Integer> arrlist = new ArrayList<>();
		for(int i =0;i <3;i++) {
			if(arr[i]>=max) {
				arrlist.add(i+1);
			}
		}
		int [] answer= new int [arrlist.size()];
		for( int i =0; i<arrlist.size();i++) {
			answer[i] = arrlist.get(i);
		}
		return answer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= new int[] {1,2,3,4,5};
		
		
	}

}
