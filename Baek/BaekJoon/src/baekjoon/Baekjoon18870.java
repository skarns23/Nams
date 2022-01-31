package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
public class Baekjoon18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int size = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] input = new int [size];
		for(int i=0; i <size;i++) {
			input[i] = Integer.parseInt(arr[i]);
		}
		int count=0;
		int[] tmp = input.clone();
		Arrays.sort(tmp);
		HashMap<Integer,Integer> hash = new HashMap<>();
		for(int i = 0 ;i<size;i++) {
			if(!hash.containsKey(tmp[i])) {
				hash.put(tmp[i], count);
				count++;
			}
		}
		for(int i =0; i<size;i++) {
			sb.append(hash.get(input[i])).append(" ");
		}
		System.out.println(sb.toString());
	}
	
}
