package bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/1697
// 숨바꼭질 문제
// 출발점과 도착점까지 -1, +1, *2 연산을 통해 도착하는 최소 경우의 수를 찾는 문제
// 로직 : 배열을 최대 값으로 초기화 후, 도착하는 위치의 값에 대해 더 작은 경우에만 값 변경 및 Queue에 값 삽입
public class N1697 {

    public static void main(String[] args) throws  Exception{
        // 입출력을 위한 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 출발점과 도착점의 값을 담는 문자열 입력받음
        String str = br.readLine();
        // 이후 출발점을 뜻하는 변수 start, 도착점을 뜻하는 변수 end에 값 대입
        int start = Integer.parseInt(str.split(" ")[0]);
        int end = Integer.parseInt(str.split(" ")[1]);

        // 좌표의 경우, 최대 값부터 뒤로 오는 경우의 수도 가능함으로 최대 크기로 초기화 
        int[] visited = new int[100001];
        
        // BFS를 위한 Queue 생성 
        Queue<Node> que = new LinkedList<>();
        // visited 배열에 대한 값을 최대 값인 100000으로 초기화
        Arrays.fill(visited,100000);
        // 출발점에 대한 정보를 담은 Node 인스턴스 생성 및 Queue에 삽입 
        que.add(new Node(start,0));
        // 시작점 인덱스 값 초기화 
        visited[start] = 0;
        // BFS에 활용되는 Queue에 Node 인스턴스가 존재하지 않을때 까지 반복 
        while(!que.isEmpty()){
            Node pre = que.poll();
            // 현재 위치 +1의 경우 최대 크기인 100000을 넘어서는 경우만 아니면 에러 발생 없음
            // 이동가능한 인덱스인 경우, 해당 인덱스의 value보다 현재 count 쵯수가 적으면 값 변경 및 que에 삽입하여 BFS 가능하도록 구현
            if(pre.start+1<=100000&&visited[pre.start+1]>pre.count+1){
                visited[pre.start+1] = pre.count+1;
                que.add(new Node(pre.start+1,pre.count+1));
            }
            // 현재 위치 -1의 경우 최소 크기인 0을 넘어서는 경우만 아니면 에러 발생 없음
            // 이동가능한 인덱스인 경우, 해당 인덱스의 value보다 현재 count 쵯수가 적으면 값 변경 및 que에 삽입하여 BFS 가능하도록 구현
            if(0<=pre.start-1&&pre.start-1<=100000&&visited[pre.start-1]>pre.count+1){
                visited[pre.start-1] = pre.count+1;
                que.add(new Node(pre.start-1,pre.count+1));
            }
            // 현재 위치 *2의 경우 최대 크기인 100000을 넘어서는 경우만 아니면 에러 발생 없음
            // 이동가능한 인덱스인 경우, 해당 인덱스의 value보다 현재 count 쵯수가 적으면 값 변경 및 que에 삽입하여 BFS 가능하도록 구현
            if(pre.start*2<=100000&&visited[pre.start*2]>pre.count+1){
                visited[pre.start*2] = pre.count+1;
                que.add(new Node(pre.start*2,pre.count+1));
            }
        }
        bw.write(visited[end]+"");
        bw.flush();
    }
    
    // 현재 인덱스에 대한 정보와 이동한 횟수 값을 가지는 Node 클래스
    public static class Node{
        int start;
        int count;
        public Node(int start,int count){
            this.start=start;
            this.count=count;
        }
    }
}
