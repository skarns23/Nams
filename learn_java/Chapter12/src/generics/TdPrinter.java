package generics;

public class TdPrinter<T extends Material> {
	// <T extends class1>�ϸ� class1�� ��ӹ��� Ŭ������ �־ Ȱ���� �� �ִ�. 
	private T material;
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
		
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
