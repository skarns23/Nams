package stack;


public class Level2_4 {
	public  int[]  solution(int[] prices) {
		 int[] answer = new int [prices.length];
			
			for(int i = 0 ; i <prices.length-1;i++) {
				int val  = prices[i];
				for(int j= i+1;j<prices.length;j++) {
					if(val<=prices[j]) {
						answer[i]++;
					}
	                else if (val>prices[j]){
	                    answer[i]++;
	                    break;
	                }
					else {
						
						break;
					}
				}
			}
			return answer;
	}
}
