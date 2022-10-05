package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 더하기빼기 {
	static	int count;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350,400);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("0");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(new Color(255, 0, 0));
		l1.setFont(new Font("궁서", Font.BOLD, 70));
		l1.setBounds(60, 90, 200, 200);
		f.getContentPane().add(l1);
		
		JButton b1 = new JButton("1더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				l1.setText(count+"");
			}
		});
		b1.setBackground(new Color(173, 255, 47));
		b1.setFont(new Font("굴림", Font.BOLD, 12));
		b1.setForeground(new Color(0, 0, 0));
		b1.setBounds(12, 10, 97, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
				l1.setText(count+"");
				
			}
		});
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(0, 0, 255));
		b2.setBounds(115, 10, 103, 23);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("1빼기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				l1.setText(count+"");
				
			}
		});
		b3.setBackground(new Color(173, 255, 47));
		b3.setFont(new Font("굴림", Font.BOLD, 12));
		b3.setForeground(new Color(0, 0, 0));
		b3.setBounds(225, 10, 97, 23);
		f.getContentPane().add(b3);
		
		f.setVisible(true);
	}
}
