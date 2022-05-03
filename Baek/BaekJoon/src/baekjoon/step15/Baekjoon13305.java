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
		int[] price = new int [size-1];
		for(int i=0;i< size-1;i++) {
			distance[i] = Integer.parseInt(st1.nextToken());
			price[i] = Integer.parseInt(st2.nextToken());
		}
	}

}
