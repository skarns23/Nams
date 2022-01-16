package baekjoon;
import java.util.*;
public class Baekjoon2754 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		double sum=0;
		switch (str)
		{
		case "A+":
			sum = 4.3;
			break;
		case "A0":
			sum = 4.0;
			break;
		case "A-":
			sum = 3.7;
			break;
		case "B+":
			sum = 3.3;
			break;
		case "B0":
			sum = 3.0;
			break;
		case "B-":
			sum = 2.7;
			break;
		case "C+":
			sum = 2.3;
			break;
		case "C0":
			sum = 2.0;
			break;
		case "C-":
			sum = 1.7;
			break;
		case "D+":
			sum = 1.3;
			break;
		case "D0":
			sum = 1.0;
			break;
		case "D-":
			sum = 0.7;
			break;
		case "F":
			sum = 0.0;
			break;
			
		}
		System.out.print(sum);
			
			
		
		
	}

}
