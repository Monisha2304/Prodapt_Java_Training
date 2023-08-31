package elearning;
import handson.*;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import handson.dem;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;

public class PathIntermediate extends JFrame {

	private JPanel contentPane1;
	public PathIntermediate(String[] links,String path) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 558);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setOpaque(false);
		txtrWelcomeToThe.setForeground(new Color(255, 255, 255));
		txtrWelcomeToThe.setBackground(new Color(0, 0, 0,0));
		txtrWelcomeToThe.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setText("\t\tYou are at the MODULE-2 \r\n\r\n---->Check and Go through the notes given...!!\r\n---->Watch the video and get an idea...!!!\r\n---->If you done with both enter into MODULE-3...!!!\r\n");
		txtrWelcomeToThe.setBounds(457, 205, 606, 174);
		contentPane1.add(txtrWelcomeToThe);
		try {
			Runtime.getRuntime().exec("cmd /c start "+links[1]);	
			} catch (Exception e1) {
			  e1.printStackTrace();
			}
		JButton btnNewButton = new JButton("MODULE-3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Statement stmt;
				try {
					stmt = Login.c.createStatement();
				
					int s=stmt.executeUpdate("update login set "+path+"=\"module3\" where username=\""+Login.User+"\";");
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							pathadvance frame = new pathadvance(links,path);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
				
			}
		});
		btnNewButton.setBounds(972, 452, 119, 23);
		contentPane1.add(btnNewButton);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JButton btnNewButton_1 = new JButton("QUIT");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(447, 452, 89, 23);
		contentPane1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel.setBounds(0, -113, 1280, 1305);
		contentPane1.add(lblNewLabel);
	}

}
