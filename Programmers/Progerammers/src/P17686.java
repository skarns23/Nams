public class P17686 {
    class Solution {
        public String[] solution(String[] files) {
            String[] answer = {};
            return answer;
        }

    }

    public static class File implements  Comparable<File>{
        String head;
        String fnum;
        String tail;
        int idx;

        @Override
        public int compareTo(File o) {
            if(head.toLowerCase().equals(o.head.toLowerCase())){
                if((Integer.parseInt(fnum) == Integer.parseInt(o.fnum))
            }
            return ;
        }
    }
}
