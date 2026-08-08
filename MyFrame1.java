import java.awt.*;
import javax.swing.*;

class MyFrame1
{
	JFrame f1;
	JButton b1;
	JPanel p1;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	JTextArea jta1;
	JRadioButton jrb1,jrb2;

	ButtonGroup bg1;

	JComboBox jcb1;

	Icon i1;

	public MyFrame1()//default constructor
	{
		f1=new JFrame("My First Frame");
		f1.setVisible(true);
		f1.setSize(400,400);

		//for adding button
		b1=new JButton("Click Me");

		p1=new JPanel();
		//for adding panel to frame
		f1.getContentPane().add(p1);
		t1=new JTextField(15);
		t1.setForeground(Color.red);
		t1.setBackground(Color.yellow);

		l1=new JLabel("First Name");
		l2=new JLabel("Address");
		jta1=new JTextArea(10,15);


		jrb1=new JRadioButton("Male");
		jrb2=new JRadioButton("Female");

		bg1=new ButtonGroup();

		bg1.add(jrb1);
		bg1.add(jrb2);

		String x[]={"Matric", "+2", "B.Tech", "M.Tech", "Ph.D.", "TTMP"};

		jcb1=new JComboBox(x);

		l3=new JLabel("    ");
		i1=new ImageIcon("myimg.jpg");

		p1.setBackground(Color.cyan);

		l3.setIcon(i1);

		//for adding button to panel
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(jta1);
		p1.add(jrb1);
		p1.add(jrb2);
		p1.add(jcb1);
		p1.add(l3);
		p1.add(b1);
	}
	public static void main(String args[])
	{
		MyFrame1 obj=new MyFrame1();//constructor will fire
	}
}