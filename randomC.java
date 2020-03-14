import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class randomC extends JFrame{
	private JLabel la = new JLabel("C"); // "C" ���ڿ��� ����ϱ� ���� ���̺� ������Ʈ
	
	public randomC() {
		setTitle("C ��ġ �ٲٱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		la.addMouseListener(new MyMouseAdapter()); // �󺧿�  Mouse �̺�Ʈ ������ �ޱ�

		c.setLayout(null); // ����Ʈ���� ��ġ������ ����
		la.setSize(50, 20); // ���̺��� ũ�� 50x20 ����
		la.setLocation(100, 100); // ���̺��� ��ġ (100,100)���� ����
		la.setFont(new Font("", Font.BOLD, 20));	//���� ��Ʈ ũ�⸦ �ߺ��̰� �ϱ� ���� ��Ʈ ��ü�� �����ؼ� ����, 20 ������� ���־���.
		c.add(la); // ���̺� ������Ʈ ����
		
		c.setBackground(new Color(255,253,209));
		setSize(500, 500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();	
		
	}
	
	class MyMouseAdapter extends MouseAdapter { // MouseAdapter�� ��ӹ޾� ������ ����
		public void mousePressed(MouseEvent e) {
			Container c = la.getParent();
			int xBound = c.getWidth() - la.getWidth();
			int yBound = c.getHeight() - la.getHeight();
			
			int x = (int)(Math.random()*xBound); 
			int y = (int)(Math.random()*yBound);
			la.setLocation(x, y); // ���̺��� ��ġ�� (x,y)�� �̵�
		}
	}
	
	public static void main(String [] args) {
		new randomC();
	}
}
