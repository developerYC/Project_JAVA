package java_swing;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class demo_swing {
	public static void main(String[] args) 
	{
		JFrame f=new JFrame("My first Frame");
		
		JLabel l1=new JLabel("Username");
		JLabel l2=new JLabel("Password");
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		JButton bt=new JButton("Submit");	
	    
	    f.add(l1);f.add(t1);
		f.add(l2);f.add(t2);
		f.add(bt);
		
		f.setSize(400,400);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
}
