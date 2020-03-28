package jayanth;

	import javax.swing.*;

	import java.awt.Color;
	import java.awt.Component;
	import java.awt.Cursor;
	import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.WindowAdapter;
	public class frame extends JFrame{
		String ttype,from,to,mon,clas,date,year,adult,child;
		frame(){
			final JFrame f=new JFrame("ONLINE TICKET RESERVATION SYSTEM");
			JLabel jll=new JLabel("");
		jll.setIcon(new ImageIcon("C:\\\\Users\\\\rcral\\\\Desktop\\\\ammu.jpg"));
			
			jll.setBounds(650,50,700,350);
			f.add(jll);

			 
			//final int date,year;
			JLabel j1=new JLabel("TRAIN TICKETS");
			j1.setBounds(200,30,300,30);
			f.add(j1);
			j1.setFont(new Font("Courier New",Font.BOLD,30));
			ButtonGroup bg=new ButtonGroup();
			JRadioButton rb1=new JRadioButton("EXPRESS");
			rb1.setActionCommand("express");
			rb1.setFont(new Font("Courier New",Font.BOLD,20));
			rb1.setBounds(100,100,150,30);
			JRadioButton rb2=new JRadioButton(" SUPER FAST");
			rb2.setActionCommand("superfast");
			rb2.setFont(new Font("Courier New",Font.BOLD,20));
			rb2.setBounds(270,100,200,30);
			JRadioButton rb3=new JRadioButton(" PASSENGER");
			rb3.setActionCommand("passenger");
			rb3.setFont(new Font("Courier New",Font.BOLD,20));
			rb3.setBounds(480,100,180,30);
			
			bg.add(rb1);
			bg.add(rb2);
			bg.add(rb3);
			
			f.setSize(1300,700);
			f.setLayout(null);
			f.setVisible(true);
			
			f.add(rb1);
			f.add(rb2);
			f.add(rb3);
			
			JLabel j11=new JLabel ("FROM:");j11.setBounds(50,150,150,30);
			j11.setFont(new Font("Courier New",Font.ITALIC,20));
			String states[]= {"new delhi"," lucknow"," chennai"," mumbai"};
			final JComboBox cr=new JComboBox(states);
			cr.setBounds(250,150,170,30);
			cr.setFont(new Font("Courier New",Font.ITALIC,20));
			f.add(j11);
			f.add(cr);
			
			JLabel j12=new JLabel("TO:");j12.setBounds(50,190,150,30);
			j12.setFont(new Font("Courier New",Font.ITALIC,20));
			String states2[]= {" patna jn"," jammu tawi"," ahmedabad","vizag"};
			final JComboBox cs=new JComboBox(states2);
			
			cs.setBounds(250,190,170,30);
			cs.setFont(new Font("Courier New",Font.ITALIC,20));
			f.add(j12);
		f.add(cs);	
		JLabel j13=new JLabel("DATE:");j13.setBounds(50,230,70,30);
		j13.setFont(new Font("Courier New",Font.ITALIC,20));
		String date1[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		final JComboBox dm=new JComboBox(date1);
		dm.setBounds(140,230,70,30);
		dm.setFont(new Font("Courier New",Font.ITALIC,20));
		f.add(j13);
		f.add(dm);
		
		
		JLabel j14=new JLabel("MONTH:");j14.setBounds(250,230,90,30);
		j14.setFont(new Font("Courier New",Font.ITALIC,20));
			String num[]= {"jan","feb","mar","april","may","june","july","aug","sept","oct","nov","dec"};
			final JComboBox cm=new JComboBox(num);
			cm.setBounds(360,230,90,30);
			cm.setFont(new Font("Courier New",Font.ITALIC,20));	
		f.add(j14);
			f.add(cm);
			
			JLabel j15=new JLabel("YEAR:");j15.setBounds(470,230,70,30);
			j15.setFont(new Font("Courier New",Font.ITALIC,20));
			String num1[]= {"2015","2016","2017","2018","2019","2020","2021","2022","2024","2025"};
			final JComboBox cn=new JComboBox(num1);
			cn.setBounds(550,230,80,30);
			cn.setFont(new Font("Courier New",Font.ITALIC,20));
			f.add(j15);;		f.add(cn);
			JLabel j16=new JLabel("NUMBER OF PASSENGERS:");j16.setBounds(50,270,300,40);f.add(j16);
			j16.setFont(new Font("Courier New",Font.ITALIC,20));
			JLabel j5 =new JLabel("ADULT");j5.setBounds(50,320,100,30);f.add(j5);
			j5.setFont(new Font("Courier New",Font.ITALIC,20));
			JTextField j18=new JTextField();j18.setBounds(160,320,70,30);
			
			f.add(j18);
			JLabel j6=new JLabel("(12+ years)");j6.setBounds(250,320,160,30);
			j6.setFont(new Font("Courier New",Font.ITALIC,20));	f.add(j6);
			
			JLabel j7 =new JLabel("CHILD");j7.setBounds(50,370,80,30);
			j7.setFont(new Font("Courier New",Font.ITALIC,20));f.add(j7);
			JTextField j17=new JTextField();j17.setBounds(150,370,70,30);
			j17.setFont(new Font("Courier New",Font.ITALIC,20));
			f.add(j17);
			JLabel j9=new JLabel("(3-12years)");j9.setBounds(250,370,150,30);
			j9.setFont(new Font("Courier New",Font.ITALIC,20));
			f.add(j9);
			ButtonGroup bg1=new ButtonGroup();
			JRadioButton W1=new JRadioButton("AC FRIST CLASS");
			W1.setActionCommand("ac");
			W1.setBounds(30,420,250,30);
			W1.setFont(new Font("Courier New",Font.ITALIC,20));
			JRadioButton W2=new JRadioButton(" AC CHAIR CAR COACH");
			W2.setActionCommand("accc");
			W2.setBounds(300,420,280,30);
			W2.setFont(new Font("Courier New",Font.ITALIC,20));
			JRadioButton W3=new JRadioButton(" SLEEPER CLASS SL");
			W3.setActionCommand("sl");
			W3.setFont(new Font("Courier New",Font.ITALIC,20));
			W3.setBounds(600,420,250,30);
			bg1.add(W1);
			bg1.add(W2);
			bg1.add(W3);
			f.add(W1);
			f.add(W2);
			f.add(W3);
			JLabel j8 =new JLabel("MOBILE");j8.setBounds(50,470,100,30);
			j8.setFont(new Font("Courier New",Font.ITALIC,20));f.add(j8);
			
			JTextField j19=new JTextField();j19.setBounds(220,470,160,30);
			j19.setFont(new Font("Courier New",Font.ITALIC,20));
			f.add(j19);
			JButton b1=new JButton("SUBMIT");
			b1.setFont(new Font("Courier New",Font.BOLD,20));
			b1.setBounds(300,510,170,30);
			b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			f.add(b1);
			
			
			b1.addActionListener(new ActionListener()
					{
				public void actionPerformed(ActionEvent e) {
						ttype=bg.getSelection().getActionCommand();
						from=(String) cr.getItemAt(cr.getSelectedIndex());
						to=(String) cs.getItemAt(cr.getSelectedIndex());
						date= (String) dm.getItemAt(cs.getSelectedIndex());
						mon=(String) cm.getItemAt(cr.getSelectedIndex());
						year= (String) cn.getItemAt(cs.getSelectedIndex());
					adult=j18.getText();
				  child=j17.getText();
					clas=bg1.getSelection().getActionCommand();
					
					if(e.getActionCommand().equals("SUBMIT")) {	
					Frame obj=new Frame();
					obj.setVisible(true);
					f.dispose();
					}
					}
				private Object  parseint() {
					return null;
					
				}
					});
			f.addWindowListener(new WindowAdapter()
			{public void WindowClosing(ActionEvent e)
				{
				System.exit(0);
				}
			});
				}
		public static void main(String[] args) {
			new frame();
			
	
		}
		}









