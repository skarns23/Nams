package bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/2178
// 미로 탐색 문제
// 0과 1로 구성된 미로를 입력받는다 목적지까지 가는데 걸리는 걸음 수를 구하는 문제
public class N2178 {

    public static void main(String[] args) throws IOException {
        // 입 출력을 위한 초기 BufferedReader, BufferedWriter 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 미로의 크기 N과 M을 입력받기 위함
        String NM = br.readLine();
        int N = Integer.valueOf(NM.split(" ")[0]);
        int M = Integer.valueOf(NM.split(" ")[1]);
        //BFS를 위한 Queue 생성
        Queue<Integer[]> que = new LinkedList<>();

        // 미로를 입력받을 배열 생성
        int[][] arr = new int [N][M];
        // 미로 배열 값 초기화
        for(int i = 0 ; i<N;i++) {
            NM = br.readLine();
            for(int j = 0;j<M;j++) {
                arr[i][j] = NM.charAt(j)-'0';
            }

        }
        // 초기 시작점 0,0 넣어줌
        que.add(new Integer[] {0,0});
        while(!que.isEmpty()) {
            Integer[] value = que.poll(); // que에 들어있는 인덱스 값 받아옴
            int[] indexX = {-1,0,1,0}; // 4방향 탐색을 위한 x축 인덱스 값 설정
            int[] indexY = {0,1,0,-1}; // 4방향 탐색을 위한 y축 인덱스 값 설정
            for(int i = 0;i<4;i++) {
                int nextX = value[0]+indexX[i];
                int nextY = value[1] +indexY[i];
                // 갱신된 인덱스 값이 정상 범주에 있는지, 방문한적이 없는 노드인지
                if((0<=nextX &&nextX<N)&&(0<=nextY&&nextY<M)&&arr[nextX][nextY]==1) {
                    que.add(new Integer[] {nextX,nextY});
                    arr[nextX][nextY] = arr[value[0]][value[1]]+1;
                }
            }
        }
        bw.write(arr[N-1][M-1]+"");
        bw.flush();


    }
}
