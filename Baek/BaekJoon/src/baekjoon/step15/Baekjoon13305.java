// 주유소 문제 해당 문제에서는 거리 값과 리터 값을 연산할 경우 int범위를 넘어설 수 있음을 유의할 것
package baekjoon.step15;
import java.util.*;
import java.io.*;
public class Baekjoon13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] distance = new int [size-1];
		int[] price = new int [size];
		for(int i=0;i< size-1;i++) {
			distance[i] = Integer.parseInt(st1.nextToken());
			price[i] = Integer.parseInt(st2.nextToken());
		}
		long answer = 0; 
		int index = 0;
		for(int i =0;i<size-1;i++) {
			if(price[index]<=price[i]) {
				answer += (long)distance[i]*price[index];
			}
			else {
				index = i;
				answer +=(long)distance[i]*price[index];
			}
			
		}
		System.out.println(answer);
		
	}

}
