package java_swing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.accessibility.Accessible;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon ;
public class StudentInformationForm extends JFrame implements ActionListener,WindowListener
{
	JLabel lname,lrollno,lgender,laddress,limg,lbirth,label,lfile;
	JTextField tname,trollno,txt;
	JTextArea taddress,txtarea;
	JRadioButton rbmale,rbfemale;
	JButton btnsave,btnclose,btnclear,btnfilech;
	JPanel pn1,pn2;
	ImageIcon image;
	JComboBox day,month,year;
	JFileChooser file;

	
      StudentInformationForm() 
      {
    	  setTitle("Student Information Form");
    	  pn1=new JPanel();                             //create panel 1
    	  label=new JLabel("Enter Student Details");
    	  pn1.setBackground(Color.CYAN); 
    	  try {
    		    image=new ImageIcon(new ImageIcon("D:\\Workspace\\java_session\\java\\src\\java_swing\\demoimg.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
    		    limg=new JLabel(image);
    		    pn1.add(limg);  pn1.add(label); 		 //add labelimage , label in panel 
    			}
    			catch(Exception e)
    			{
    				System.out.println("Image not found..");
    			}
    	
    	  add(pn1,BorderLayout.NORTH);       //add panel in frame
		
    	  pn2=new JPanel();                    //create panel 2
    	  pn2.setBackground(Color.ORANGE);
  
		lname=new JLabel("Student name");
		lrollno=new JLabel("Student rollno");
		lgender=new JLabel("Gender");
		laddress=new JLabel("Address");
		tname=new JTextField(15);
		trollno=new JTextField(15);
		
		taddress=new JTextArea(3,19);
	     ButtonGroup btng=new ButtonGroup();
		rbmale=new JRadioButton("     male      ");
		rbfemale=new JRadioButton("    female     ");
		btng.add(rbmale);
		btng.add(rbfemale);
		lbirth=new JLabel("DOB");
		
		pn2.add(lname);pn2.add(tname);           //add label , textfield ...etc in panel
		pn2.add(lrollno);pn2.add(trollno);
		pn2.add(lgender);pn2.add(rbmale);pn2.add(rbfemale);
		pn2.add(laddress);pn2.add(taddress);
		pn2.add(lbirth);
		
		String d[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String m[]= {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
		String y[]= {"1995","1996","1997","1998","1995","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015"};
		day=new JComboBox(d);
		month=new JComboBox(m);
		year=new JComboBox(y);
		pn2.add(day);pn2.add(month);pn2.add(year);
		
		txtarea=new JTextArea(8,20);
		pn2.add(txtarea);
		
		lfile=new JLabel();
		btnfilech=new JButton("Choose file");
		btnfilech.addActionListener(this);
		pn2.add(btnfilech);
		pn2.add(lfile);
		
		btnsave=new JButton("save");
		btnclose=new JButton("close");
		btnclear=new JButton("clear");
		pn2.add(btnsave);
		pn2.add(btnclose);
		pn2.add(btnclear);
		
		btnsave.addActionListener(this);
		btnclose.addActionListener(new ActionListener() {  ///anonymous block
			
			@Override//annotation
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String val=e.getActionCommand();
				if(val.equalsIgnoreCase("close"))
				{
					System.exit(0);
				}
			}
		});
		btnclear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String val=e.getActionCommand();
				tname.setText("");
				trollno.setText("");
				taddress.setText("");
				txtarea.setText("");
				day.setSelectedIndex(0);month.setSelectedIndex(0);year.setSelectedIndex(0);
				lfile.setText("");
				
			}
		});
		

		add(pn2);                               //add panel 2
		
	setSize(300,450);
	pn1.setLayout(new FlowLayout());	pn2.setLayout(new FlowLayout());
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
      @Override
  	public void actionPerformed(ActionEvent e) {
  		// TODO Auto-generated method stub
    	  String v=e.getActionCommand();
    	  
    	  String name,rollno,gender,address;
    	  name=tname.getText();
    	  rollno=trollno.getText();
    	  gender="male";
			/*
			 * if(female.isSelected()) { gender="female"; }
			 */
    	  String birth=day.getSelectedItem()+"/"+month.getSelectedItem()+"/"+year.getSelectedItem(); 
    	  String addrs=taddress.getText();
    	  txtarea.setText("name="+name+"\n"+"rollno="+rollno+"\n"+"Gender="+gender+"\n"+"Date of birth="+birth+"\n"+"Address:"+addrs);
    	  
    	  
    	  if(v.equals("Choose file"))
    	  {
    		  file=new JFileChooser("D:\\Workspace\\java_session\\java\\src");
  		      int r=file.showSaveDialog(null);  
  		      if(r==JFileChooser.APPROVE_OPTION)
  		      {
  		    	  lfile.setText(file.getSelectedFile().getAbsolutePath());
  		      }
  		      else
  		      {
  		    	  lfile.setText("the user cancelled the operation");
  		      }
    	  }
    	  
    	  addWindowListener(this);
    	 
  	}
	public static void main(String[] args) 
	{
		StudentInformationForm sif=new StudentInformationForm();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
