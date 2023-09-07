package handson;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class mcqreport extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					mcqreport frame = new mcqreport();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	static int score1=0;
	public mcqreport(int score,String s,String paths,String qns) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		String line="";
		
		String content="";
		try {
		FileReader fr=new FileReader("Solution.txt");
		BufferedReader br1=new BufferedReader(fr);
		
			while((line=br1.readLine())!=null) {
				content=content+"\n\r"+(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(754, 597, 153, 33);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(296, 112, 660, 438);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setText(content);
		
		JLabel lblNewLabel = new JLabel("Report");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(513, 58, 199, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Try Again");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							mcqin frame = new mcqin(s);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace(); 
						}
					}
				});
//				questions q=new questions();
//				try {
//					score1=q.choose(qns,"Solution.txt",s,paths);
//					System.out.println("The marks you scored : "+score1);
//				}
//				catch(Exception e1) {
//					e1.printStackTrace();
//				}
//				
//				if(score1<40) {
//					EventQueue.invokeLater(new Runnable() {
//						public void run() {
//							try {
//								mcqtry frame = new mcqtry(score1,s,paths,qns);
//								frame.setVisible(true);
//							} catch (Exception e) {
//								e.printStackTrace();
//							}
//						}
//					});
//				
//				}
//				else {
//					EventQueue.invokeLater(new Runnable() {
//						public void run() {
//							try {
//								mcqcomp frame = new mcqcomp(score1,s,paths,qns);
//								
//								frame.setVisible(true);
//							} catch (Exception e) {
//								e.printStackTrace();
//							}
//						}
//					});
//				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(382, 597, 160, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (37).png"));
		lblNewLabel_1.setBounds(0, -53, 1357, 1186);
		contentPane.add(lblNewLabel_1);
	}
}
