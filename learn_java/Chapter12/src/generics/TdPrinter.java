package generics;

public class TdPrinter<T extends Material> {
	// <T extends class1>하면 class1을 상속받은 클래스만 넣어서 활용할 수 있다. 
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
