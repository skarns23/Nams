package baekjoon.step13;
import java.io.*;
import java.util.*;
public class Baekjoon9663 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr;
	static int count = 0;
	static int size;
	// arr �迭�� �ε����� ��, value�� ������ �����ؼ� ������ ���� 
	public static void nQueen(int depth) {
		if(depth==size) { //���� ���� ������ ������ ���� ���� ����
			count++;
			return ;
		}
		
		
		for(int i = 0 ; i<size;i++) {
			arr[depth] = i;
			if(pos(depth)) { // ���� ���� ���ݹ޴��� �˻� 
				nQueen(depth+1);
			}
		}
		
	}
	
	public static boolean pos(int depth) {
		
		for(int i = 0; i<depth;i++) {
			if(arr[depth]==arr[i]) { //���� �࿡ �����ϴ� ���
				return false;
			}
			else if((arr[depth]-depth)==(arr[i]-i)) { // ���ʻ�� �밢�� �˻�
				return false;
			}
			else if ((arr[depth]+depth)==(arr[i]+i)) { //���� ��� �밢�� �˻�
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
