package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식 {
	static int count;
	static final int price = 5000;
	private static JTextField t1;
	static int[] scount= new int[3];
	static int 짜장count;
	static int 짬뽕count;
	static int 탕수육count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("갯수");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setBounds(399, 10, 79, 18);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBounds(480, 10, 144, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel center = new JLabel("New label");
		center.setIcon(new ImageIcon("D:\\java workspace\\java06\\짜장면.jpg"));
		center.setBounds(37, 38, 644, 376);
		f.getContentPane().add(center);

		JLabel result = new JLabel("결제금액");
		result.setForeground(Color.RED);
		result.setBounds(96, 424, 465, 27);
		f.getContentPane().add(result);

		JButton b1 = new JButton("짜장면");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				center.setIcon(new ImageIcon("짜장면.jpg"));
				t1.setText(count + "개");
				result.setText("결제금액: " + count * price);
				scount[0]++;
//				짜장count++;
//				f.setTitle("짜장면 갯수: "+짜장count+"짬뽕 갯수: "+짬뽕count+"탕수육 갯수:"+탕수육count);
				f.setTitle("짜장면 갯수: "+scount[0]+"짬뽕 갯수: "+scount[1]+"탕수육 갯수:"+scount[2]);
			}
		});
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("굴림", Font.BOLD, 15));
		b1.setBounds(12, 9, 97, 23);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("짬뽕");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scount[1]++;
				count++;
//				짬뽕count++;
				center.setIcon(new ImageIcon("짬뽕.jpg"));
				t1.setText(count + "개");
				result.setText("결제금액: " + count * price);
//				f.setTitle("짜장면 갯수: "+짜장count+"짬뽕 갯수: "+짬뽕count+"탕수육 갯수:"+탕수육count);
				f.setTitle("짜장면 갯수: "+scount[0]+"짬뽕 갯수: "+scount[1]+"탕수육 갯수:"+scount[2]);
			}
		});
		b2.setBackground(Color.RED);
		b2.setFont(new Font("굴림", Font.BOLD, 15));
		b2.setBounds(105, 9, 97, 23);
		f.getContentPane().add(b2);

		JButton b3 = new JButton("탕수육");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				scount[2]++;
//				탕수육count++;
				center.setIcon(new ImageIcon("탕수육.jpg"));
				t1.setText(count + "개");
				result.setText("결제금액: " + count * price);
//				f.setTitle("짜장면 갯수: "+짜장count+"짬뽕 갯수: "+짬뽕count+"탕수육 갯수:"+탕수육count);
				f.setTitle("짜장면 갯수: "+scount[0]+"짬뽕 갯수: "+scount[1]+"탕수육 갯수:"+scount[2]);
			}
		});
		b3.setBackground(Color.YELLOW);
		b3.setFont(new Font("굴림", Font.BOLD, 15));
		b3.setBounds(201, 9, 97, 23);
		f.getContentPane().add(b3);

		f.setVisible(true);
	}
}
