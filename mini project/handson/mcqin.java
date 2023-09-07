package handson;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class mcqin extends JFrame {

	private JPanel contentPane;
	static int score1=0;
	public mcqin(String s) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setOpaque(false);
		txtrWelcomeToThe.setForeground(new Color(255, 255, 255));
		txtrWelcomeToThe.setFont(new Font("Monospaced", Font.BOLD, 25));
		txtrWelcomeToThe.setBackground(new Color(0, 0, 0,0));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setText("\tWelcome to the MCQ Test.............!!!!\r\n\r\nInstructions\r\n-------------\r\n\r\n-->You will be given with a set of mcq questions \r\n   in this section.\r\n\r\n-->Timing to answer each question is 20 seconds.\r\n\r\n-->If you are not provided any answers for 20 seconds \r\n   then the question will be skipped.\r\n\r\n\tDo well and get the certificate.....!!!!\r\n");
		txtrWelcomeToThe.setBounds(422, 30, 1110, 515);
		contentPane.add(txtrWelcomeToThe);
		
		JButton btnNewButton = new JButton("OK\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				Scanner sc=new Scanner(System.in);
//				EventQueue.invokeLater(new Runnable() {
//					public void run() {
//						try {
//							
//							selection frame = new selection();
//							frame.setVisible(true);
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//					}
//				});
				learntomcq l=new learntomcq(s);
			
				
			}
		});
		btnNewButton.setBounds(1042, 587, 89, 25);
		contentPane.add(btnNewButton);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (28).png"));
		lblNewLabel.setBounds(0, -53, 1316, 1179);
		contentPane.add(lblNewLabel);
	}
}
