package step1_상속;

class Printer{
	private String material;
	
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	void print() {
		System.out.println("일반 프린터");
	}
}

class ColorPrinter extends Printer{
	private String material;
	private int paper = 6;
	
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	void print() {
		System.out.println("재료는 " + material + "이고, 종이는 " + paper + "장이다.");
	}
}

class Printer3D extends Printer{
	private String material;
	
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
}

public class Inher_Overriding실습 {
	public static void main(String[] args) {
	
		Printer[] printers = new Printer[2];
		
		printers[0] = new ColorPrinter();
		printers[0].setMaterial("잉크");
		
		printers[1] = new Printer3D();
		printers[1].setMaterial("레진");
		
		for(Printer p : printers) {
			System.out.println(p.getMaterial());
			if(p instanceof ColorPrinter) {
				p.print();		// 다운캐스팅 안한 이유 --> 오버라이딩된 메소드이기 때문
			}
		}
		
	}
}
