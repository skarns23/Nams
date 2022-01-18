package baekjoon;
import java.io.*;
public class Baekjoon10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [10001];
		for(int i=0; i<N;i++)
		{
			int num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		for(int i=1;i<10001;i++)
		{
			for(int j = 0;j<arr[i];j++)
				bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}

}
