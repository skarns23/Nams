package baekjoon.step12;
import java.io.*;
import java.util.*;
import java.math.*;
public class Baekjoon2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int [size]; //중앙 값을 찾을 배열
		int[] index = new int [8001]; //카운팅 정렬을 진행할 배열 
		int sum = 0;
		int max_value = Integer.MIN_VALUE;
		int min_value = Integer.MAX_VALUE;
		for(int i =0;i<size;i++) {
			int num = Integer.parseInt(br.readLine());
			index[num+4000]++;
			arr[i] = num;
			if(size == 1) 
			{
					max_value = num;
					min_value = num;
			}
			else
			{
				if(max_value<num)
					max_value = num;
				if(min_value>num)
					min_value = num;
			}
			sum +=num;
		}
		Arrays.sort(arr);
		double avg = (double)sum / size;
		
		
		
		int mode_max = 0;
		int mode = 10000;
		boolean flag = false;
		for(int i = min_value+4000;i<=max_value+4000;i++) {
			if(index[i]!=0) { //카운팅 정렬을 진행했기때문에 인덱스의 값이 0이면 등장하지 않은 것이므로 진행하지 않음
				
				if(index[i]>mode_max) { // index[i]의 값이 최빈 값 보다 큰 경우 
					mode_max = index[i]; // 최빈 값을 바꾸고
					mode = i - 4000; // 해당 하는 value를 저장
					flag = true; // 처음 등장한 경우이므로 true 설정
				}
				else if(index[i] == mode_max &&flag) { // 최빈 값이 두번째로 등장한 경우
					flag = false; // 두번째를 기억하기 위헤 false로 설정
					mode = i-4000; // 두번쨰로 등장한 최빈 값을 mode값으로 설정
				}
			}
		}
		
		
		
		bw.write(Math.round(avg)+"\n");
		bw.write(arr[(size-1)/2]+"\n");
		bw.write(mode+"\n");
		bw.write(max_value-min_value+"");
		bw.flush();

		}
		
	}

		


