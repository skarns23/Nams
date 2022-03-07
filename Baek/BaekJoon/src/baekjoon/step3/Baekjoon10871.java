package baekjoon.step3;
import java.util.*;
public class Baekjoon10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int lit = sc.nextInt();
		for(int i =0; i<size;i++) {
			int input = sc.nextInt();
			if(input<lit) {
				System.out.print(input+" ");
			}
		}
	}

}
