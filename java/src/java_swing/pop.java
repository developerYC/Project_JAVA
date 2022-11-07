package java_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class pop extends JFrame implements ActionListener {

	Popup p;
	pop()
	{
	
		JFrame f= new JFrame();
		JLabel 	l= new JLabel("This is a popup");
		JButton btn = new JButton("click");

		PopupFactory pf= new PopupFactory();

		JPanel p1 = new JPanel();
		p1.add(btn);
		f.add(p1);
		//f.show();
		
		JPanel p2 = new JPanel();
		//p2.setBackground(Color.red);
		p2.add(l);

     	 p = pf.getPopup(f, p2, 180, 100);  //create popup

		btn.addActionListener(this);
		
		f.setSize(400, 400);

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		p.show();
		
	}
	public static void main(String args[])
	{
		pop p = new pop();
	}
}

