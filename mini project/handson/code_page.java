package handson;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import elearning.Login;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class code_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					code_page frame = new code_page();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					code_page frame = new code_page("Python","Hard","Python3","Jtest13.txt","Jtest23.txt","Jout23.txt","Java13.txt");
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
	static int ss=0;
	public code_page(String language,String level,String codefile,String t1,String t2,String outs,String outss) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnNewButton_2.setBounds(297, 623, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 22, 540, 588);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setFont(new Font("Monospaced", Font.BOLD, 16));
		scrollPane.setViewportView(textArea);
	
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(648, 22, 608, 371);
		contentPane.add(scrollPane_1);
		
		JTextArea txtrWriteAProgram = new JTextArea();
		txtrWriteAProgram.setBackground(new Color(192, 192, 192));
		txtrWriteAProgram.setFont(new Font("Monospaced", Font.BOLD, 17));
		if(level.equals("Easy")) {
		txtrWriteAProgram.setText("Write a program to add the 2 numbers.\r\n\r\n\r\nSample input 1 \r\n--------------\r\n10\r\n20\r\n\r\nSample output 1\r\n---------------\r\n30\r\n\r\nExplanation \r\n-----------\r\n(10+20)=30 ");
		
		}
		else if(level.equals("Medium")) {
			txtrWriteAProgram.setText("Get the input list which contains n integers from the user and write the program to find the prime numbers in the list of integers and print the integers seperated by a space.\r\n"
					+ "\r\n"
					+ "Sample input 1\r\n"
					+ "--------------\r\n"
					+ "6\r\n"
					+ "3 6 9 11 27 2\r\n"
					+ "\r\n"
					+ "Sample output 1\r\n"
					+ "---------------\r\n"
					+ "3 11 2 \r\n"
					+ "\r\n"
					+ "Explanation \r\n"
					+ "-----------\r\n"
					+ "3,11,2 are prime numbers so they are printed.\r\n"
					+ "6,9,27 are not a prime numbers so they are not printed.");
		}
		else if(level.equals("Hard")) {
			txtrWriteAProgram.setText("Get a N*N matrix from an user and print the sum of the border elements in the matrix.\r\n"
					+ "\r\n"
					+ "Sample Input 1\r\n"
					+ "--------------\r\n"
					+ "3\r\n"
					+ "1 2 3\r\n"
					+ "4 5 6\r\n"
					+ "7 8 9\r\n"
					+ "\r\n"
					+ "Sample output 1\r\n"
					+ "---------------\r\n"
					+ "40\r\n"
					+ "\r\n"
					+ "Explanation \r\n"
					+ "-----------\r\n"
					+ "The sum of border elements=1+2+3+6+9+8+7+4=40.");
		}
		
		txtrWriteAProgram.setEditable(false);
		scrollPane_1.setViewportView(txtrWriteAProgram);
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(255, 255, 255));
		if(language.equals("Java")) {
			textArea.setText("import java.util.*;\r\n"
					+ "public class Java1{\r\n"
					+ "	public static void main(String [] args){\r\n"
					+ "\r\n"
					+ "		//Code here\r\n"
					+ "\r\n"
					+ "	}\r\n"
					+ "}\r\n"
					+ "	");
		}
		if (language.equals("Python")) {
			textArea.setText("#You can code here");
		}
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String f=textArea.getText();
				try {
					
					if(language.equals("Java")) {
						
						FileWriter f1=new FileWriter(codefile+".java");
						f1.write(f);
						f1.close();
					Runtime.getRuntime().exec("cmd /c start javac "+codefile+".java &&exit");
					Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"java "+codefile+"<"+t1+">"+outs);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Runtime.getRuntime().exec("cmd /c start javac "+codefile+".java &&exit");
					Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"java "+codefile+"<"+t2+">>"+outs);
				
				
					}
					else if(language.equals("Python")) {
						FileWriter f1=new FileWriter(codefile+".py");
						f1.write(f);
						f1.close();
						
						Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"python "+codefile+".py<"+t1+">"+outs);
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"python "+codefile+".py<"+t2+">>"+outs);
					
					}
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					FileReader f3=new FileReader(outss);
					FileReader f2=new FileReader(outs);
	                BufferedReader h1=new BufferedReader(f3);
	                BufferedReader h2=new BufferedReader(f2);
	                //int u=0;
	                int x=1;
	                String line="";
	                FileWriter fw=new FileWriter("result");
	                int passed=0,failed=0,score=0;
	                while((line=h1.readLine())!=null) {
	                	String line1=h2.readLine();
	                	if(!(line.equals(line1))) {
	                		//u=-1;
	                		failed+=1;
	                		System.out.println("\nTest case "+x+" Failed");
	                		fw.write("\nTest case "+x+" Failed\n");
	                		x+=1;
	                	}
	                	else {
	                		score+=50;
	                		passed+=1;
	                		System.out.println("\nTest case "+x+" Passed");
	                		fw.write("\nTest case "+x+" Failed\n");
	                		x+=1;
	                		
	                	}
	                }
	                fw.close();
	                try {
						Thread.sleep(10000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                if(failed!=0) {
	                	System.out.println("\nYou didn't passed all the test cases");
	                	System.out.println("\nPassed test cases : "+passed);
	                	System.out.println("\nFailed test cases : "+failed);
	                	System.out.println("\nThe marks you scored : "+score);
	                	System.out.println("\nGood Effort");
	                	dispose();
	                	EventQueue.invokeLater(new Runnable() {
	            			public void run() {
	            				try {
	            					if(level.equals("Easy")&&language.equals("Java")) {
	            						repeat frame = new repeat("je");
	                					frame.setVisible(true);
		            				}
		            				if(level.equals("Easy")&&language.equals("Python")) {
		            					repeat frame = new repeat("pe");
	                					frame.setVisible(true);
		            				}
		            				if(level.equals("Medium")&&language.equals("Java")) {
		            					repeat frame = new repeat("jm");
	                					frame.setVisible(true);
		            				}
		            				if(level.equals("Medium")&&language.equals("Python")) {
		            					repeat frame = new repeat("pm");
	                					frame.setVisible(true);
		            				}
		            				if(level.equals("Hard")&& language.equals("Java")) {
		            					repeat frame = new repeat("jh");
	            					frame.setVisible(true);
		            				}
		            				if(level.equals("Hard")&&language.equals("Python")) {
		            					repeat frame = new repeat("ph");
	            					frame.setVisible(true);
		            				}
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
	                	dispose();
	                	EventQueue.invokeLater(new Runnable() {
	            			public void run() {
	            				try {
	            					Statement stmt;
	    							
	    							stmt = Login.c.createStatement();
	    							if(language.equals("Java")) {
	    							int s1=stmt.executeUpdate("update login set cjava=\"completed\" where username=\""+Login.User+"\";");
	    							s1=stmt.executeUpdate("update login set score1=score1+"+ss+" where username=\""+Login.User+"\";");
	    							}
	    							else if(language.equals("Python")) {
	    								int s1=stmt.executeUpdate("update login set cpython=\"completed\" where username=\""+Login.User+"\";");
		    							s1=stmt.executeUpdate("update login set score2=score2+"+ss+" where username=\""+Login.User+"\";");
		    							
	    							}
	            					
	            				} catch (Exception e1) {
	            					e1.printStackTrace();
	            				}
	            				
	            				if(level.equals("Easy")&&language.equals("Java")) {
	            					easycomp frame = new easycomp();
                					frame.setVisible(true);
	            				}
	            				if(level.equals("Easy")&&language.equals("Python")) {
	            					easycomp1 frame = new easycomp1();
                					frame.setVisible(true);
	            				}
	            				if(level.equals("Medium")&&language.equals("Java")) {
	            					mediumcomp frame = new mediumcomp();
                					frame.setVisible(true);
	            				}
	            				if(level.equals("Medium")&&language.equals("Python")) {
	            					mediumcomp1 frame = new mediumcomp1();
                					frame.setVisible(true);
	            				}
	            				if(level.equals("Hard")&&language.equals("Java")) {
	            				
	            				finalpage frame = new finalpage("Java Coding Test");
	            				frame.setVisible(true);
            					
	    	            		}
	            				if(level.equals("Hard")&&language.equals("Python")) {
		            				
		            				finalpage frame = new finalpage("Python Coding Test");
		            				frame.setVisible(true);
	            					
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
		btnNewButton.setBounds(1126, 623, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Run");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String f=textArea.getText();
				try {
					
					if(language.equals("Java")) {
						FileWriter f1=new FileWriter(codefile+".java");
						f1.write(f);
						f1.close();
						Runtime.getRuntime().exec("cmd /c start javac "+codefile+".java");
						Runtime.getRuntime().exec("cmd /c start cmd.exe /c\"java "+codefile+"<"+t1+">"+outs);
						Thread.sleep(3000);
						Runtime.getRuntime().exec("cmd /c start javac "+codefile+".java &&exit");
						Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"java "+codefile+"<"+t2+">>"+outs);
					
					
						}
					else if(language.equals("Python")) {
						FileWriter f1=new FileWriter(codefile+".py");
						f1.write(f);
						f1.close();
						Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"python "+codefile+".py<"+t1+">"+outs);
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						Runtime.getRuntime().exec("cmd /c start cmd.exe  /c\"python "+codefile+".py<"+t2+">>"+outs);
					
					}
					FileReader f3=new FileReader(outss);
					FileReader f2=new FileReader(outs);
	                BufferedReader h1=new BufferedReader(f3);
	                BufferedReader h2=new BufferedReader(f2);
					String line="";
					int x=1;
					Thread.sleep(10000);
					textArea_1.setText("");
					while((line=h1.readLine())!=null) {
						
						textArea_1.append("Test case "+x);
						textArea_1.append("\n\nExpected Output\n-----------------\n");
						textArea_1.append(line);
						textArea_1.append("\n\nStudent Output\n-----------------\n");
						textArea_1.append(h2.readLine()+"\n\n\n");
						x+=1;
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		btnNewButton_1.setBounds(682, 623, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(648, 427, 608, 183);
		scrollPane_2.setViewportView(textArea_1);
		contentPane.add(scrollPane_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (25).png"));
		lblNewLabel.setBounds(-33, 0, 1393, 1080);
		contentPane.add(lblNewLabel);
		
		
	}
}
