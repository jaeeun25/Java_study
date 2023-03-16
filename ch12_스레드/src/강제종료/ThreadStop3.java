package 강제종료;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomTh extends Thread{
	
	Container contentPane;
	boolean flag = false;
	
	public RandomTh(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	void finish() {
		flag = true;
	}
	
	public void run() {
		while(true) {
			// 꽃이 찍히는 라벨 생성
			JLabel la = new JLabel("꽃");
			la.setSize(80, 30);
			la.setFont(new Font("고딕체", Font.BOLD, 14));
			la.setForeground(Color.YELLOW);
		
			// 라벨을 붙일 좌표
			int x = (int) (Math.random()*contentPane.getWidth());
			int y = (int) (Math.random()*contentPane.getHeight());
			la.setLocation(x, y);
			contentPane.add(la);
			contentPane.repaint();
			
			try {
				sleep((int) (Math.random()*1000));
				
				if(flag == true) {
					contentPane.removeAll();		// 전체 지우기
					JLabel finishLabel = new JLabel("끝났습니다.");
					finishLabel.setSize(500, 150);
					finishLabel.setForeground(Color.WHITE);
					contentPane.add(finishLabel);
					contentPane.repaint();			// 컴포넌트를 다시 그리도록 하는 메서드
					return;
				}
			} catch (InterruptedException e) {}
		}	
	}
}

public class ThreadStop3 extends JFrame {
	RandomTh rt;
	
	public ThreadStop3() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(null);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				rt.finish();				
			}
		});
		
		rt = new RandomTh(contentPane);
		
		setSize(1300, 800);
		setLocation(100, 100);		// 왼쪽상단 기준점으로 잡고 가로,세로 100,100
		setVisible(true);
		
		rt.start();
	}
	
	public static void main(String[] args) {
		new ThreadStop3();
	}

}
