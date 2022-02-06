package generics;

public class Powder extends Material {
	public String toString() {
		return "재료는 파우더입니다.";
	}
	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("파우더 재료로 출력 중");
	}
}
