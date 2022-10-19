import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/120875
// 평행 문제
// 4개의 점이 주어질때 평행한 직선을 만들 수 있는 점의 집합이 있는 가?
public class P120875 {
    class Solution {
        public int solution(int[][] dots) {
            // 0이라는 인덱스를 고정 시킨채로 나머지 점들과 조합하면 모든 직선을 확인할 수 있음
            // ex) 0,1 과 2,3  / 0,2 과 1,3 / 0,3 과 1,2
            for(int i = 1;i<4;i++){
                // Set에 각 나머지 1 2 3 인덱스를 넣고  i 값을 추출한뒤 나머지 인덱스의 기울기와 비교
                Set<Integer> set = new HashSet<>();
                set.add(1);
                set.add(2);
                set.add(3);
                set.remove(i);
                // 0번과 i 번 점의 기울기 계산
                int ax = (dots[0][0]-dots[i][0]);
                int ab = (dots[0][1]-dots[i][1]);
                if(ax ==0){ //  분모가 0이면 넘김
                    continue;
                }
                // 0 i 선의 기울기 계산
                double a = ((double)ab/(double)ax);
                int x = 0;
                int y= 0;
                // Set에있는 점 들을 토대로 기울기 만들기
                for(int j : set){
                    x = (dots[j][0]-x);
                    y = (dots[j][1]-y);
                }
                // 분모가 0이 아니면 비교해서 같은 경우 1 넘겨주고 종료 
                if(x!=0&&a==((double)y/(double)x)){
                    return 1;
                }
            }
            return 0;
        }
    }
}
