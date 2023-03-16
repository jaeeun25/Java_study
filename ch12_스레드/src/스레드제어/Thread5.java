package 스레드제어;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Thread5 extends JFrame{
	
	public Thread5() {
		GPanel p = new GPanel();
		setContentPane(p);		// 컨텐트팬을 p로 설정(기존 컨텐트팬에서 JPanel로 만든 새로운 컨텐트팬으로 설정)
		setSize(800, 600);
		setVisible(true);
		setFocusable(true);		// 포커스 받을 수 있는 컴포넌트 여러개일 때 우선적으로 입력받을 수 있음(컴포넌트가 포커스 받을 수 있도록 설정)
	}
	
	public static void main(String[] args) {
		new Thread5();
	}
}

class GPanel extends JPanel{
	
	public GPanel() {
		setLayout(null);
		
		// 이벤트 리스너
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChoonTh th = new ChoonTh(e.getX(), e.getY());	// 마우스가 누른 x, y 좌표
				th.start();
			}
		});
		
	}
	
	// 그래픽
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		ImageIcon image = new ImageIcon("images/background.png");
		Image im = image.getImage();
		
		// 이미지(im)을 (0,0)좌표에서 시작해 넓이, 높이로 출력
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);	// getWidth(), getHeight()은 GPanel꺼 (즉, Thread5 생성자에서 선언한 컴포넌트 크기)
		repaint();		// 다시 그리기
		
	}
	
	// 스레드
	class ChoonTh extends Thread{
		
		JLabel choon;
		ArrayList<ImageIcon> imageArr = new ArrayList<>();
		
		public ChoonTh(int choonX, int choonY) {		// 마우스로 누른 좌표값 넘어옴
			imageArr.add(new ImageIcon("images/choon1.png"));
			imageArr.add(new ImageIcon("images/choon2.png"));
			imageArr.add(new ImageIcon("images/choon3.png"));
			imageArr.add(new ImageIcon("images/choon4.png"));
			
			int ran = (int) (Math.random()*4);
			ImageIcon img = imageArr.get(ran);
			
			choon = new JLabel(img);
			choon.setSize(img.getIconWidth(), img.getIconHeight());		// 해당 이미지의 가로, 세로 길이 읽어오기
			choon.setLocation(choonX, choonY);							// 마우스로 클릭한 위치 넣기(이벤트에서 가져온 값)
			
			add(choon);
			repaint();
		}
		
		public void run() {	// 실시간으로 올라가는 것 표현
			while(true) {
				int x = choon.getX();
				int y = choon.getY()-1;		// y값은 위에서 부터 아래로 증가하므로 올라가는 것은 -를 해줘야한다.
				System.out.println(y);
				//if(y < -(choon.getHeight()))	// 라벨 높이 값구해서 컴포넌트 크기 넘어서도 계속 올라갈수있게 지정하고 이미지가 컴포넌트에서 아예 보이지 않으면 그때 삭제(즉 자기 이미지 높이 만큼 더 올라가는 것)
				if(y < 0){					// 맨 위까지 올라갔는가? -> 꼭대기는 y=0이므로 아래로 갈 수록 값이 커짐, 왼쪽이 x=0
					remove(choon);
					repaint();
					return;
				}
				
				choon.setLocation(x, y);
				repaint();
				try {
					sleep(50);
				} catch (InterruptedException e) {}
				
			}
		}
	}
}
