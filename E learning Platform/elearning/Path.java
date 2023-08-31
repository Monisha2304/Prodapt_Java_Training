package elearning;
import handson.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import handson.dem;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;

public class Path extends JFrame {

	private JPanel contentPane;
	static String path="";
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Path(String s) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setOpaque(false);
		txtrWelcomeToThe.setForeground(new Color(255, 255, 255));
		txtrWelcomeToThe.setBackground(new Color(0, 0, 0,0));
		txtrWelcomeToThe.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setText("Welcome  to the Learning Path!!!!\r\n\r\nIn our learning path we will be having 3 modules......\r\nComplete the levels to complete the path!!!!!\r\n\r\n\t--->Basic\r\n\t--->Intermediate\r\n\t--->Advanced\r\nClick START to start your journey.........ALL THE BEST....!!!!");
		txtrWelcomeToThe.setBounds(389, 110, 613, 274);
		contentPane.add(txtrWelcomeToThe);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Connection c=connect.connects();
				String [] links=new String[3];
				
				if(s.equals("PYTHON")) {
					path="lpython";
					links[0]="pythonbasicnotes.pdf";
					links[1]="pythoninternotes.pdf";
					links[2]="pythonadvancednotes.pdf";
				
				}
				else if(s.equals("C")){
					path="lc";
					links[0]="Cbasics.pdf";
					links[1]="Cinter.pdf";
					links[2]="Cadvance.pdf";
				
				}
				else if(s.equals("JAVA")){
					path="ljava";
					links[0]="javabasic.pdf";
					links[1]="IntermediateJava.pdf";
					links[2]="AdvancedJava.pdf";
				}
				else if(s.equals("C++")){
					path="lcpp";
					links[0]="c++easy.pdf";
					links[1]="c++inter.pdf";
					links[2]="c++advance.pdf";
					
				}
				else if(s.equals("SWIFT")){
					path="lswift";
					links[0]="swifteasy.pdf";
					links[1]="swiftinter.pdf";
					links[2]="swiftadvance.pdf";
				}
				else if(s.equals("C#")){
					path="lcsharp";
					links[0]="c#basic.pdf";
					links[1]="c#inter.pdf";
					links[2]="c#advance.pdf";
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Statement stmt = Login.c.createStatement();
							int s=stmt.executeUpdate("update login set "+path+"=\"module1\" where username=\""+Login.User+"\";");
							
							pathbasic frame = new pathbasic(links,path);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		btnNewButton.setBounds(913, 466, 89, 23);
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
		btnNewButton_1.setBounds(370, 466, 89, 23);
		contentPane.add(btnNewButton_1);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel.setBounds(0, -17, 1282, 1118);
		contentPane.add(lblNewLabel);
	}
}
