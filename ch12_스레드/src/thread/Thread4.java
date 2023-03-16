package thread;

import javax.swing.JOptionPane;

class Th3 extends Thread{
	
	public void run() {
		for(int i=0, j=0; i<20; i++, j++) {
			System.out.println(i+j);
			try {
				sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class Thread4 {
	public static void main(String[] args) {
		Th3 th = new Th3();
		th.start();
		
		String name = JOptionPane.showInputDialog("이건 뭐야");
		System.out.println("이름은" + name + "입니다.");
	}
}
