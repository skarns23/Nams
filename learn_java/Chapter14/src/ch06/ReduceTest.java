package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
	
	@Override
	public String apply (String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1; 
		else
			return s2;
	}
}
public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~","hallo","Good morning","반갑습니다^^"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2)->{
			if(s1.getBytes().length>=s2.getBytes().length) //바이트 형식으로 변환후의 길이를 통해 비교
				return s1;
			else
				return s2;
		}));
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
