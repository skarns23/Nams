import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
public class Baekjoon3034 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = (int)Math.pow((double)x,2)+(int)Math.pow(y, 2);
		int test = 0;
		for(int i = 0 ; i<num;i++) {
			test = sc.nextInt();
			if(r>=(int)Math.pow(test, 2)) {
				bw.write("DA\n");
			}
			else {
				bw.write("NE\n");
			}
		}
		bw.flush();
	}
}

