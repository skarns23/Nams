package baekjoon.step7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2675 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		for(int i = 0 ; i<num;i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j<str[1].length();j++) {
				for(int k =0; k<Integer.parseInt(str[0]);k++) {
					bw.write(str[1].charAt(j));
				}
			}
			bw.write("\n");
		}
		bw.flush();
		
	}

}
