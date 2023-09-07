package handson;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import elearning.Login;

import java.util.*;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
public class selection extends JFrame {
	private JPanel contentPane;
	static String s;
	static int score1=0;
	static String paths="";
	public selection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select the language in which are you going to take MCQ Test");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(365, 136, 796, 33);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select","PYTHON", "C","JAVA","C++","SWIFT","C#"}));
		comboBox.setBounds(721, 269, 130, 31);
		//comboBox.getDropTarget();
		
		comboBox.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Scanner sc=new Scanner(System.in);
				s=(String) comboBox.getSelectedItem();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							mcqin frame = new mcqin(s);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace(); 
						}
					}
				});
				//learntomcq l=new learntomcq(s);
//				questions q=new questions();
//				try {
//					score1=q.choose(qns,ans);
//					System.out.println("The marks you scored : "+score1);
//				}
//				catch(Exception e1) {
//					e1.printStackTrace();
//				}
//				Syst em.out.println("\nAre you want to see your report?\n\n It will help you to improve your understandings of the concepts\n");
//				System.out.println("y/n");
//				char f=sc.next().charAt(0);
//				if(f=='y') {
//					q.report(ans);
//				}
//				if(score1<40) {
//					Statement stmt;
//					
//					EventQueue.invokeLater(new Runnable() {
//						public void run() {
//							try {
//								mcqtry frame = new mcqtry(score1,s,paths);
//								frame.setVisible(true);
//							} catch (Exception e) {
//								e.printStackTrace();
//							}
//						}
//					});
//				}
//				else {
//					EventQueue.invokeLater(new Runnable() {
//						public void run() {
//							try {
//								mcqcomp frame = new mcqcomp(score1,s,paths);
//								frame.setVisible(true);
//							} catch (Exception e) {
//								e.printStackTrace();
//							}
//						}
//					});
//				}
//				
//			
//			
				
			
			}
		});
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane.add(comboBox);
		JButton btn = new JButton("OK");
	    contentPane.add(btn);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (19).png"));
	    lblNewLabel_1.setBounds(0, -92, 1339, 1261);
	    contentPane.add(lblNewLabel_1);
	}

}
