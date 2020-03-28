
	package jayanth;

	import java.awt.Button;

	import java.awt.Choice;
	import java.awt.Component;
	import java.awt.Font;
	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class jk {
		public static void main(String[] args) {
			JFrame f = new JFrame();// creating instance of JFrame
			JLabel l1;
			l1 = new JLabel("ONLINE CAB BOOKING SYSTEM");
			l1.setBounds(300,100,900,50);
			l1.setFont(new Font("ONLINE CAB BOOKING SYSTEM", Font.ITALIC,55));
			f.add(l1);
			JLabel l2;
			TextField t13;
			l2 = new JLabel("user name");
			l2.setBounds(100,200,100, 30);
			t13 = new TextField("");
			t13.setBounds(200,200,220, 30);
			f.add(l2);
			f.add(t13);
			JLabel l3;
			TextField t14;
			l3 = new JLabel("Password");
			l3.setBounds(100,250, 100, 30);
			t14 = new TextField("");
			t14.setBounds(200,250,220,30);
			f.add(l3);
			f.add(t14);
			Button b = new Button("Login");
			b.setBounds(200,300, 100, 30);
			f.add(b);
			
			f.setSize(1600, 1600);// 400 width and 500 height
			f.setLayout(null);// using no layout managers
			f.setVisible(true);// making the frame visible
			
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFrame f;
					JFrame f1 = new JFrame();// creating instance of JFrame
					JLabel l1;
					TextField t1;
					l1 = new JLabel("First Name:");
					l1.setBounds(50, 50, 100, 30);
					t1 = new TextField("");
					t1.setBounds(200, 50, 220, 30);
					f1.add(l1);
					f1.add(t1);
					TextField t2;
					l1 = new JLabel("Last Name:");
					l1.setBounds(50, 100, 100, 30);
					t2 = new TextField("");
					t2.setBounds(200, 100, 220, 30);
					f1.add(l1);
					f1.add(t2);
					TextField t3;
					l1 = new JLabel("phone number:");
					l1.setBounds(50, 150, 100, 30);
					t3 = new TextField("");
					t3.setBounds(200, 150, 220, 30);
					f1.add(l1);
					f1.add(t3);
					TextField t5;
					l1 = new JLabel("Address:");
					l1.setBounds(50, 200, 120, 50);
					t5 = new TextField("");
					t5.setBounds(200, 200, 220, 30);
					f1.add(l1);
					f1.add(t5);
					TextField t6;
					l1 = new JLabel("Street address");
					l1.setBounds(50, 250, 120, 50);
					t6 = new TextField("");
					t6.setBounds(200, 250, 220, 30);
					f1.add(l1);
					f1.add(t6);
					TextField t7;
					l1 = new JLabel("Country");
					l1.setBounds(50, 300, 120, 50);
					t7 = new TextField("");
					t7.setBounds(200, 300, 220, 30);
					f1.add(l1);
					f1.add(t7);
					TextField t8;
					l1 = new JLabel("State");
					l1.setBounds(50, 350, 120, 50);
					f1.add(l1);
					Choice c = new Choice();
					c.setBounds(200, 360, 220, 30);
					c.add("Andhra Pradesh");
					c.add("Telangana");
					c.add("TamilNadu");
					c.add("Maharastra");
					c.add("Kerla");
					f1.add(c);
					TextField t9;
					l1 = new JLabel("City");
					l1.setBounds(50, 400, 120, 50);
					f1.add(l1);
					Choice s = new Choice();
					s.setBounds(200, 410, 220, 30);
					s.add("Vijayawada");
					s.add("Hyderabad");
					s.add("Mumbai");
					s.add("Chennai");
					s.add("goa");
					f1.add(s);
					Button b = new Button("NEXT");
					b.setBounds(500, 460, 100, 30);
					f1.add(b);
					f1.setSize(1600, 1600);// 400 width and 500 height
					f1.setLayout(null);// using no layout managers
					f1.setVisible(true);// making the frame visible
					f1.add(b);
					b.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JFrame f=new JFrame();//creating instance of JFrame  
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
								f.add(j15);;       f.add(cn);
								 Button b=new Button("Next");  
								    b.setBounds(350,460,80,30);  
								    f.add(b);  
							f.setSize(1600,1600);//400 width and 500 height  
							f.setLayout(null);//using no layout managers  
							f.setVisible(true);//making the frame visible  
					b.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JFrame f;
							f = new JFrame();
							JRadioButton r1 = new JRadioButton("yes");
							JRadioButton r2 = new JRadioButton("no");
							r1.setBounds(200, 100, 190, 40);
							r2.setBounds(200, 150, 190, 40);
							ButtonGroup bg = new ButtonGroup();
							bg.add(r1);
							bg.add(r2);
							f.add(r1);
							f.add(r2);
							f.setSize(300, 300);
							f.setLayout(null);
							f.setVisible(true);
							Component l10 = new JLabel("WILL YOU RETURN WITH US.");
							l10.setFont(new Font("WILL YOU RETURN WITH US", Font.ITALIC, 35));
							l10.setBounds(200, 50, 600, 30);
							Component l11 = new JLabel("TAXI FARE PRICES.");
							l11.setFont(new Font("TAXI FARE PRICES.", Font.ITALIC, 35));
							l11.setBounds(200, 250, 600, 50);
							f.add(l10);
							f.add(l11);
							f.setSize(1400, 1400);
							f.setLayout(null);
							f.setVisible(true);
							JCheckBox checkBox1 = new JCheckBox("0-10km taxi fare $5.00");
							checkBox1.setBounds(200, 300, 150, 50);
							JCheckBox checkBox2 = new JCheckBox("0-10km taxi fare(return includes) $10.00");
							checkBox2.setBounds(200, 350, 280, 50);
							JCheckBox checkBox3 = new JCheckBox("10-20km taxi fare $10.00");
							checkBox3.setBounds(200, 400, 160, 50);
							JCheckBox checkBox4 = new JCheckBox("10-20km taxi fare(return includes) $20.00");
							checkBox4.setBounds(200, 450, 280, 50);
							f.add(checkBox1);
							f.add(checkBox2);
							f.add(checkBox3);
							f.add(checkBox4);
							JLabel t2;
							t2 = new JLabel("PAYMENTS:");
							t2.setFont(new Font("PAYMENTS", Font.ITALIC, 35));
							t2.setBounds(800, 250, 200, 30);
							f.add(t2);
							JCheckBox checkBox5 = new JCheckBox("CREDIT CARD");
							checkBox5.setBounds(800, 300, 150, 50);
							JCheckBox checkBox6 = new JCheckBox("DEBIT CARD");
							checkBox6.setBounds(800, 350, 280, 50);
							f.add(checkBox5);
							f.add(checkBox6);
							Button b = new Button("Proceed");
							b.setBounds(600,550, 100, 30);
							f.add(b);
							f.setSize(1600, 1600);
							f.setLayout(null);
							f.setVisible(true);
							b.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									JFrame f;
									JFrame f1 = new JFrame();// creating instance of JFrame
									JLabel l7;
									l7 = new JLabel("Bank Name");
									l7.setBounds(110, 98, 120, 50);
									Choice s1 = new Choice();
									s1.setBounds(220, 110, 120, 30);
									s1.add("SBI");
									s1.add("Andhra Bank");
									s1.add("Canara bank");
									s1.add("Indian Bank");
									s1.add("Punjab National Bank");
									f1.add(s1);
									f1.add(l7);
									TextField t10;
									l7 = new JLabel("Account Number");
									l7.setBounds(100, 150, 100, 30);
									t10 = new TextField("");
									t10.setBounds(220, 150, 120, 30);
									f1.add(l7);
									f1.add(t10);
									TextField t11;
									l7 = new JLabel("Expiry Date");
									l7.setBounds(100, 200, 100, 30);
									t11 = new TextField("");
									t11.setBounds(220, 200, 90, 30);
									f1.add(l7);
									f1.add(t11);
									TextField t12;
									l7 = new JLabel("cvv");
									l7.setBounds(100, 250, 100, 30);
									t12 = new TextField("");
									t12.setBounds(220, 250, 90, 30);
									f1.add(l7);
									f1.add(t12);
									Button b = new Button("BOOK A TAXI");
									b.setBounds(270, 320, 100, 30);
									f1.add(b);
									f1.setSize(1600, 1600);// 400 width and 500 height
									f1.setLayout(null);// using no layout managers
									f1.setVisible(true);// making the frame visible
									b.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											JFrame f;
											JFrame f1 = new JFrame();// creating instance of JFrame
											JLabel l10;
											Component l101 = new JLabel("THANK YOU.");
											l101.setFont(new Font("THANK YOU", Font.ITALIC, 25));
											l101.setBounds(600, 100, 550, 50);
											JLabel l11;
											Component l111 = new JLabel("HAPPY JOURNEY HAVE A NICE DAY.");
											l111.setFont(new Font("HAPPY JOURNEY HAVE A NICE DAY", Font.ITALIC, 25));
											l111.setBounds(550, 150, 550, 50);
											f1.add(l101);
											f1.add(l111);
											f1.setSize(1600, 1600);// 400 width and 500 height
											f1.setLayout(null);// using no layout managers
											f1.setVisible(true);// making the frame visible
												}
								});
								}
						});
                 	}	
						}
					});
				}
			});
			}
			

			