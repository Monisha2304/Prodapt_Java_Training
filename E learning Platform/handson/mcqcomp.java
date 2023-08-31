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
public class mcqcomp extends JFrame {
	
	static int score1=0;
	private JPanel contentPane;
	public mcqcomp(int score,String s,String paths) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextArea txtrCongratulationsCodeMaster = new JTextArea();
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
			txtrCongratulationsCodeMaster.setBounds(368, 134, 598, 262);
			contentPane.add(txtrCongratulationsCodeMaster);
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							certrificate frame = new certrificate();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		btnNewButton.setBounds(877, 465, 89, 23);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("GO TO TEST");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							languages frame = new languages();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btnNewButton_1.setBounds(326, 455, 129, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (10).png"));
		lblNewLabel.setBounds(0, -115, 1628, 1300);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
