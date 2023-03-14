package generic;

abstract class Material2{
	abstract void doPrinting();
}
class Powder2 extends Material2{

	@Override
	void doPrinting() {
		System.out.println("재료: Powder");		
	}
	
}
class Plastic2 extends Material2{

	@Override
	void doPrinting() {
		System.out.println("재료: Plastic");
	}
	
}

// 3D 프린터
class Printer2 <T extends Material2>{	// <T> extends Powder  <- 해당 클래스 자체가 파우더를 상속받음
										// <T extends Powder>  <- 파우더 상속받는 T타입들
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		System.out.println("난 파우더 프린트야");
		return material;
	}
	
	// 메소드 추가
	public void printing() {
		material.doPrinting();		// 상속받은 부모의 메소드
	}
}

public class Generic12 {
	public static void main(String[] args) {
		
		// 1. Power 프린터
		Printer2 <Powder2> gPrinter = new Printer2();
		gPrinter.setMaterial(new Powder2());
		gPrinter.printing();
		
		// 2. Plastic 프린터
		Printer2 <Plastic2> gPrinter2 = new Printer2();
		gPrinter2.setMaterial(new Plastic2());
		gPrinter2.printing();
		
	}
}
