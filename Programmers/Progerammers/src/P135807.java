import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/135807
// 숫자 카드 나누기
// 카드 길이가 같은 두 묶음에 대해 조건을 만족하는 가장 큰 양의 정수 a 구하기
// 조건
/*철수가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고 영희가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a
        영희가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고, 철수가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a*/
public class P135807 {
    class Solution {
        public int solution(int[] arrayA, int[] arrayB) {
            // 정답 값을 담기위한 정수형 변수 answer
            int answer = 0;

            // 영희와 철수에 대해 최대 공약수를 담을 변수 numA, numB
            int numA = 0;
            int numB = 0;

            // 가장 작은 값을 구하기 위해 두 배열을 sorting
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);

            // 각 배열 A,B에 대해 최대 공약수를 찾는 코드
            for(int i=arrayA[0];2<=i;i--){
                boolean flag = true;
                for(int j : arrayA){
                    if(j%i==0) continue;
                    flag = false;
                    break;
                }
                if(flag){
                    numA = i;
                    break;}
            }

            // 각 배열 A,B에 대해 최대 공약수를 찾는 코드
            for(int i=arrayB[0];2<=i;i--){
                boolean flag = true;
                for(int j : arrayB){
                    if(j%i==0) continue;
                    flag = false;
                    break;
                }
                if(flag) {
                    numB = i;
                    break;}
            }
            // 최대 공약수가 존재하는 경우 조건을 만족하는지 탐색
            boolean flagA = false;
            if(numA!=0){
                flagA = true;
                for(int i : arrayB){
                    if(i%numA!=0) continue;
                    flagA = false;
                    break;
                }
            }
            // 최대 공약수가 존재하는 경우 조건을 만족하는지 탐색
            boolean flagB = false;
            if(numB!=0){
                flagB = true;
                for(int i : arrayA){
                    if(i%numB!=0) continue;
                    flagB = false;
                    break;
                }
            }
            // 이후 최대 값 탐색 여부에 따른 최대 값 갱신
            answer = flagA?Math.max(numA,answer) : answer;
            answer = flagB?Math.max(numB,answer) : answer;
            return answer;
        }
    }
}
