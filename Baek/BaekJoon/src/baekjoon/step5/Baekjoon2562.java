package baekjoon.step5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Baekjoon2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int max =0;
		int index = 0;
		for(int i =0; i<9;i++) {
			st = new StringTokenizer(br.readLine());
			int tmp = Integer.parseInt(st.nextToken());
			if(max<tmp)
			{
				max = tmp;
				index = i+1;
			}
		}
		bw.write(max+"\n"+index+"\n");
		bw.flush();
		/*
		 * Scanner sc = new Scanner(System.in); int arr[] = new int[9]; for(int
		 * i=0;i<9;i++) arr[i]=sc.nextInt(); int max_value = arr[0]; int max_index = 0;
		 * for(int i=1;i<9;i++) { if(max_value<arr[i]) { max_value = arr[i]; max_index =
		 * i; } } System.out.println(max_value); System.out.println(max_index+1);
		 */}

}
