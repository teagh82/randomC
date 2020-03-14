import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class randomC extends JFrame{
	private JLabel la = new JLabel("C"); // "C" 문자열을 출력하기 위한 레이블 컴포넌트
	
	public randomC() {
		setTitle("C 위치 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		la.addMouseListener(new MyMouseAdapter()); // 라벨에  Mouse 이벤트 리스너 달기

		c.setLayout(null); // 컨텐트팬의 배치관리자 삭제
		la.setSize(50, 20); // 레이블의 크기 50x20 설정
		la.setLocation(100, 100); // 레이블의 위치 (100,100)으로 설정
		la.setFont(new Font("", Font.BOLD, 20));	//라벨의 폰트 크기를 잘보이게 하기 위해 폰트 객체를 생성해서 볼드, 20 사이즈로 해주었다.
		c.add(la); // 레이블 컴포넌트 삽입
		
		c.setBackground(new Color(255,253,209));
		setSize(500, 500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();	
		
	}
	
	class MyMouseAdapter extends MouseAdapter { // MouseAdapter를 상속받아 리스너 구현
		public void mousePressed(MouseEvent e) {
			Container c = la.getParent();
			int xBound = c.getWidth() - la.getWidth();
			int yBound = c.getHeight() - la.getHeight();
			
			int x = (int)(Math.random()*xBound); 
			int y = (int)(Math.random()*yBound);
			la.setLocation(x, y); // 레이블의 위치를 (x,y)로 이동
		}
	}
	
	public static void main(String [] args) {
		new randomC();
	}
}
