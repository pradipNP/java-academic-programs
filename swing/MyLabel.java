import javax.swing.*;
import java.awt.*;

class MyLabel{
	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,1000,500);
		Container c = frame.getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		c.setLayout(null);
		
		ImageIcon icon = new ImageIcon("pk.jpg");
		JLabel label = new JLabel(icon);
		
		label.setBounds(100,100,100,100);
		c.add(label);
		
		JLabel l1 = new JLabel("Pradeep");
		l1.setBounds(110,50,200,30);
		Font font = new Font("Arial", Font.BOLD, 18);
		l1.setFont(font);
		l1.setText("Pradeep");
		c.add(l1);
	}
}