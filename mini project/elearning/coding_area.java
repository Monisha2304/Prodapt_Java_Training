package elearning;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import handson.dem;
import handson.easycomp;
import handson.easycomp1;
import handson.finalpage;
import handson.mediumcomp;
import handson.mediumcomp1;
import handson.repeat;

public class coding_area extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					coding_area frame = new coding_area("Python","Learning","Python3","Jtestlearn11.txt","Jtestlearn12.txt","Joutlearn11.txt","output.txt");
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
	public coding_area(String language,String level,String codefile,String t1,String t2,String outss,String outs) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Solution");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(language.equals("Python")) {
				if(level.equals("Learning11")) {
				JOptionPane.showMessageDialog(btnNewButton_3, "print(\"Hello Gear Up......I am here......\")");
				}
				else if(level.equals("Learning12")) {
					JOptionPane.showMessageDialog(btnNewButton_3, "a=input().strip()\r\n"
							+ "print(len(a))\r\n"
							+ "");
				}
				else if(level.equals("Learning13")) {
					JOptionPane.showMessageDialog(btnNewButton_3, "a=int(input())\r\n"
							+ "l=list(map(int,input().split()))\r\n"
							+ "print(sum(l))");
				}
				else if(level.equals("Learning14")) {
					JOptionPane.showMessageDialog(btnNewButton_3, "n=int(input())\r\n"
							+ "m=int(input())\r\n"
							+ "l=[]\r\n"
							+ "for i in range(n):\r\n"
							+ "	l.append(list(map(int,input().split())))\r\n"
							+ "for i in l:\r\n"
							+ "	for j in i:\r\n"
							+ "		if j%2==0:\r\n"
							+ "			print(j,end=\" \")\r\n"
							+ "print()\r\n"
							+ "");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton_3,"a=int(input())\r\n"
							+ "l=list(map(int,input().split()))\r\n"
							+ "print(*l[:4])\r\n"
							+ "");
				}
				}
				else {
					if(level.equals("Learning11")) {
						JOptionPane.showMessageDialog(btnNewButton_3, "import java.util.*;\r\n"
								+ "public class Java1{\r\n"
								+ "	public static void main(String [] args){\r\n"
								+ "\r\n"
								+ "		//Code here\r\n"
								+ "		System.out.println(\"Hello Gear Up......I am here......\");\r\n"
								+ "\r\n"
								+ "	}\r\n"
								+ "}");
						}
						else if(level.equals("Learning12")) {
							JOptionPane.showMessageDialog(btnNewButton_3, "import java.util.*;\r\n"
									+ "public class Java1{\r\n"
									+ "	public static void main(String [] args){\r\n"
									+ "\r\n"
									+ "		//Code here\r\n"
									+ "		Scanner sc=new Scanner(System.in);\r\n"
									+ "		String s=sc.next();\r\n"
									+ "		System.out.println(s.length());\r\n"
									+ "\r\n"
									+ "	}\r\n"
									+ "}\r\n"
									+ "");
						}
						else if(level.equals("Learning13")) {
							JOptionPane.showMessageDialog(btnNewButton_3, "import java.util.*;\r\n"
									+ "public class Java1{\r\n"
									+ "	public static void main(String [] args){\r\n"
									+ "\r\n"
									+ "		//Code here\r\n"
									+ "		Scanner sc=new Scanner(System.in);\r\n"
									+ "		int a=sc.nextInt();\r\n"
									+ "		int arr[]=new int[a];\r\n"
									+ "		int m=0;\r\n"
									+ "		for(int i=0;i<a;i++){\r\n"
									+ "			arr[i]=sc.nextInt();\r\n"
									+ "			m+=arr[i];\r\n"
									+ "		}\r\n"
									+ "		System.out.println(m);\r\n"
									+ "		\r\n"
									+ "\r\n"
									+ "	}\r\n"
									+ "}\r\n"
									+ "");
						}
						else if(level.equals("Learning14")) {
							JOptionPane.showMessageDialog(btnNewButton_3, "import java.util.*;\r\n"
									+ "public class Java1{\r\n"
									+ "	public static void main(String [] args){\r\n"
									+ "\r\n"
									+ "		//Code here\r\n"
									+ "		Scanner sc=new Scanner(System.in);\r\n"
									+ "		int a=sc.nextInt();\r\n"
									+ "		int b=sc.nextInt();\r\n"
									+ "		int arr[][]=new int[a][b];\r\n"
									+ "		for(int i=0;i<a;i++){\r\n"
									+ "			for(int j=0;j<b;j++){\r\n"
									+ "				arr[i][j]=sc.nextInt();\r\n"
									+ "				if(arr[i][j]%2==0){\r\n"
									+ "					System.out.print(arr[i][j]+\" \");\r\n"
									+ "				}\r\n"
									+ "			}\r\n"
									+ "		}\r\n"
									+ "		System.out.println();\r\n"
									+ "\r\n"
									+ "	}\r\n"
									+ "}");
						}
						else {
							JOptionPane.showMessageDialog(btnNewButton_3,"import java.util.*;\r\n"
									+ "public class Java1{\r\n"
									+ "	public static void main(String [] args){\r\n"
									+ "\r\n"
									+ "		//Code here\r\n"
									+ "		Scanner sc=new Scanner(System.in);\r\n"
									+ "		int a=sc.nextInt();\r\n"
									+ "		int arr[]=new int[a];\r\n"
									+ "		for(int i=0;i<a;i++){\r\n"
									+ "			arr[i]=sc.nextInt();\r\n"
									+ "		}\r\n"
									+ "		for(int i=0;i<4;i++){\r\n"
									+ "			System.out.print(arr[i]+\" \");\r\n"
									+ "		}\r\n"
									+ "		System.out.println();\r\n"
									+ "\r\n"
									+ "	}\r\n"
									+ "}\r\n"
									+ "");
						}
				}
				
			}
		});
		
		JButton btnNewButton_4 = new JButton("Home");
		btnNewButton_4.addActionListener(new ActionListener() {
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
		btnNewButton_4.setBounds(273, 587, 89, 23);
		contentPane.add(btnNewButton_4);
		btnNewButton_3.setBounds(965, 587, 107, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Hint");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(language.equals("Python")) {
					if(level.equals("Learning11")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Use the print statement to print");
					}
					else if(level.equals("Learning12")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Count the characters in the string");
					}
					else if(level.equals("Learning13")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Use sum method");
					}
					else if(level.equals("Learning14")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Use the modulo operator to find the number is odd or even");
					}
					else if(level.equals("Learning15")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Print the values at the first 4 indices of the list");
					}
				}
				else {
					if(level.equals("Learning11")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Use the System.out.println() statement to print");
					}
					else if(level.equals("Learning12")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Use length() method");
					}
					else if(level.equals("Learning13")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Initialize a variable with 0 and add the every element of list to it");
					}
					else if(level.equals("Learning14")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Use the modulo operator to find the number is odd or even");
					}
					else if(level.equals("Learning15")) {
						JOptionPane.showMessageDialog(btnNewButton_2, "Prin the values at the first 4 indices of the array");
					}
				}
			}
		});
		
		
		
		btnNewButton_2.setBounds(817, 587, 107, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 22, 540, 543);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setFont(new Font("Monospaced", Font.BOLD, 16));
		scrollPane.setViewportView(textArea);
	
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(648, 22, 608, 352);
		contentPane.add(scrollPane_1);
		
		JTextArea txtrWriteAProgram = new JTextArea();
		txtrWriteAProgram.setBackground(new Color(192, 192, 192));
		txtrWriteAProgram.setFont(new Font("Monospaced", Font.BOLD, 17));
		
		if(level.equals("Learning11")) {
			txtrWriteAProgram.setText("Write a program to print \"Hello Gear Up......I am here......\"\r\n"
					+ "\r\n"
					+ "Sample output 1\r\n"
					+ "---------------\r\n"
					+ "Hello Gear Up......I am here......\r\n"
					+ "\r\n");
			
			
					
		}
		else if(level.equals("Learning12")) {
			txtrWriteAProgram.setText("Write a program to get the string and print its length.\r\n"
					+ "\r\n"
					+ "Sample Input 1\r\n"
					+ "--------------\r\n"
					+ "abcdef"
					+ "\r\n"
					+ "Sample output 1\r\n"
					+ "---------------\r\n"
					+ "6\r\n"
					+ "\r\n"
					+ "Explanation \r\n"
					+ "-----------\r\n"
					+ "There are 6 characters in the string\"abcdef\"."
					+ "\r\n"
					+ "\r\n"
					+ "Sample Input 2\r\n"
					+ "--------------\r\n"
					+ "GEARUP"
					+ "\r\n"
					+ "Sample output 2\r\n"
					+ "---------------\r\n"
					+ "6\r\n"
					+ "\r\n");
		}
		else if(level.equals("Learning13")) {
			txtrWriteAProgram.setText("Write a program to get the list of N integers and print its sum.\r\n"
					+ "\r\n"
					+ "Sample Input 1\r\n"
					+ "--------------\r\n"
					+ "5"
					+ "\r\n"
					+ "1 2 3 4 5"
					+ "\r\n"
					+ "Sample output 1\r\n"
					+ "---------------\r\n"
					+ "15\r\n"
					+ "\r\n"
					+ "Explanation \r\n"
					+ "-----------\r\n"
					+ "1+2+3+4+5=15."
					+ "\r\n"
					+ "Sample Input 2\r\n"
					+ "--------------\r\n"
					+ "6"
					+ "\r\n"
					+ "1 2 3 4 5 6"
					+ "\r\n"
					+ "Sample output 2\r\n"
					+ "---------------\r\n"
					+ "21\r\n"
					+ "\r\n");
		}
		else if(level.equals("Learning14")) {
			txtrWriteAProgram.setText("Write a program to get the N*M matrix and print the even numbers in the matrix.\r\n"
					+ "\r\n"
					+ "Sample Input 1\r\n"
					+ "--------------\r\n"
					+ "2"
					+ "\r\n"
					+ "3"
					+ "\r\n"
					+ "1 2 3"
					+ "\r\n"
					+ "4 5 6"
					+ "\r\n"
					+ "Sample output 1\r\n"
					+ "---------------\r\n"
					+ "2 4 6\r\n"
					+ "\r\n"
					+ "Sample Input 2\r\n"
					+ "--------------\r\n"
					+ "5"
					+ "\r\n"
					+"4"
					+ "\r\n"
					+"1 2 3 4"
					+ "\r\n"
					+"1 2 3 4"
					+ "\r\n"
					+"1 2 3 4"
					+ "\r\n"
					+"1 2 3 4"
					+ "\r\n"
					+"1 2 3 4"
					+ "\r\n"
					+ "Sample output 2\r\n"
					+ "---------------\r\n"
					+"2 4 2 4 2 4 2 4 2 4"
					+ "\r\n");
		}
		else if(level.equals("Learning15")) {
			txtrWriteAProgram.setText("Write a program to get list of N integers from the user .\r\n Print the first 4 integers from the list.\r\n"
					+ "\r\n"
					+ "Sample Input 1\r\n"
					+ "--------------\r\n"
					+ "6"
					+ "\r\n"
					+ "1 2 3 4 5 6"
					+ "\r\n"
					+ "Sample output 1\r\n"
					+ "---------------\r\n"
					+ "1 2 3 4\r\n"
					+ "\r\n"
					+ "Explanation \r\n"
					+ "-----------\r\n"
					+ "Printing the first 4 indices."
					+ "\r\n\r\n"
					+ "Sample Input 2\r\n"
					+ "--------------\r\n"
					+ "10"
					+ "\r\n"
					+ "11 12 13 14 15 16 17 18 19 20"
					+ "\r\n"
					+ "Sample output 2\r\n"
					+ "---------------\r\n"
					+ "11 12 13 14\r\n"
					+ "\r\n");
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
	                	JOptionPane.showMessageDialog(btnNewButton, "Not passed all the test cases");
	                	                	 
	                	
	                }
	                else {
	                	JOptionPane.showMessageDialog(btnNewButton, "Successfully Completed");
	                	dispose();
	                	
	                }
				
				}
				 catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(1117, 587, 100, 23);
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
		btnNewButton_1.setBounds(680, 589, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(648, 393, 608, 171);
		scrollPane_2.setViewportView(textArea_1);
		contentPane.add(scrollPane_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (25).png"));
		lblNewLabel.setBounds(-33, 0, 1393, 1080);
		contentPane.add(lblNewLabel);
	}

}
