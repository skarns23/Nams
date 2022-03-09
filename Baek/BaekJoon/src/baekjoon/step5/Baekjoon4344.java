package baekjoon.step5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
public class Baekjoon4344 {

	public static void main(String[] args) throws IOException {
		// 버퍼를 이용한 방식이 스캐너에 비해 2.5배가량 빠름
		/*
		 * Scanner sc = new Scanner(System.in); int num = sc.nextInt(); double[] result
		 * = new double[num]; for (int i=0; i<num;i++) { int sum=0; int count=0; int[]
		 * arr = new int[sc.nextInt()]; for (int j = 0;j<arr.length;j++) { arr[j] =
		 * sc.nextInt(); sum +=arr[j]; } result[i] = sum/arr.length; for (int
		 * j=0;j<arr.length;j++) { if(arr[j]>result[i]) count++; } result[i] =
		 * (double)count/(double)arr.length*100; } for (int i =0; i<num;i++) { String
		 * temp = String.format("%.3f", result[i]); System.out.println(temp+"%"); }
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int[] arr = new int [size];
		for(int i = 0; i<size;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int[] result = new int [num];
			int sum = 0;
			double avg = 0;
			for(int j = 0; j<num;j++) {
				result[j] = Integer.parseInt(st.nextToken());
				sum+=result[j];
			}
			int count = 0;
			avg = sum / num;
			for(int j = 0; j<num;j++) {
				if(result[j]>avg)
					count++;
			}
			bw.write(String.format("%.3f", ((double)count/num*100))+"%\n");
		}
		bw.flush();
	}

}
