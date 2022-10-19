import java.util.Arrays;
import java.util.PriorityQueue;

public class P42889 {

     static class Solution {
        public static   int[] solution(int N, int[] stages) {
            PriorityQueue<Item> que = new PriorityQueue<>();
            int[] result = new int[N];
            int[] value = new int [N+1];
            int[] people = new int [N+1];
            for(int i :stages){
                if(i<=N){
                    value[i]++;
                }
            }

            for(int i = 1; i<=N;i++){
                people[i] = people[i-1]+value[i];
                double per = value[i]==0?0.0 : ((double)value[i]/(stages.length-people[i]));
                que.add(new Item(i,per));
            }
            for(int i=0;i<N;i++){
                result[i] = que.poll().index;
            }
            return result;


        }
        static class Item implements Comparable<Item>{
            int index;
            double per;
            Item (int index, double per){
                this.index = index;
                this.per = per;
            }
            @Override
            public int compareTo(Item o) {
                if(this.per == o.per){
                    return this.index - o.index;
                } else if(this.per>o.per){
                    return -1;
                }else return 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(5,new int[]{2, 1, 2, 6, 2, 4, 3, 3})));

    }
}
