package thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class TimerThread extends Thread{
	
	JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		String s = JOptionPane.showInputDialog("입력해주세요(최소 10초 이상)");
		int t = Integer.parseInt(s);
		
		for(int i=1; i<=t; i++) {
			timerLabel.setText(Integer.toString(i));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
		timerLabel.setFont(new Font("Gothic", Font.BOLD, 50));
		timerLabel.setText("끄읏★");

		interrupt();
	}
	
}

public class Thread7_타이머 extends JFrame {
	
	public Thread7_타이머() {
		setTitle("타이머");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.CYAN);
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel.setForeground(Color.white);		// 글씨 색
		
		c.add(timerLabel);			// container에 label 붙이기
		
		setSize(300, 150);
		setVisible(true);
		
		TimerThread th = new TimerThread(timerLabel);
		th.start();
	}
	
	public static void main(String[] args) {
		new Thread7_타이머();
	}
}
