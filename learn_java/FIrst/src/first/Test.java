package first;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
public class Test {
	
	public static final int SIZE = 256000000;
	static int[] arr = new int [SIZE];
	public static void fill (int []arr) {
		for(int i = 0; i<SIZE;i++) {
			arr[i] = i;
		}
	}
	
	public static void Scramble(int []arr) {
		Random rand = new Random();
		int tmp;
		for(int i =0; i<SIZE/2;i++) {
			int j = rand.nextInt(SIZE);
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}
	public static void main(String[] args) throws IOException {
		
		fill(arr);
		Scramble(arr);
		
	}

}
