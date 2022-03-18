package baekjoon.step12;
import java.io.*;
import java.util.*;
public class Baekjoon18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr =new int [size];
		for(int i =0; i<size;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		int[] tmp= arr.clone();
		Arrays.sort(tmp);
		HashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
		int count = 0;
		
		for(int i =0; i<size;i++) {
			if(!map.containsKey(tmp[i])) {
				map.put(tmp[i], count);
				count++;
			}
		}
		for(int i =0; i<size;i++) {
			bw.write(map.get(arr[i])+" ");
		}
		bw.flush();
	}
	
}
