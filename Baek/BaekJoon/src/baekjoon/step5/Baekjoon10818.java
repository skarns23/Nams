package baekjoon.step5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
public class Baekjoon10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer (br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int[] arr =new int [size];
		st = new StringTokenizer(br.readLine());
		for(int i =0 ; i<size;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		bw.write(arr[0]+" "+arr[size-1]);
		bw.flush();
		
		/* Scanner를 사용하는 코드보다 BufferedReader를 활용할 때 속도가 1.8배 정도 향상됨
		 * Scanner sc = new Scanner(System.in); int count = sc.nextInt();
		 * 
		 * int arr[] = new int [count]; 
		 * for(int i =0; i<count;i++) 
		 * arr[i] =sc.nextInt(); 
		 * sc.close(); 
		 * Arrays.sort(arr);
		 * System.out.print(arr[0]+" "+arr[count-1]);
		 */
	}

}
