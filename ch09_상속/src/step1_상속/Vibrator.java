package step1_상속;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vibrator extends JFrame {
	Vibrator() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// x로 닫으면 프로세스까지 전부 종료해라
		
		Container contentPane = getContentPane();
		setContentPane(contentPane);
		contentPane.setBackground(Color.BLUE);
		
		JLabel la = new JLabel("Yollo! 잡아봐라 히히");
		la.setForeground(Color.WHITE);
		la.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(la);
		
		setSize(300, 300);
		setLocation(300, 300);
		
		setVisible(true);
		
		VTh vt = new VTh(this);
		vt.start();
	}
	
	class VTh extends Thread{
		Component c;
		
		VTh(Component c){
			this.c = c;
		}
		
		public void run() {
			Random r = new Random();
			
			int x = c.getX();
			int y = c.getY();
			
			while(true) {
				int d;
				if(r.nextBoolean()) {
					d = 1;
				}
				else {
					d = -1;
				}
				
				int tmpX = x + r.nextInt(50);
				if(r.nextBoolean()) {
					d = 1;
				}
				else {
					d = -1;
				}
				
				int tmpY = y + r.nextInt(5) * d;
				
				c.setLocation(tmpX, tmpY);
				c.setSize(c.getWidth()+d*(r.nextInt(30)), c.getHeight()+d*(r.nextInt(30)));
				
				try {
					sleep(100);
				} catch(InterruptedException e) {
					return;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Vibrator v = new Vibrator();
	}
}
