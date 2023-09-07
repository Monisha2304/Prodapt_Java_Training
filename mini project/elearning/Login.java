package elearning;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import handson.Welcome;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToGearup;
	private JTextField textField;
	private JPasswordField  textField_1;
	public static String User="";
	public static String Name="";
	public static String email="";
	public static Connection c=null;
	private JPasswordField passwordField;
	
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
		JLabel lblNewLabel_8 = new JLabel("Show");
		lblNewLabel_8.setFont(new Font("Pristina", Font.PLAIN, 20));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		
		        lblNewLabel_8.addMouseListener(new MouseAdapter() {
		
		            @Override
		
		            public void mousePressed(MouseEvent e) {
		
		            	textField_1.setEchoChar((char)0);
		
		            }
		
		            @Override
		
		            public void mouseReleased(MouseEvent e) {
		
		            	textField_1.setEchoChar('*');
		
		            }
		
		        });
		        
		                lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		                
		                        lblNewLabel_8.setBounds(996, 333, 86, 49);
		                        
		                                contentPane.add(lblNewLabel_8);
		txtWelcomeToGearup = new JTextField();
		txtWelcomeToGearup.setForeground(new Color(255, 255, 255));
		txtWelcomeToGearup.setBackground(new Color(0,0,0,0));
		txtWelcomeToGearup.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtWelcomeToGearup.setText("   Welcome to GEARUP\r\n\r\n");
		txtWelcomeToGearup.setEditable(false);
		txtWelcomeToGearup.setBounds(430, 83, 333, 37);
		contentPane.add(txtWelcomeToGearup);
		txtWelcomeToGearup.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(299, 225, 172, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(299, 332, 172, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New to GEAR UP??");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(326, 529, 249, 37);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		btnNewButton.setBounds(810, 529, 151, 37);
		contentPane.add(btnNewButton);
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(810, 329, 181, 37);
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.addActionListener (new ActionListener () { 
			@Override public void actionPerformed (ActionEvent e) { 
				textField_1.requestFocusInWindow (); } }); 
		textField.setBounds(810, 239, 181, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
//		textField_1 = new JTextField();
//		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

//		textField_1.setBounds(810, 346, 181, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				String username=textField.getText();
				@SuppressWarnings("deprecation")
				String password=textField_1.getText();
				
				
				Scanner sc=new Scanner(System.in);
				try {
					
					Statement stmt = c.createStatement();
					ResultSet s=stmt.executeQuery("select * from login where username=\""+username+"\";");
					
					if(s.next()) {
					String pass=s.getString(3);
					Name=s.getString(4);
					
					
					
					
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
		btnNewButton_1.setBounds(581, 440, 98, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setLabelFor(this);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (35).png"));
		lblNewLabel_3.setBounds(10, -30, 1281, 1135);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(625, 286, 7, 20);
		
		
		
	}
}
