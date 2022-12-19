import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/43105
// 정수 삼각형
// 정수 삼각형을 내려가며 더한다 그때 만들어지는 가장 큰 값을 뽑아내라
// 아이디어 : 사실상 내려가면서 모든 경우의 수에 대해서 찾아보았다.

public class P43105 {
    class Solution {
        public int solution(int[][] triangle) {
            // 2차원 배열의 행의 수 를 갖는 rowLen 변수
            int rowLen = triangle.length;
            // triangle에 있는 값을 깊은 복사하는 이차원 배열 value
            int[][] value = new int [rowLen][];
            // 배열 크기에 맞춰 생성
            for(int i = 0 ;i<rowLen;i++){
                value[i] = new int [triangle[i].length];
            }
            // 배열 깊은 복사
            for(int i = 0; i <rowLen;i++){
                for(int j =0;j<triangle[i].length;j++){
                    value[i][j] = triangle[i][j];
                }
            }
            // 아래층에 같은 열에있는 값 및 오른쪽에 있는 값 최신화
            for(int i = 0; i<rowLen-1;i++){
                for(int j =0; j<triangle[i].length;j++){
                    triangle[i+1][j] = Math.max(triangle[i + 1][j], value[i + 1][j] + triangle[i][j]);
                    triangle[i+1][j+1] = Math.max(triangle[i + 1][j + 1], value[i + 1][j + 1] + triangle[i][j]);
                }
            }
            // 이후 배열의 마지막 값 정렬한 뒤 가장 큰 값 출력 
            int[] result = triangle[rowLen-1];
            Arrays.sort(result);
            return result[result.length-1];
        }
    }
}
