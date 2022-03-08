package baekjoon.step5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
public class Baekjoon2577 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] arr = new int [10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int result = 1;
		int[] input = new int[3];
		for(int i = 0;i <3;i++) {
			st = new StringTokenizer(br.readLine());
			result*=Integer.parseInt(st.nextToken());
		}
		while(result>0) {
			arr[result%10]++;
			result/=10;
		}
		for(int i =0;i<arr.length;i++)
			bw.write(arr[i]+"\n");
		bw.flush();
	}

}
