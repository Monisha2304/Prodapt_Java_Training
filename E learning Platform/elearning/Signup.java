package elearning;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.accessibility.AccessibleContext;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Signup() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to the GEAR UP Platform");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel.setBounds(326, 34, 512, 41);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		
		textField.setBounds(718, 130, 277, 20);
		textField.addActionListener (new ActionListener () { 
			@Override public void actionPerformed (ActionEvent e) { 
				textField_1.requestFocusInWindow (); } }); 
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(379, 133, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(379, 212, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(721, 193, 274, 20);
		textField_1.addActionListener (new ActionListener () { @Override public void actionPerformed (ActionEvent e) { textField_2.requestFocusInWindow (); } });
		
		
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(379, 283, 76, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(721, 263, 274, 20);
		textField_2.addActionListener (new ActionListener () { 
			@Override public void actionPerformed (ActionEvent e) { 
				textField_3.requestFocusInWindow (); } });
		
		contentPane.add(textField_2);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Connection c=connect.connects();
				
				String email=textField.getText();
				String username=textField_1.getText();
				String password=textField_2.getText();
				String cpassword=textField_3.getText();
				String name=textField_4.getText();
				Scanner sc=new Scanner(System.in);
				try {
					Statement stmt = c.createStatement();
					ResultSet s=stmt.executeQuery("select * from login where email=\""+email+"\";");
					
						
					
					if(!s.next()) {
						
						if(password.equals(cpassword)) {
							
							
					           String s2="insert into login(email,username,password,name) values(?,?,?,?);";
					           try {
					           PreparedStatement ps=(PreparedStatement) c.prepareStatement(s2);
					          
					           ps.setString(1, email);
							
					    
					           ps.setString(2, username);
					           ps.setString(3, password);
					           ps.setString(4, name);
					           
					           
					           ps.execute();
					           stmt.executeUpdate("update login set score1="+0+",score2="+0+",score3="+0+",mc="+0+",mcpp="+0+",mcsharp="+0+",mpython="+0+",mswift="+0+",mjava="+0+" where username="+"\""+username+"\";");
								
					           JOptionPane.showMessageDialog(btnNewButton, "User Successfully Registered.....!!!! Login to start your journey");
					           EventQueue.invokeLater(new Runnable() {
					   			public void run() {
					   				try {
					   					Login frame = new Login();
					   					frame.setVisible(true);
					   				} catch (Exception e) {
					   					e.printStackTrace();
					   				}
					   			}
					   		});
					   	
					           
					           } catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						else {
						System.out.println("Check the password again");
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Signup frame = new Signup();
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
						}
					
					}
					else {
						System.out.println("Email aready exist");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Signup frame = new Signup();
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
						
				c.close();	
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		btnNewButton.setBounds(580, 520, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password\r\n");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(377, 343, 104, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(721, 340, 274, 20);
		textField_3.addActionListener (new ActionListener () { 
			@Override public void actionPerformed (ActionEvent e) { 
				textField_4.requestFocusInWindow (); } });
		
		contentPane.add(textField_2);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(387, 433, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(721, 430, 274, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel_6.setBounds(0, -118, 1892, 1316);
		contentPane.add(lblNewLabel_6);
	}
}
