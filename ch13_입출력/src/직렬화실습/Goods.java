package 직렬화실습;

import java.io.Serializable;

public class Goods implements Serializable{

	private static final long serialVersionUID = -741740601078563978L;
	
	String name;
	int price;
	Goods(String name, int price){
		this.name = name;
		this.price = price;
	}
}
