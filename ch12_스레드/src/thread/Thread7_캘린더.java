package thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class CalendarThread extends Thread{
	
	JLabel calendarLabel;
	
	public CalendarThread(JLabel calendarLabel) {
		this.calendarLabel = calendarLabel;
	}
	
	@Override
	public void run() {
		//String s = JOptionPane.showInputDialog("입력해주세요(최소 10초 이상)");
		//int t = Integer.parseInt(s);
		
		while(true) {
			calendarLabel.setText(getTime());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}		
		//timerLabel.setFont(new Font("Gothic", Font.BOLD, 50));
		//timerLabel.setText("끄읏★");
		
		//interrupt();
	}
	
	public String getTime() {
		Calendar now = Calendar.getInstance();
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH)+1;
		int dd = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		String str = yy + "년" + mm + "월" + dd + "일 " + hour + "시" + minute + "분" + second + "초";
		
		return str;
	}
}

public class Thread7_캘린더 extends JFrame {
	
	public Thread7_캘린더() {
		setTitle("현재 시각");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.BLACK);
		
		JLabel calendarLabel = new JLabel();
		calendarLabel.setFont(new Font("Gothic", Font.ITALIC, 50));
		calendarLabel.setForeground(Color.PINK);		// 글씨 색
		
		c.add(calendarLabel);			// container에 label 붙이기
		
		setSize(750, 120);				// 가로, 세로
		setVisible(true);
		
		CalendarThread ch = new CalendarThread(calendarLabel);
		ch.start();
	}
	
	public static void main(String[] args) {
		new Thread7_캘린더();
	}
}
