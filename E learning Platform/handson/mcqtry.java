package handson;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import elearning.Login;

public class mcqtry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					mcqtry frame = new mcqtry(score1);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	static int score1=0;
	public mcqtry(int score,String s,String paths) {
		
		
		
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1311, 687);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		    setBounds(0,0,screenSize.width, screenSize.height);
		    setExtendedState(JFrame.MAXIMIZED_BOTH);
			
			JTextArea txtrCongratulationsCodeMaster = new JTextArea();
			
			
			
				txtrCongratulationsCodeMaster.setText("\t\tCongratulations Code Master.........!!!!!\r\n\r\nYou have successfully completed the MCQ Track......!!!!!\r\n\r\n"+s+" ..............You have scored "+score+" Marks.......!!!!!\r\n\r\nTry again and get good marks to get your certificate");
				txtrCongratulationsCodeMaster.setBounds(300, 174, 598, 203);
				contentPane.add(txtrCongratulationsCodeMaster);
				JButton btnNewButton = new JButton("CLOSE");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									dem window = new dem();
									window.frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
				});
				btnNewButton.setBounds(856, 432, 89, 23);
				contentPane.add(btnNewButton);
				JButton btnNewButton_1 = new JButton("Try Again");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						String qns="";
						String ans="";
						if(s.equals("PYTHON")) {
							try {
								qns="Python.txt";
								ans="Pythonsol.txt";
								
								
							}
							catch(Exception m) {
								
							}
						
						}
						else if(s.equals("C")){
							try {
								qns="C.txt";
								ans="Csol.txt";
						}
						catch(Exception m) {
							
						}
						}
						else if(s.equals("JAVA")){
							try {
								qns="Java.txt";
								ans="Javasol.txt";
						}
						catch(Exception m) {
							
						}
						}
						else if(s.equals("C++")){
							try {
								qns="CPP.txt";
								ans="CPPsol.txt";
						}
						catch(Exception m) {
							
						}
						}
						else if(s.equals("SWIFT")){
							try {
								qns="Swift.txt";
								ans="Swiftsol.txt";
						}
						catch(Exception m) {
							
						}
						}
						else if(s.equals("C#")){
							try {
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
						Scanner sc=new Scanner(System.in);
						char f=sc.next().charAt(0);
						if(f=='y') {
							q.report(ans);
						}
						if(score1<40) {
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
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (4) (2).png"));
				lblNewLabel.setBounds(0, -11, 881, 895);
				btnNewButton_1.setBounds(244, 432, 129, 23);
				contentPane.add(btnNewButton_1);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (10).png"));
				lblNewLabel_1.setBounds(0, -83, 1425, 1251);
				contentPane.add(lblNewLabel_1);
				
				
			
	}

}
