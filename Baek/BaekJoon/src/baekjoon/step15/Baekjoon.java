package baekjoon.step15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Baekjoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		ArrayList<Integer> mlist = new ArrayList<>(); //마이너스 값을 담을 리스트
		ArrayList<Integer> plist = new ArrayList<>(); //플러스 값을 담을 리스트
		int zeros = 0; // 0의 갯수를 체크
		int answer = 0;
		for(int i = 0 ; i<num;i++) { // 입력을 받으면서 입력 값이 0 or 1이면 처리해줌
			int input = sc.nextInt();
			if(input ==1) // 1인경우 무조건 적으로 더하는 것이 값이 크게 됨으로 미리 더함 
				answer +=input;
			else if (input ==0) // 0의 경우에는 따로 빼놓고 연산을 진행 
				zeros ++;
			else if (input >0)
				plist.add(input);
			else if (input<0)
				mlist.add(input);
		}
		Collections.sort(mlist); // 오름차순 정렬 
		Collections.sort(plist);
		if((mlist.size()%2 )==1) { // 마이너스 리스트의 경우 원소의 갯수가 홀수이면 zero의 갯수에 따라 zero padding 또는 1을 추가해줘서 연산 값에 변화가 없도록 함
			mlist.add(zeros>0 ?0:1);
		}
		if((plist.size()%2)==1) { // 플러스 리스트의 경우 홀수면 맨앞에도 원소의 값을 유지하도록 맨앞에 1을 추가
			plist.add(0, 1);
		}
		for(int i = 0 ; i<plist.size();i+=2) {
			answer += plist.get(i)*plist.get(i+1);
		}
		for(int i = 0 ; i<mlist.size();i+=2) {
			answer +=mlist.get(i)*mlist.get(i+1);
		}
		System.out.println(answer);
	}

}
