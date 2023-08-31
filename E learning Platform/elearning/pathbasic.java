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

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class pathbasic extends JFrame {
	
	private JPanel contentPane;
	public pathbasic(String[] links,String path) throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setOpaque(false);
		txtrWelcomeToThe.setForeground(new Color(255, 255, 255));
		txtrWelcomeToThe.setBackground(new Color(0, 0, 0,0));
		txtrWelcomeToThe.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setText("\t\tYou are at the MODULE-1 \r\n\r\n---->Check and Go through the notes given...!!\r\n---->Watch the video and get an idea...!!!\r\n---->If you done with both enter into MODULE-2...!!!\r\n");
		txtrWelcomeToThe.setBounds(391, 189, 668, 186);
		contentPane.add(txtrWelcomeToThe);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		try {
			Runtime.getRuntime().exec("cmd /c start "+links[0]);	
			} catch (Exception e) {
			  e.printStackTrace();
			}
		JButton btnNewButton = new JButton("MODULE-2");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Statement stmt;
				try {
					stmt = Login.c.createStatement();
				
					int s=stmt.executeUpdate("update login set "+path+"=\"module2\" where username=\""+Login.User+"\";");
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PathIntermediate frame = new PathIntermediate(links,path);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			}
		});
		btnNewButton.setBounds(888, 440, 117, 23);
		contentPane.add(btnNewButton);
		
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
		btnNewButton_1.setBounds(370, 440, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel.setBounds(0, -67, 1283, 1216);
		contentPane.add(lblNewLabel);
	}

}
