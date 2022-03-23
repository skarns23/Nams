package ch06;

import java.util.Arrays;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		for(int i : arr) {
			System.out.println(i);
		}
		Arrays.stream(arr).forEach(n->System.out.println(n));
	}

}
