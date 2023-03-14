package generic;

abstract class Material{
	abstract void doPrinting();
}
class Powder extends Material{

	@Override
	void doPrinting() {
		System.out.println("재료: Powder");		
	}
	
}
class Plastic extends Material{

	@Override
	void doPrinting() {
		System.out.println("재료: Plastic");
	}
	
}

// 3D 프린터
class Printer<T>{
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		System.out.println("난 파우더 프린트야");
		return material;
	}
}

public class Generic11 {
	public static void main(String[] args) {
		
		/*
		// 제네릭 아닐 때
		Printer p1 = new Printer();
		
		Object obj1 = new Powder();
		p1.setMaterial(obj1);
		
		p1.getMaterial();
		Powder pow1 = (Powder) p1.getMaterial();
		pow1.doPrinting();
		*/
		
		// 파우더
		Printer<Powder> p2 = new Printer<>();
		Powder pow2 = new Powder();
		p2.setMaterial(pow2);
		Powder rpo = p2.getMaterial();
		rpo.doPrinting();
		pow2.doPrinting();
		
		System.out.println("*****************");
		
		// 플라스틱
		Printer<Plastic> p3 = new Printer();
		p3.setMaterial(new Plastic());
		Plastic pp = p3.getMaterial();
		pp.doPrinting();
		
		
		
	}
}
