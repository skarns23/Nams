package devmatching2021;
import java.util.*;

public class Lotto {
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		int count = 0 ;
		int zero = 0;
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		zero = (int) Arrays.stream(lottos).filter(n->n==0).count();
		for(int i = 0 ;i <lottos.length;i++) {
			if(lottos[i]==0)
				continue;
			for(int j =0;j<win_nums.length;j++) {
				if(lottos[i]==win_nums[j])
					count++;
				
			}
		}
		int max_match = 7-(count+zero);
		int min_match = 7-count;
		min_match = min_match >6 ? 6 :min_match;
		int[] result = new int [] {max_match,min_match};
		return result;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] lottos = new int [6];
		for(int i =0; i <lottos.length;i++) {
			lottos[i] = sc.nextInt();
		}
		int[] win_nums = new int [6];
		for(int i = 0 ; i<win_nums.length;i++)
			win_nums[i] = sc.nextInt();
		int[] result = solution(lottos,win_nums);
		System.out.println(result[0] +" "+result[1]);
	}
	

}
