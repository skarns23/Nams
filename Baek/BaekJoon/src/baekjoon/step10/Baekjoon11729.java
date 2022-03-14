package baekjoon.step10;
import java.io.*;
import java.math.*;
public class Baekjoon11729 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num =Integer.parseInt(br.readLine());
		
		bw.write((int)Math.pow(2, num)-1+"\n");
		solution(num,1,2,3,bw);
		bw.flush();
		
	}
	public static int solution(int n, int start, int mid, int end,BufferedWriter bw) throws IOException {
		if(n == 1) {
			bw.write(start+" "+end+"\n");
			return 0;
		}else
		{
		
		solution(n-1,start,end,mid,bw);
		bw.write(start+" "+end+"\n");
		solution(n-1,mid,start,end,bw);
		}
		return 0;
	}

}
