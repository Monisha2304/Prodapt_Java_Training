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
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(417, 234, 612, 33);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select","PYTHON", "C","JAVA","C++","SWIFT","C#"}));
		comboBox.setBounds(599, 370, 130, 22);
		//comboBox.getDropTarget();
		
		comboBox.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Scanner sc=new Scanner(System.in);
				s=(String) comboBox.getSelectedItem();
				String qns="";
				String ans="";
				
				if(s.equals("PYTHON")) {
					try {
						paths="mpython";
						qns="Python.txt";
						ans="Pythonsol.txt";
						
						
					}
					catch(Exception m) {
						
					}
				
				}
				else if(s.equals("C")){
					try {
						paths="mc";
						qns="C.txt";
						ans="Csol.txt";
				}
				catch(Exception m) {
					
				}
				}
				else if(s.equals("JAVA")){
					try {
						paths="mjava";
						qns="Java.txt";
						ans="Javasol.txt";
				}
				catch(Exception m) {
					
				}
				}
				else if(s.equals("C++")){
					try {
						paths="mcpp";
						qns="CPP.txt";
						ans="CPPsol.txt";
				}
				catch(Exception m) {
					
				}
				}
				else if(s.equals("SWIFT")){
					try {
						paths="mswift";
						qns="Swift.txt";
						ans="Swiftsol.txt";
				}
				catch(Exception m) {
					
				}
				}
				else if(s.equals("C#")){
					try {
						paths="mcsharp";
						qns="Csharp.txt";
						ans="Csharpsol.txt";
				}
				catch(Exception m) {
					
				}
				}
				
				questions q=new questions();
				try {
					score1=q.choose(qns,ans);
					System.out.println("The marks you scored : "+score1);
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				System.out.println("\nAre you want to see your report?\n\n It will help you to improve your understandings of the concepts\n");
				System.out.println("y/n");
				char f=sc.next().charAt(0);
				if(f=='y') {
					q.report(ans);
				}
				if(score1<40) {
					Statement stmt;
					
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								mcqtry frame = new mcqtry(score1,s,paths);
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								mcqcomp frame = new mcqcomp(score1,s,paths);
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				
			
			
				
			
			}
		});
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane.add(comboBox);
		JButton btn = new JButton("OK");
	    contentPane.add(btn);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
	    lblNewLabel_1.setBounds(0, -92, 1339, 1261);
	    contentPane.add(lblNewLabel_1);
	}

}
