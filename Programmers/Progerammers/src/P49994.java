import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/49994
// 방문 길이
// 주어진 규칙에 따라 이동하며, 이동한 처음으로 걸은 길이의 합을 구해야합니다. 같은 길을 두번 걷는 경우는 해당되지 않음
// Class 선언 후, equals 메서드와 hashCode 메서드를 재정의 하여 같은 방향으로 해당 길을 걸었는지 여부를 판단하도록 함
public class P49994 {
    static class Solution {
        // 길이 중첩되는 경우 제거하기 위해 Set 자료구조 활용
        public static Set<Node> set = new HashSet<>();

        public int solution(String dirs) {
            // 시작지점 5,5 (0,0)
            int sX = 5;
            int sY = 5;
            // 명령어를 순서대로 실행하기위한 반복문
            for(int i=0; i<dirs.length();i++){
                // 현재 실행될 명렁어
                String dir = dirs.charAt(i)+"";

                // 명령어로 인해, 이동하게될 위치 값을 나타는 변수
                int nX = sX;
                int nY = sY;

                // 명령어에 따른 이동 후, 위치 값 변경
                switch (dir){
                    case "U":
                        nX--;
                        break;
                    case "D":
                        nX++;
                        break;
                    case "L":
                        nY--;
                        break;
                    case "R":
                        nY++;
                        break;
                }

                // 이동한 위치가 갈 수 있는 곳이라면, Set에 추가후, 위치를 이동시켜줌
                if(isCheck(nX,nY)){
                    set.add(new Node(sX,sY,nX,nY));
                    sX = nX;
                    sY = nY;
                }

            }
            return set.size();
        }

        // 위치에 대해 이동가능한지 여부를 판단하는 함수 
        public static boolean isCheck(int x,int y){
            if((0<=x&&x<11)&&(0<=y&&y<11)){
                return true;
            }
            return false;
        }
        
        // 경로 값을 나타내는 Node 클래스
        // 시작점의 x, 시작점의 y, 도착점의 x, 도착점의 y 값을 필드 값으로 가짐
        public static class Node{
            int sX;
            int sY;
            int nX;
            int nY;
            public Node(int sX,int sY,int nX,int nY){
                this.sX = sX;
                this.sY = sY;
                this.nX = nX;
                this.nY = nY;
            }
            
            // equals 메서드를 재정의하여, 경로가 같은 지 여부를 판단
            @Override
            public boolean equals(Object obj){
                if(this==obj) return true;
                Node n = (Node)obj;
                if((this.sX==n.sX||this.sX==n.nX)&&(this.sY==n.sY||this.sY==n.nY)&&(this.nX==n.nX||this.nX==n.sX)&&
                        (this.nY==n.nY||this.nY==n.sY)){
                    return true;
                }
                return false;
            }
            
            // hashCode 메서드를 재정의하여, 해당 인스턴스와 같은 인스턴스가 존재하는지 판단
            @Override
            public int hashCode(){
                return Objects.hash(sX,sY,nX,nY)+Objects.hash(nX,nY,sX,sY);
            }

        }
    }
}
