package handson;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import elearning.Login;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

public class mediumcomp1 extends JFrame {
	static int ss=0;
	private JPanel contentPane;
	static int score2=0;
	public mediumcomp1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 635);
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
		txtrWelcomeToThe.setText("You successfully entered into the level 2......!!!!!\r\n\r\nYou are at the level : MEDIUM\r\n\r\nInstructions\r\n-------------\r\n\r\n-->The question was given in the medium file \r\n\tcheck it and start your code in Python2 file.\r\n\r\n-->The time to solve the question is 35 minutes.\r\n\r\n-->After completed the code don't forget to\r\n\tsave the file,otherwise your code will \r\n\tnot be accepted.");
		txtrWelcomeToThe.setBounds(324, 150, 644, 386);
		contentPane.add(txtrWelcomeToThe);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				int score=0;
				String line="";
				//System.out.println("Enter the code in the file within 20 minutes....Once entered the code save the file");
				try {
				Runtime.getRuntime().exec("cmd /c start Hard.txt && exit");	
				Runtime.getRuntime().exec("cmd /c start Python3.py && exit");
				try { 
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//Thread.sleep(20000);
				Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"python Python3.py<Jtest13.txt>Jout23.txt");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"python Python3.py<Jtest23.txt>>Jout23.txt");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				FileReader f1=new FileReader("C:\\Users\\monisha.m\\Documents\\Java Training\\Learning\\Jout12.txt");
				FileReader f2=new FileReader("C:\\Users\\monisha.m\\Documents\\Java Training\\Learning\\Jout22.txt");
                BufferedReader h1=new BufferedReader(f1);
                BufferedReader h2=new BufferedReader(f2);
                //int u=0;
                int x=1;
                int passed=0,failed=0;
                while((line=h1.readLine())!=null) {
                	String line1=h2.readLine();
                	if(!(line.equals(line1))) {
                		//u=-1;
                		failed+=1;
                		System.out.println("\nTest case "+x+" Failed");
                		x+=1;
                	}
                	else {
                		score+=50;
                		passed+=1;
                		System.out.println("\nTest case "+x+" Passed");
                		x+=1;
                		
                	}
                }
                score2=score;
                if(failed!=0) {
                	System.out.println("\nYou didn't passed all the test cases");
                	System.out.println("\nPassed test cases : "+passed);
                	System.out.println("\nFailed test cases : "+failed);
                	System.out.println("\nThe marks you scored : "+score);
                	System.out.println("\nGood Effort");
                	EventQueue.invokeLater(new Runnable() {
            			public void run() {
            				try {
            					repeat frame = new repeat("ph");
            					frame.setVisible(true);
            				} catch (Exception e) {
            					e.printStackTrace();
            				}
            			}
            		});
                	
                	
                	
                }
                else {
                	System.out.println("\nHurrayyy!!!!!!\nYou passed all the test casses!!!!");
                	System.out.println("\nCongratulations!!!!!!\nThe marks you scored : "+score);
                	ss=score;
                	EventQueue.invokeLater(new Runnable() {
            			public void run() {
            				try {
            					Statement stmt;
    							
    							stmt = Login.c.createStatement();
    						
    							int s1=stmt.executeUpdate("update login set cpython=\"completed\" where username=\""+Login.User+"\";");
    							
    							s1=stmt.executeUpdate("update login set score2=score2+"+score2+" where username=\""+Login.User+"\";");
    							
            					finalpage frame = new finalpage();
            					frame.setVisible(true);
            				} catch (Exception e) {
            					e.printStackTrace();
            				}
            			}
            		});
                }
			
			}
			
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		});
		btnNewButton.setBounds(907, 566, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel.setBounds(0, -75, 1285, 1229);
		contentPane.add(lblNewLabel);
	}

}
