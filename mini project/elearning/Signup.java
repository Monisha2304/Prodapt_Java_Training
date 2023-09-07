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
import javax.swing.JScrollPane;

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
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		lblNewLabel.setBounds(354, 40, 669, 41);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField.setBounds(718, 132, 390, 41);
		textField.addActionListener (new ActionListener () { 
			@Override public void actionPerformed (ActionEvent e) { 
				textField_1.requestFocusInWindow (); } }); 
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(329, 133, 126, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(329, 212, 126, 25);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(721, 206, 387, 41);
		textField_1.addActionListener (new ActionListener () { @Override public void actionPerformed (ActionEvent e) { textField_2.requestFocusInWindow (); } });
		
		
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(329, 283, 126, 34);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(721, 273, 387, 41);
		textField_2.addActionListener (new ActionListener () { 
			@Override public void actionPerformed (ActionEvent e) { 
				textField_3.requestFocusInWindow (); } });
		
		contentPane.add(textField_2);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		
		btnNewButton.setBounds(580, 536, 126, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password\r\n");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(329, 354, 218, 34);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(721, 344, 387, 41);
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
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(329, 433, 107, 34);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(721, 420, 387, 41);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1314, 758);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel_6 = new JLabel("");
		scrollPane.setRowHeaderView(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (23).png"));
	}
}
