package 직렬화실습;

import java.io.Serializable;
import java.util.Vector;

public class GoodsStorage implements Serializable{

	private static final long serialVersionUID = -5556962234723697587L;
	
	Vector<Goods> grr;
	public GoodsStorage() {
		grr = new Vector<Goods>();
	}
}
