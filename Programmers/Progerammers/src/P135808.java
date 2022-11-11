import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
// 과일장수
// 상자에 사과를 M개씩 담으며 가장 가치가 낮은 사과의 가치로 팔린다 이떄 최대 판매 수익을 얻는 법은?
// 오름차순 정렬 후 가장 뒤에서 부터 M개가 되면 현재 위치의 값 *M 가치를 결과에 더하여 줌
public class P135808 {
    class Solution {
        public int solution(int k, int m, int[] score) {
            // 결과 값을 담을 변수 answer
            int answer = 0;
            // 배열 정렬을 통해, 가치 순서대로 사과를 나열함
            Arrays.sort(score);
            // count는 뒤에서부터 m개의 수를 세고 다시 m값으로 초기화됨
            // m개의 사과를 담았는지 판단하기 위한 변수
            int count = m;
            for(int i = score.length-1;i>=0;i--){
                // 사과를 m개만큼 다담은 경우 1이 됨
                if(count==1){
                    // 결과 값에 사과 중 최소 값 * m을 통해 상자의 가치를 더해줌
                    answer += m*score[i];
                    // 다시 갯수를 세는 변수 초기화 해줌
                    count = m;
                    continue;
                }
                count--;
            }

            return answer
        }
    }
}
