package baekjoon.step12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Baekjoon18870_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int [size];
		for(int i = 0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int[] tmp = arr.clone();
		
		Arrays.sort(arr);
		int count =0;
		HashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(int i :arr) {
			if(!map.containsKey(i)) {
				map.put(i, count);
				count++;
			}
		}
		for(int i=0; i<size;i++) {
			System.out.print(map.get(tmp[i])+" ");
		}
	}

}
