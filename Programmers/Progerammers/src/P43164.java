import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/43164#
// 여행경로
// 주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 "ICN" 공항에서 출발합니다.
//항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
public class P43164 {
    static class Solution {
        // 항공권 사용여부를 담는 배열
        static boolean[] visited;
        // 결과 값을 담을 문자열 배열
        static String[] result;
        public String[] solution(String[][] tickets) {
            // 항공권 방문 여부 배열 초기화
            visited = new boolean [tickets.length];
            // 결과 값 배열 초기화
            result = new String[1];
            result[0] = "ICN";

            // 재귀함수 내에서 활용한 문자열 배열 생성 및 초기화
            String[] arr = new String[tickets.length+1];
            arr[0] = "ICN";

            // dfs 초기 파라미터 값 설정 후, 실행
            dfs("ICN",1,tickets,arr);
            return result;
        }

        // DFS 함수
        // 파라미터 : 시작하는 공항 위치, 탐색 중인 재귀함수의 depth, 항공권 정보를 담은 2차원 String 배열, depth 탐색 값을 담아놓은 String 배열
        public static void dfs(String start, int depth, String[][] tickets,String[] arr){
            // 탐색 depth 가 마지막인 경우
            if(depth==arr.length){
                // 모든 항공권에 대해 방문하였는지 여부 판단
                for(boolean visit : visited){
                    // 사용하지 않은 항공권이 있다면 함수 종료
                    if(!visit){
                        return;
                    }
                }
                // 결과 값 배열의 값이 초기화 되지 않은 경우
                if(result.length==1) {
                    result = new String[arr.length];
                    // 해당 depth 까지 값을 담아온 arr 배열의 값 복사
                    result = Arrays.copyOf(arr,arr.length);
                }
                else {
                    // result 배열에 값이 존재하는 경우, 담아온 arr 배열과 비교한 뒤 값 설정
                    for(int i =0;i<result.length;i++){
                        // compareTo 메서드를 활용한 동일 위치의 항공권 정보 비교
                        // compareTo 메서드의 경우 서로 다른 같은 길이의 문자열에 대해 비교하는 경우
                        // 앞자리부터 비교하여 다른 경우 해당 아스키코드 값 차이를 반환함
                        int temp = result[i].compareTo(arr[i]);
                        if(temp<0){
                            return;
                        }else if(temp>0){
                            result = Arrays.copyOf(arr,arr.length);
                            return;
                        }
                    }
                }
                return;
            }
            // 항공권의 시작 위치가 같고, 사용하지 않은 항공권에 대해서 재귀 함수 호출
            for(int i=0;i<tickets.length;i++){
                if(!visited[i] && tickets[i][0].equals(start)){
                    visited[i] = true;
                    arr[depth] = tickets[i][1];
                    dfs(tickets[i][1],depth+1,tickets,arr);
                    visited[i] = false;
                }
            }

        }


    }
}
