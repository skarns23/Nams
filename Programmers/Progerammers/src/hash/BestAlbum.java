package hash;

import java.util.*;
class Solution {
    public int[] solution(String[] g, int[] p) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<String,Integer> sumPlays = new HashMap<>();
        for(int i =0; i<g.length;i++){
            sumPlays.put(g[i],sumPlays.getOrDefault(g[i],0)+p[i]);
        }
        ArrayList<String> list = new ArrayList<String>(sumPlays.keySet());
        list.sort((o1,o2)->{
            return sumPlays.get(o2).compareTo(sumPlays.get(o1));
        });


        for(String s: list){
            ArrayList<Integer> values = new ArrayList<>();
            for(int i = 0 ;i <p.length;i++){
                if(s.equals(g[i])){
                    values.add(p[i]);
                }
            }
            values.sort((o1,o2)->{
                return o2-o1;
            });
            int max_fir = values.get(0);
            int max_index = -1;
            for(int j=0; j<p.length;j++){
                if(s.equals(g[j])&&p[j]==max_fir){
                    max_index=j;
                    ans.add(j);
                    break;
                }
            }

            if(values.size()>1){
                int max_sec = values.get(1);
                int sec_index = -1;
                for(int j=0; j<p.length;j++){
                    if(s.equals(g[j])&&p[j]==max_sec&& j!=max_index){
                        ans.add(j);
                        break;
                    }
                }
            }


        }

        return ans.stream().mapToInt(i->i).toArray();
    }
}