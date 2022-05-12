package baekjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Baekjoon2477 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int[] arr = new int [6];
		int val = sc.nextInt();
		int temp=1;
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for(int i = 1 ;i<5;i++) {
			map.put(i, new ArrayList<Integer>());
		}
		for(int i = 0 ; i<6;i++ ) {
			int index = sc.nextInt();
			map.get(index).add(sc.nextInt());
			arr[i] = index;
		}
		for(;temp<arr.length-2;temp++) {
			if(arr[temp-1]==arr[temp+1])
				break;
		}
		int max_x = 0, max_y = 0 ;
		int minus = map.get(arr[temp]).get(0) * map.get(arr[temp+1]).get(1);
		for(int i = 1;i<5;i++) {
			if(map.get(i).size()==1) {
				if(i<=2)
					max_y = map.get(i).get(0);
				else
					max_x = map.get(i).get(0);
			}
		}
		int rect = max_x*max_y -minus;
		System.out.println(rect*val);
	}

}
