package elearning;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import handson.Welcome;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToGearup;
	private JTextField textField;
	private JTextField textField_1;
	public static String User="";
	public static Connection c=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		c=connect.connects();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		txtWelcomeToGearup = new JTextField();
		txtWelcomeToGearup.setForeground(new Color(0, 0, 0));
		txtWelcomeToGearup.setBackground(SystemColor.inactiveCaptionBorder);
		txtWelcomeToGearup.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtWelcomeToGearup.setText(" Welcome to GEARUP\r\n\r\n");
		txtWelcomeToGearup.setEditable(false);
		txtWelcomeToGearup.setBounds(493, 79, 272, 37);
		contentPane.add(txtWelcomeToGearup);
		txtWelcomeToGearup.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(339, 225, 132, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(339, 332, 132, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New to GEAR UP??");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(328, 531, 188, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
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
		});
		btnNewButton.setBounds(744, 529, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.addActionListener (new ActionListener () { 
			@Override public void actionPerformed (ActionEvent e) { 
				textField_1.requestFocusInWindow (); } }); 
		textField.setBounds(810, 224, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();

		textField_1.setBounds(810, 331, 151, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Login");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				String username=textField.getText();
				String password=textField_1.getText();
				Scanner sc=new Scanner(System.in);
				try {
					
					Statement stmt = c.createStatement();
					ResultSet s=stmt.executeQuery("select * from login where username=\""+username+"\";");
					
					if(s.next()) {
					String pass=s.getString(3);
					
					
					
					
					if(pass.equals(password)) {
						JOptionPane.showMessageDialog(btnNewButton_1, "Successfully Logged in...!!!!!");
						User=username;
						Welcome w=new Welcome();
					}
					else {
						
						dispose();
						JOptionPane.showMessageDialog(btnNewButton_1, "Username and Password not match");
						
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
					}
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton_1, "User not available...Sign up to Start your journey with us!!!!");
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
					
				catch(Exception e1) {
					
				}
			}
		});
		btnNewButton_1.setBounds(581, 440, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setLabelFor(this);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel_3.setBounds(0, -31, 1281, 1135);
		contentPane.add(lblNewLabel_3);
	}
}
