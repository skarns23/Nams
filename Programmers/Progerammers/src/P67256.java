import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/67256
// 키패드 누르기 문제
// 해당 문제의 경우 주어진 번호판을 누르기위해서 어떤 손으로 눌러야할지를 출력하는 문제
public class P67256 {
    class Solution {
        public String solution(int[] numbers, String hand) {
            // 결과 값을 담아 반환할 StringBuilder 생성
            StringBuilder sb = new StringBuilder();

            // 초기 시작점 왼손과 오른손 설정
            int[] left = {4,1};
            int[] right = {4,3};

            // 주로 쓰는 손이 왼손인지 여부를 담아 거리가 같은 경우 활용
            boolean leftHand = hand.equals("left");
            // 누를 번호에 따른 값 탐색
            for(int i : numbers){

                // 누를 번호가 0인경우 나머지 연산을 통해 위치를 추출할 수 없어 따로 처리
                if(i==0){
                    // 0의 위치인 4,2와 왼손 오른손의 거리를 맨해튼 거리로 구함
                    int disL = (Math.abs(left[0]-4))+(Math.abs(left[1]-2));
                    int disR = (Math.abs(right[0]-4))+(Math.abs(right[1]-2));
                    // 양손의 거리가 같은 경우
                    if(disR==disL){
                        if(leftHand){ // 왼손잡이인 경우 왼손으로 누름
                            sb.append("L");
                            left = new int[]{4,2}; // 이후 위치 갱신
                        }else { // 오른손잡이인 경우 오른손으로 누르고 위치 갱신
                            sb.append("R");
                            right = new int[]{4,2};
                        }
                    } else if(disL>disR){ // 오른손이 거리가 더 짧은 경우 오른손으로 클릭
                        sb.append("R");
                        right = new int[]{4,2};
                    } else { // 왼손이 더 가까운 경우 왼손으로 클릭
                        sb.append("L");
                        left = new int[]{4,2};
                    }
                    continue; // 이후 밑에 조건문에 걸리지않도록 continue를 통해 넘어감
                }
                if(i%3==1){ // 번호가 1번열에 있는 숫자인 경우 무조건 왼손으로 누름
                    sb.append("L");
                    left = new int[]{(i/3)+1,1}; // 이후 왼손을 주어진 숫자에 맞는 위치로 갱신
                }else if(i%3==0){ // 번호가 3번열에 있는 숫자인 경우 무조건 오른손으로 누름
                    sb.append("R");
                    right = new int[]{i/3,3}; // 숫자에 맞춰 오른손 위치 갱신
                }else if(i%3==2){ // 중간에 있는 숫자인 경우 맨해튼 거리를 비교
                    int disL = (Math.abs(left[0]-(i/3+1)))+(Math.abs(left[1]-2)); // 각 x와 y축으로의 거리만을 구해서 비교
                    int disR = (Math.abs(right[0]-(i/3+1)))+(Math.abs(right[1]-2));
                    if(disR==disL){ // 맨해튼 거리가 같은 경우
                        if(leftHand){ // 왼손이 주손인지 판단
                            sb.append("L"); // 맞다면 왼손으로 누르고 위치갱신
                            left = new int[]{i/3+1,2};
                        }else { // 오른손이 주손인 경우
                            sb.append("R"); // 오른손으로 누르고 위치 갱신
                            right = new int[]{i/3+1,2};
                        }
                    } else if(disL>disR){ // 오른손이 더 가까운 경우
                        sb.append("R"); // 오른손으로 클릭 후 위치 갱신
                        right = new int[]{i/3+1,2};
                    } else { // 왼손이 더 가까운 경우
                        sb.append("L"); // 왼손으로 쿨릭 후 위치 갱신
                        left = new int[]{i/3+1,2};
                    }

                }
            }
            return sb.toString();
        }
    }
}
