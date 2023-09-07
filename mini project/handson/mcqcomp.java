package handson;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import elearning.Login;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.*;
import java.awt.Font;
public class mcqcomp extends JFrame {
	
	static int score1=0;
	private JPanel contentPane;
	public mcqcomp(int score,String s,String paths,String qns) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextArea txtrCongratulationsCodeMaster = new JTextArea();
		txtrCongratulationsCodeMaster.setFont(new Font("Monospaced", Font.BOLD, 25));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		
			try {
				Statement stmt = Login.c.createStatement();
			
				//int s=stmt.executeUpdate("update login set "+paths+"=\"Attempt Failed\" where username=\""+Login.User+"\";");
				int s1=stmt.executeUpdate("update login set "+paths+"="+score+" where username=\""+Login.User+"\";");
				} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			txtrCongratulationsCodeMaster.setText("\t\tCongratulations Code Master.........!!!!!\r\n\r\nYou have successfully completed the MCQ Track......!!!!!\r\n\r\n"+s+" ..............You have scored "+score+"  Marks.......!!!!!\r\n\r\nClick the View button to view your certificate....!!!!");
			txtrCongratulationsCodeMaster.setBounds(105, 178, 884, 262);
			contentPane.add(txtrCongratulationsCodeMaster);
		JButton btnNewButton = new JButton("View Certificate");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							certrificate frame = new certrificate(s+" MCQ test");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		btnNewButton.setBounds(456, 524, 207, 23);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Go to Test");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							languages frame = new languages("Coding");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btnNewButton_1.setBounds(847, 524, 213, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Report ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(134, 524, 172, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (20).png"));
		lblNewLabel.setBounds(0, 0, 1290, 1080);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
