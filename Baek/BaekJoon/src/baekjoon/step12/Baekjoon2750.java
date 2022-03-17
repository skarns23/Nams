package baekjoon.step12;
import java.util.*;
public class Baekjoon2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr  = new int[size];
		for(int i=0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i :arr){
			System.out.println(i);
		}
		
	}

}
