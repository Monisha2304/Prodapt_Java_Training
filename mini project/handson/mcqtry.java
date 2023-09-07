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
import java.awt.Font;
import java.awt.Color;

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
	public mcqtry(int score,String s,String paths,String qns) {
		
		
		
			
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
			txtrCongratulationsCodeMaster.setForeground(new Color(255, 255, 255));
			txtrCongratulationsCodeMaster.setFont(new Font("Monospaced", Font.BOLD, 25));
			txtrCongratulationsCodeMaster.setOpaque(false);
			
			
				txtrCongratulationsCodeMaster.setText("\t\tCongratulations Code Master.........!!!!!\r\n\r\nGood effort !!!!....You tried the MCQ Track......!!!!!\r\n\r\n"+s+" ..............You have scored "+ score+" Marks.......!!!!!\r\n\r\nTry again and get good marks to get your certificate");
				txtrCongratulationsCodeMaster.setBounds(40, 189, 922, 284);
				contentPane.add(txtrCongratulationsCodeMaster);
				JButton btnNewButton = new JButton("Close");
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
				JButton button = new JButton("View Report");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									mcqreport frame = new mcqreport(score,s,paths,qns);
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
				});
				btnNewButton.setBounds(754, 529, 110, 33);
				contentPane.add(btnNewButton);
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (4) (2).png"));
				lblNewLabel.setBounds(0, -11, 881, 895);
				
//				JButton button = new JButton("View Report");
//				button.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						EventQueue.invokeLater(new Runnable() {
//							public void run() {
//								try {
//									mcqreport frame = new mcqreport();
//									frame.setVisible(true);
//								} catch (Exception e) {
//									e.printStackTrace();
//								}
//							}
//						});
//					}
//				});
				button.setFont(new Font("Tahoma", Font.PLAIN, 20));
				button.setBounds(137, 529, 150, 33);
				contentPane.add(button);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (33).png"));
				lblNewLabel_1.setBounds(0, -33, 1291, 1135);
				contentPane.add(lblNewLabel_1);
				
				
			
	}

}
