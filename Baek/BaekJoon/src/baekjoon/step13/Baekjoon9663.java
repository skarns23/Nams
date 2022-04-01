package baekjoon.step13;
import java.io.*;
import java.util.*;
public class Baekjoon9663 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr;
	static int count = 0;
	static int size;
	// arr 배열의 인덱스는 열, value는 행으로 생각해서 문제를 진행 
	public static void nQueen(int depth) {
		if(depth==size) { //세운 퀸의 갯수가 같으면 정답 갯수 증가
			count++;
			return ;
		}
		
		
		for(int i = 0 ; i<size;i++) {
			arr[depth] = i;
			if(pos(depth)) { // 놓은 말이 공격받는지 검사 
				nQueen(depth+1);
			}
		}
		
	}
	
	public static boolean pos(int depth) {
		
		for(int i = 0; i<depth;i++) {
			if(arr[depth]==arr[i]) { //같은 행에 존재하는 경우
				return false;
			}
			else if((arr[depth]-depth)==(arr[i]-i)) { // 왼쪽상단 대각선 검사
				return false;
			}
			else if ((arr[depth]+depth)==(arr[i]+i)) { //우측 상단 대각선 검사
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		arr = new int [size];
		nQueen(0);
		System.out.println(count);
		
	}

}
