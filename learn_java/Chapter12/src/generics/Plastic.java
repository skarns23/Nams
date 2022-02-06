package generics;

public class Plastic extends Material {
	public String toString() {
		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("플라스틱 재료로 출력 중");
	}
}
