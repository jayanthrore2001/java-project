package jayanth;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame5{
	public static void main(String[] args) {  
		JFrame f=new JFrame();//creating instance of JFrame 
		JLabel l10;
		l10=new JLabel("PAYMENT SUCCESFULL");  
		l10.setBounds(600,100,150,50);
		JLabel l11;
		l11=new JLabel("HAPPY JOURNEY HAVE A NICE DAY ");  
		l11.setBounds(550,150,250,50);
		f.add(l10);
		f.add(l11);
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		}  
		}  

