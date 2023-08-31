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

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class pathadvance extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public pathadvance(String[] links,String path) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setOpaque(false);
		txtrWelcomeToThe.setForeground(new Color(255, 255, 255));
		txtrWelcomeToThe.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrWelcomeToThe.setBackground(new Color(0, 0, 0,0));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setText("\t\tYou are at the MODULE-3 \r\n\r\n\r\n---->Check and Go through the notes given...!!\r\n\r\n---->Watch the video and get an idea...!!!\r\n\r\n---->If you done with both enter click Done...!!!\r\n");
		txtrWelcomeToThe.setBounds(406, 119, 537, 237);
		contentPane.add(txtrWelcomeToThe);
		try {
			Runtime.getRuntime().exec("cmd /c start "+links[2]);	
			} catch (Exception e1) {
			  e1.printStackTrace();
			}
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Statement stmt;
				try {
					stmt = Login.c.createStatement();
				
					int s=stmt.executeUpdate("update login set "+path+"=\"Done\" where username=\""+Login.User+"\";");
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Complete frame = new Complete();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
				
			}
		});
		btnNewButton.setBounds(877, 400, 114, 23);
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
		btnNewButton_1.setBounds(445, 400, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel.setBounds(0, -22, 1359, 1115);
		contentPane.add(lblNewLabel);
	}
}
