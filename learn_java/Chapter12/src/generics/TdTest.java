package generics;

public class TdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TdPrinter<Powder> pt = new TdPrinter<Powder>();
		pt.setMaterial(new Powder());
		Powder powder = (Powder)pt.getMaterial();
		System.out.println(pt);
	}

}
