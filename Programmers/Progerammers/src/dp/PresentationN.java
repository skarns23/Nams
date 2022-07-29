package dp;
import java.util.*;

public class PresentationN {
    class Solution {
        public int solution(int N, int number) {
            int answer = 0;
            ArrayList<HashSet<Integer>> countList = new ArrayList<>();
            for(int i=0; i<9;i++)
                countList.add(new HashSet<Integer>());
            countList.get(1).add(N);
            if(N == number){
                return 1;
            }
            for(int i = 2; i<9;i++){
                HashSet<Integer> tempSet = countList.get(i);
                for(int j = 1; j<i;j++){
                    HashSet<Integer> preSet = countList.get(j);
                    HashSet<Integer> postSet = countList.get(i-j);
                    for(int pre : preSet){
                        for(int post: postSet){
                            tempSet.add(pre+post);
                            tempSet.add(pre-post);
                            tempSet.add(pre*post);
                            if(pre !=0 && post!=0){
                                tempSet.add(pre/post);
                            }
                        }
                    }
                    tempSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
                }
                if(tempSet.contains(number)){
                    return i;
                }
            }


            return -1;


        }
    }
}
