package baekjoon.step11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Baekjoon7568 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		int[][] arr =new int [size][2];
		StringTokenizer st;
		for(int i =0; i<size;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		int[] result = new int [size];
		for(int i =0;i<size;i++) {
			for(int j =0;j<size;j++) {
				if(i !=j &&(arr[i][0]<arr[j][0])&&(arr[i][1]<arr[j][1]))
				{
					result[i]++;
				}
			}
			bw.write(++result[i]+" ");
		}
		bw.flush();
		
	}

}
