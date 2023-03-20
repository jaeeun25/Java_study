package study;

import java.io.Serializable;
import java.util.Vector;

public class GoodsArr implements Serializable{

	private static final long serialVersionUID = -5556962234723697587L;
	
	Vector<Goods> grr;
	public GoodsArr() {
		grr = new Vector<Goods>();
	}
}
