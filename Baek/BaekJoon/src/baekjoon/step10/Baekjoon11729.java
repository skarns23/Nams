package baekjoon.step10;
import java.io.*;
import java.math.*;
public class Baekjoon11729 {
		
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		
		
		int num =Integer.parseInt(br.readLine());
		
		bw.write((int)Math.pow(2, num)-1+"\n");
		solution(num,1,2,3);
		bw.flush();
		
	}
	public static int solution(int n, int start, int mid, int end) throws IOException  {
		if(n == 1) {
			bw.write(start+" "+end+"\n");
			return 0;
		}else
		{
		
		solution(n-1,start,end,mid); //시작점에서 중간기둥으로 n-1개의 원판을 옮기기 위함 
		bw.write(start+" "+end+"\n");
		solution(n-1,mid,start,end);
		}
		return 0;
	}

}
