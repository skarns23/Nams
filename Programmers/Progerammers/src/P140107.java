import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/140107?language=java
// 점 찍기 문제
// 주어진 거리에 대해 찍을 수 있는 점 집합의 수를 구하는 문제
//
public class P140107 {
    static class Solution {
        public long solution(int k, int d) {
            long answer = 0;
            // 정해진 거리 사용할 수 있는 점 (K의 배수)만큼 반복하는 for문
            for(int i=0;i<=d;i+=k){
                long maxDist = maxDistance(i,d);
                answer +=maxCount(maxDist,k);
            }
            return answer;
        }
        /*
        * 가능한 거리와 현재 위치 점에서 나올 수 있는 최대 거리를 구하는 함수
        * */
        public static long maxDistance(long i,long d){
            long len = (long)(Math.sqrt((Math.pow(d,2)-Math.pow(i,2))));
            return len;
        }

        /*
        * 주어진 거리에 대해서 활용할 수 있는 점의 수를 구하는 함수
        * +1의 경우에는 0 또한 포함되어야하기때문
        * */
        public static long maxCount(long i,long k){
            return i/k+1;
        }
    }
}
