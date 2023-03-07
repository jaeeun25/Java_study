package step5_포함관계;

class Engine{
	String type;
	int cc;
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	void print() {
		System.out.println("타   입: " + type);
		System.out.println("배기량: " + cc + "cc");
	}
}

class Car{
	String kind;
	Engine eg;
	
	Car(String kind, Engine eg){
		this.kind = kind;
		this.eg = eg;
	}
	
	void print() {
		System.out.println("차   종: " + kind);
		eg.print();
		System.out.println("======================");
	}
}


public class In1Ex {
	public static void main(String[] args) {
		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);
		
		Car c1 = new Car("Jeep", eg1);
		Car c2 = new Car("랜드로버", eg2);
		Car c3 = new Car("제니시스", eg1);
		
		c1.print();
		c2.print();
		c3.print();
	}
}