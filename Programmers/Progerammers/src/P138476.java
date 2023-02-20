import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/138476
// 귤 고르기
// 특정 개수의 정수를 뽑아서 해당 정수의 집합의 크기가 가장 작게되도록 하는 문제
// 아이디어 : 해당 문제에서는 총 고를 귤의 수를 나타냄, 반대로 생각하면 총 귤의 수에서 고를 귤의 수를 뺴어, 제거할 귤의 수를 활용함
//          Map 자료구조를 활용해 key : 귤의 크기, value : 귤의 수를 나타내도록 한 뒤, keySet 메서드를 활용하여 가져오고
//          가져온 귤의 수 값들을 sorting 하여 뺴줌
public class P138476 {
    class Solution {
        public int solution(int k, int[] tangerine) {
            // 제거할 귤의 수를 담는 정수형 변수 drop
            int drop = tangerine.length - k;

            // Key : 귤의 크기, Value : 귤의 수
            Map<Integer,Integer> map = new HashMap<>();

            // map 인스턴스에 귤의 값들을 담는 과정
            // map.getOrDefault 메서드를 활용 -> 해당 key에 대한 값이 존재하는 경우 get 메서드 진행 / key에 대한 값이 없는 경우 0으로 가져옴
            for(int temp : tangerine){
                map.put(temp,map.getOrDefault(temp,0)+1);
            }

            // map에 존재하는 key 값들 갖는 List 생성
            List<Integer> lists = new ArrayList<>(map.keySet());

            // 결과 값으로는 lists (총 key의 갯수)크기로 선언
            int answer = lists.size();

            // List를 map에 저장된 귤의 수에 대해 정렬하는 과정
            lists.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o1) - map.get(o2);
                }
            });

            // 기존의 경우 while 문 및 list.remove(0)을 활용해서 진행했으나
            // for문을 활용한 뒤, get을 진행하는 것이 정렬이 일어나지 않아, 시간측면에서 더 좋아보여서 변경함
            for(int key : lists){
                drop -= map.get(key);
                answer--;
                if(drop<0){
                    break;
                }
            }
            answer = drop==0?answer :answer+1;
            return answer;
        }
    }
}
