package 스레드제어;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

// consume - notify 막으면 x표 눌러도 안꺼짐, 100까지되면 키보드 안먹고, 숫자는 줄어드는데 화면은 그대로
// 넘어가면 맥스에서 멈춰야하는데 쭈우우우욱 넘어감

// 공유되는 라벨
class MyLabel extends JLabel{
	int barSize = 0;
	int maxBarSize;
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	// 그래픽으로 그리는 메소드
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		
		if(width == 0) return;
		g.fillRect(0,  0,  width, this.getHeight());	// 사각형 그리는 것.((0,0)좌표에서부터 width,height 크기 갖는 사각형 그림)
	}
	
	// 공유 - 막대바 채우는 영역
	synchronized void fill() {
		//System.out.println(maxBarSize + " : " + barSize);
		if(barSize == maxBarSize) {
			try {
				System.out.println("1");
				wait();		// 대기 -> 일시정지
				System.out.println("11");
			} catch (Exception e) {
				return;
			}
		}
		barSize++;
		System.out.println(maxBarSize + " : " + barSize);
		repaint();
		notify();			// 대기 깨움 -> 실행대기			// 막으면 증가만하고 감소되지 않음 -> 맨 처음 consume()에서 barSize=0으로 스레드가 wait되고,
		System.out.println("22");										// fill()함수에서 증가해도 repaint()로 증가하는 현상은 보이나 notify()가 막혀서 스레드는 계속 wait인 상태라 consume()에 접근하지 못해 감소가 안됨.
	}
	
	synchronized void consume() {
		System.out.println("감소: "+maxBarSize + " :: " + barSize);
		if(barSize == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint();
		System.out.println(maxBarSize + " :: " + barSize);
		//notify();				//100찍고 내ㅕㄹ오지 않음
	}
}

// 공유되는 라벨을 호출하는 스레드
class ConsumerThread extends Thread{
	
	MyLabel bar;
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	
	public void run() {

		while(true) {
			try {
				System.out.println(getState());
				sleep(200);
				bar.consume();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Thread4 extends JFrame{
	
	MyLabel bar = new MyLabel(100);
	
	public Thread4(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();		// JFrame이 가지고 있는 컨텐트팬 리턴
		c.setLayout(null);
		
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);			// JLabel의 배경은 기본으로 투명이기때문에 true 설정해줘야 배경색이 적용된다.
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();			// 키를 누르면 바 늘어남
				System.out.println("키: " + th.getState());
			}
		});
		
		setSize(350, 200);
		setVisible(true);
		c.requestFocus();			// 키 이벤트를 받을 컴포넌트 강제 지정(컴포넌트에 포커스 강제 지정)

		
		
	}
	public static void main(String[] args) {
		new Thread4("막대바");
	}
}
