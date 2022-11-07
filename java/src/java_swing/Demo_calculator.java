package java_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo_calculator extends JFrame implements ActionListener{
	JTextField txt;
	JLabel result;
	JButton btn[];
	JPanel pn1,pn2;

	public Demo_calculator() {
		
		txt=new JTextField(20);
		result=new JLabel("Result");
		btn=new JButton[16];
		pn1=new JPanel();
		
		add(pn1,BorderLayout.NORTH);
		pn1.setBackground(Color.orange);
		pn1.add(result);
		pn1.add(txt);
		
		pn2=new JPanel();
	//	pn2.setBackground(Color.cyan);
		add(pn2);
		pn2.setLayout(new GridLayout(4,4));
		for(int i=0;i<10;i++)
		{
			btn[i]=new JButton(" "+i);
			pn2.add(btn[i]);
			btn[i].addActionListener(this);
		}
		btn[10]=new JButton("/");
		btn[11]=new JButton("*");
		btn[12]=new JButton("+");
		btn[13]=new JButton("-");
		btn[14]=new JButton("=");
		btn[15]=new JButton("C");
		for(int i=10;i<16;i++)
		{
			pn2.add(btn[i]);
			btn[i].addActionListener(this);
		}
	
		setSize(400,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String v=e.getActionCommand();
		if(v.equals(0))
		{
			txt.setText("0");
		}
	}
	
	public static void main(String args[])
	{
		Demo_calculator dc=new Demo_calculator();
	}

	
}
