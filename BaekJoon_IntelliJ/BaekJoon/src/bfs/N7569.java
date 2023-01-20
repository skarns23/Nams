package bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/7569
// 토마토
// 익은 토마토를 기준으로 토마토 전체가 익는 일수를 구하는 프로그램
public class N7569 {
    // 토마토 값을 입력받는 배열 arr, 내부 메서드에서 사용하기위해 static으로 선언
    static int[][][] arr;
    // 토마토 판의 길이 M은 열의 수, N은 행의 수, H는 상자의 높이 마찬가지로 내부 메서드에서 활용하기위해 static으로 선언
    static int M;
    static int N;
    static int H;
    // BFS 구현을 위한 Queue ,내부메서드 활용을 위한 static 선언
    static Queue<Tomato2> que = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        // 입출력을 위한 Reader와 Writer 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // M과 N 값 입력을 위해 Line으로 읽음
        // 이후 split을 통해 정수 값을 추출하고 인덱스를 통해 M과 N, H에 값 부여
        String str = br.readLine();
        M = Integer.parseInt(str.split(" ")[0]);
        N = Integer.parseInt(str.split(" ")[1]);
        H = Integer.parseInt(str.split(" ")[2]);
        // 배열 크기 선언
        arr = new int [H][N][M];
        // 배열 값 초기화 및 토마토가 있는 위치의 경우 Tomato 인스턴스 생성 후 Queue에 삽입
        for(int k=0;k<H;k++) {
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    arr[k][i][j] = Integer.parseInt(st.nextToken());
                    if (arr[k][i][j] == 1) {
                        que.add(new Tomato2(i, j,k, 0));
                    }
                }
            }
        }
        // 토마토를 채우는 일수의 경우, 모든 토마토가 채워져있을 수 있으므로 0으로 설정한 뒤
        // Queue에 원소가 하나가 남을때마다 비교를 통해 갱신
        int maxDay = 0;
        while(!que.isEmpty()){
            if(que.size()==1){
                maxDay = Math.max(que.peek().day,maxDay);
            }

            pushTomato(que.poll());

        }
        // 토마토 배열을 돌아다니며 안채워진 곳이 있는지 확인
        for(int k=0;k<H;k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 안채워진 곳이 있는 경우 토마토가 다익은 날을 -1 값으로 설정 후 종료
                    if (arr[k][i][j] == 0) {
                        maxDay = -1;
                        break;
                    }
                }
            }
        }
        // 토마토 다 채운날 출력
        bw.write(maxDay+"");
        bw.flush();

    }
    // 입력받은 토마토의 상하좌우에 토마토가 있는지 판단하고
    // 토마토가 존재하지만 안익은 경우 익은 토마토로 만들고 Queue에 넣어 BFS 구현

    public static void pushTomato(Tomato2 tomato){
        // 토마토 주변 좌상우하 순으로 탐색하기 위한 x, y 값
        int[] indexX = {0,-1,0,1};
        int[] indexY = {-1,0,1,0};
        // 아래 상자와 위에 상자를 탐색하기위한 Z인덱스 값
        int[] indexZ = {-1,1};
        for(int i = 0; i<4;i++){
            // 갱신된 x, y 인덱스가 배열 크기를 벗어나지 않는지 판단
            int nextX = tomato.x+indexX[i];
            int nextY = tomato.y+indexY[i];
            if((0<=nextX && nextX<N) &&(0<=nextY && nextY<M)){
                // 크기를 벗어나지 않으며, 해당 위치의 토마토가 안익은 경우
                if(arr[tomato.z][nextX][nextY]==0){
                    arr[tomato.z][nextX][nextY] = tomato.day+1; // 해당 위치에 토마토가 익은 날 값을 넣어줌
                    // Tomato 인스턴스 생성 후 queue에 삽입하여 해당 토마토를 기준으로 BFS가 되도록 해줌
                    que.add(new Tomato2(nextX,nextY,tomato.z, tomato.day+1));
                }
            }
        }
        for(int i=0;i<2;i++){
            int nextZ = tomato.z+indexZ[i];
            if(0<=nextZ && nextZ<H){
                // 크기를 벗어나지 않으며, 해당 위치의 토마토가 안익은 경우
                if(arr[nextZ][tomato.x][tomato.y]==0){
                    arr[nextZ][tomato.x][tomato.y] = tomato.day+1; // 해당 위치에 토마토가 익은 날 값을 넣어줌
                    // Tomato 인스턴스 생성 후 queue에 삽입하여 해당 토마토를 기준으로 BFS가 되도록 해줌
                    que.add(new Tomato2(tomato.x,tomato.y,nextZ, tomato.day+1));
                }
            }
        }
    }
}
// 토마토의 정보를 담는 클래스
class Tomato2 {
    int x; // 위치하는 토마토의 x 좌표
    int y; // 위치하는 토마토의 y 좌표
    int z; // 위치하는 토마토의 z 좌표
    int day; // 토마토가 익은 날

    public Tomato2(int x,int y,int z, int day){
        this.x = x;
        this.y = y;
        this.z = z;
        this.day = day;
    }
}