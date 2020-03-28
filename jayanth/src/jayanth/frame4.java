package jayanth;
import java.awt.Button;
import java.awt.Choice;
import java.awt.TextField;

import javax.swing.*;  
public class frame4 {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame
JLabel l7;
l7=new JLabel("Bank Name");  
l7.setBounds(110,98,120,50); 
Choice s1=new Choice();  
s1.setBounds(220,110,120,30);  
s1.add("SBI");  
s1.add("Andhra Bank");  
s1.add("Canara bank");  
s1.add("Indian Bank");  
s1.add("Punjab National Bank");  
f.add(s1); 
f.add(l7);
TextField t10;
l7=new JLabel("Account Number");  
l7.setBounds(100,150,100,30);  
t10=new TextField("");  
t10.setBounds(220,150,120,30); 
f.add(l7);  
f.add(t10);
TextField t11;
l7=new JLabel("Expiry Date");  
l7.setBounds(100,200,100,30);  
t11=new TextField("");  
t11.setBounds(220,200,90,30); 
f.add(l7);  
f.add(t11);
TextField t12;
l7=new JLabel("cvv");  
l7.setBounds(100,250,100,30);  
t12=new TextField("");  
t12.setBounds(220,250,90,30);
f.add(l7);
f.add(t12);
Button b=new Button("Proceed");  
b.setBounds(270,320,100,30);  
f.add(b);
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  
