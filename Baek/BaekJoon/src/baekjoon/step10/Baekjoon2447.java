package baekjoon.step10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2447 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i<num;i++) {
			for(int j = 0; j<num;j++) {
				solution(i,j,num,bw);
			}
			bw.write("\n");
		}
		bw.flush();
		
	}
	
	public static int solution(int start, int end, int num,BufferedWriter bw) throws IOException {
		if((start/num)%3==1 &&(end/num)%3 == 1) { //정수형 변수의 나눗셈을 활용
			bw.write(" ");
		}
		else
		{
			if(num/3 == 0) {
				bw.write("*");
			}
			else
			{
				solution(start,end,num/3,bw);
			}
		}
		return 0;
	}

}
