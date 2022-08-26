
// 없는 숫자 더하기  22.08.26
// 0~9까지의 숫자 중 속하지 않는 정수를 합하여 반환하는 문제
public class ExistNumber {

    class Solution {
        public int solution(int[] numbers) {
            //numbers는 0~9까지의 수가 담긴 배열
            int answer = 0;
            int[] arr = new int [10];
            for (int i : numbers ){
                //수가 존재하는 경우 해당 인덱스의 값을 1로 설정
                arr[i]++;
            }
            for (int i=1;i<10;i++){
                // 이후 배열 중 값이 0인 인덱스 값을 더함
                if(arr[i]==0){
                    answer+=i;
                }
            }
            return answer;
        }
    }
}
