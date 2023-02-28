package ch02_데이터타입과변수;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.sql.Time;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
// 클래스를 선언한다
public class Clock extends JFrame{

	//생성자
	Clock(){
		setTitle("현재시간");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container contenPane = getContentPane();
		contenPane.setBackground(Color.blue);
		
		contenPane.add(new ClockLable(), BorderLayout.CENTER);
		
		setSize(500, 300);
		setVisible(true);
	}
	
	class ClockLable extends JLabel implements Runnable{
		
		public ClockLable() { //생성자
			setText(makeTime());
			setFont(new Font("이탤릭",Font.ITALIC,100));
			setForeground(Color.WHITE);
			setBackground(Color.BLUE);
			setHorizontalAlignment(JLabel.CENTER);
			
			Thread th = new Thread(ClockLable.this);
			th.start();
		}
		
		public String makeTime() {
			Calendar c = Calendar.getInstance();
			c.get(Calendar.HOUR_OF_DAY);
			int time = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			String timeText = Integer.toString(time);
			timeText = timeText.concat(":");
			timeText = timeText.concat(Integer.toString(min));
			timeText = timeText.concat(":");
			timeText = timeText.concat(Integer.toString(second));
			
			return timeText;
		}
		
		//스레드
		@Override
		public void run() {
			while(true) {
				setText(makeTime());
				
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Clock();
	}

}
