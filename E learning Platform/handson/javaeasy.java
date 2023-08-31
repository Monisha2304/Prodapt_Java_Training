package handson;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import elearning.Login;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

public class javaeasy extends JFrame {
	int score=0;
	private JPanel contentPane;
	public javaeasy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrYouAreAt = new JTextArea();
		txtrYouAreAt.setOpaque(false);
		txtrYouAreAt.setForeground(new Color(255, 255, 255));
		txtrYouAreAt.setBackground(new Color(0, 0, 0,0));
		txtrYouAreAt.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrYouAreAt.setEditable(false);
		txtrYouAreAt.setText("You are at the level : EASY\r\n\r\nInstructions\r\n-------------\r\n-->The question was given in the Easy file \r\n\tcheck it and start your code in Java1 file.\r\n\r\n-->The time to solve the question is 15 minutes.\r\n\r\n-->After completed the code don't forget to\r\n\tsave the file,otherwise your code will \r\n\tnot be accepted.");
		txtrYouAreAt.setBounds(356, 158, 594, 301);
		contentPane.add(txtrYouAreAt);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				String line="";
				//System.out.println("Enter the code in the file within 20 minutes....Once entered the code save the file");
				try {
				Runtime.getRuntime().exec("cmd /c start Easy.txt && exit");	
				Runtime.getRuntime().exec("cmd /c start Java1.java && exit");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//Thread.sleep(20000);
				Runtime.getRuntime().exec("cmd /c start javac Java1.java &&exit");
				Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"java Java1<Jtest1.txt>Jout2.txt");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Runtime.getRuntime().exec("cmd /c start javac Java1.java && exit");
				Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"java Java1<Jtest2.txt>>Jout2.txt");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				FileReader f1=new FileReader("C:\\Users\\monisha.m\\Documents\\Java Training\\Learning\\Jout1.txt");
				FileReader f2=new FileReader("C:\\Users\\monisha.m\\Documents\\Java Training\\Learning\\Jout2.txt");
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
                if(failed!=0) {
                	System.out.println("\nYou didn't passed all the test cases");
                	System.out.println("\nPassed test cases : "+passed);
                	System.out.println("\nFailed test cases : "+failed);
                	System.out.println("\nThe marks you scored : "+score);
                	System.out.println("\nGood Effort");
                	EventQueue.invokeLater(new Runnable() {
            			public void run() {
            				try {
            					repeat frame = new repeat("je");
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
                	if(score==100) {
                		
                		EventQueue.invokeLater(new Runnable() {
                			public void run() {
                				try {
                					Statement stmt;
        							
        							stmt = Login.c.createStatement();
        							
        							
        							//int s=stmt.executeUpdate("update login set "+paths+"=\"Attempt Failed\" where username=\""+Login.User+"\";");
        							int s1=stmt.executeUpdate("update login set score1=score1+"+score+" where username=\""+Login.User+"\";");
        							
        							s1=stmt.executeUpdate("update login set cjava=\"level2\" where username=\""+Login.User+"\";");
        							
                					easycomp frame = new easycomp();
                					frame.setVisible(true);
                				} catch (Exception e) {
                					e.printStackTrace();
                				}
                			}
                		});
                	}
                }
			
			}
			
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		});
		btnNewButton.setBounds(819, 482, 89, 23);
		contentPane.add(btnNewButton);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel.setBounds(0, 0, 1266, 1068);
		contentPane.add(lblNewLabel);
		
	
}
}

