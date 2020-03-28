package jayanth;
import java.awt.Button;

import java.awt.Component;

import javax.swing.*; 
public class frame3 {
JFrame f;    
frame3(){    
f=new JFrame();     
JRadioButton r1=new JRadioButton("yes");    
JRadioButton r2=new JRadioButton("no");    
r1.setBounds(200,100,190,40);    
r2.setBounds(200,150,190,40);    
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);    
f.add(r1);f.add(r2);      
f.setSize(300,300);    
f.setLayout(null);    
f.setVisible(true);
Component l10 = new JLabel("WILL YOU RETURN WITH US.");  
l10.setBounds(200,50, 300,30);
Component l11=new JLabel("TAXI FARE PRICES.");
l11.setBounds(200,250,250,50);
f.add(l10);
f.add(l11);
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);
JCheckBox checkBox1 = new JCheckBox("0-10km taxi fare $5.00");  
checkBox1.setBounds(200,300, 150,50);  
JCheckBox checkBox2 = new JCheckBox("0-10km taxi fare(return includes) $10.00");  
checkBox2.setBounds(200,350, 280,50);  
JCheckBox checkBox3 = new JCheckBox("10-20km taxi fare $10.00");  
checkBox3.setBounds(200,400, 160,50);  
JCheckBox checkBox4 = new JCheckBox("10-20km taxi fare(return includes) $20.00");  
checkBox4.setBounds(200,450, 280,50); 
f.add(checkBox1);  
f.add(checkBox2);  
f.add(checkBox3);  
f.add(checkBox4);
Button b=new Button("BOOK A TAXI");  
b.setBounds(500,500,100,50);  
f.add(b); 
f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true); 
}    
public static void main(String[] args) {    
    new frame3(); 
}    
}    