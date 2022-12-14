import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/42839
// 소수 찾기
// 한자리의 숫자가 적힌 종지 조각들을  붙여 소수를 몇개 만들 수 있는지 판별하는 문제
// 아이디어 : 문자열을 전부 분해한 뒤, DFS를 활용한 탐색 및 에라토스테네스의 체 알고리즘 활용
public class P42839 {

    static class Solution {
        // 숫자를 분해한 뒤 담을 배열 arr
        static String[] arr;
        // DFS에서 방문한 노드 확인을 위한 배열 visited
        static boolean[] visited;
        // 특정 값까지에 대해 소수 여부를 저장하는 배열 isNum
        static boolean[] isNum;
        // 찾은 소수 값의 중복을 막기위한 결과 값의 집합 set
        static Set<Integer> set = new HashSet<>();



        public int solution(String numbers) {
            // 넘어온 문자열의 길이 값을 저장하는 변수 선언 및 초기화
            int len = numbers.length();
            // 문자열을 추출한 뒤 담을 배열 및 방문 여부를 확인하는 배열 크기 선언
            arr =  new String[len];
            visited = new boolean[len];

            // 소수를 찾는 배열의 크기를 정하는 코드
            // 만들 수 있는 문자의 최대 길이의 최대 값 으로 설정
            int checkNum = Integer.parseInt("9".repeat(len));
            isNum = new boolean[checkNum+1];
            // 처음에 소수를 찾는 배열의 경우 모두 소수라고 생각하고 true로 초기화
            Arrays.fill(isNum,true);
            // 0과 1은 소수가 아니므로 초기화
            isNum[0] = false; isNum[1] = false;

            // 문자를 때서 배열에 담아주는 과정
            for(int i = 0 ;i<numbers.length();i++)arr[i] = numbers.charAt(i)+"";

            // 에라토스테네스의 채 알고리즘을 적용하여 배열에 소수찾기  
            for(int i = 2;i<=(int)(Math.sqrt(checkNum))+1;i++){
                if(isNum[i]){
                    for(int j = i*2; j<=checkNum;j+=i){
                        isNum[j] = false;
                    }
                }
            }
            // dfs 실행 
            dfs(0,"");
            return set.size();
        }
        
        // 실제 완전 탐색을 진행하는 함수 
        public static  void dfs(int depth, String val){
            // 만들어지는 모든 경우에 대해서 검증을 진행 
            // 문자열이 비어있지 않고, 소수인 경우  set에 값을 담아줌 
            if(val.length()!=0&&isNum[Integer.parseInt(val)]){
                set.add(Integer.parseInt(val));
            }
            // 문자열의 최대길이를 넘어선 경우 종료 
            if(depth==arr.length) return ;
            
            // 해당 문자열을 값에 담지 않은 경우 문자열에 더해준 뒤 dfs 적용
            for(int i = 0 ;i<arr.length;i++){
                if(!visited[i]){
                    visited[i] = true;
                    dfs(depth+1,val+arr[i]);
                    visited[i] = false;
                }
            }

        }
    }
}
