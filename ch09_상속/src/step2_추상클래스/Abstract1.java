package step2_추상클래스;

abstract class 동물{
	
	abstract public void 걷기();
	abstract public void 울기();
	abstract public void 웃기();

	void 사냥하기() {
		System.out.println("겨울잠을 자기위해 사냥을 합니다.");
	}
}

class 야생동물 extends 동물{

	// 추상화 다 구현해야함(몇개만 할 수는 없음 -> 앞에 abstract 붙어야함)
	@Override
	public void 걷기() {
		System.out.println("깡총깡총 걷습니다.");
	}

	@Override
	public void 울기() {
		System.out.println("엉엉 웁니다.");
	}

	@Override
	public void 웃기() {
		super.사냥하기();
	}
	
	public String toString() {
		return "구현시켜봅니다.";
	}
}

public class Abstract1 {
	public static void main(String[] args) {
		
		//동물 animal = 동물();
		야생동물 a = new 야생동물();
		동물 b = new 야생동물();		// 업캐스팅 가능
	}
}
