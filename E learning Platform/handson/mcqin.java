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
	public mcqin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setOpaque(false);
		txtrWelcomeToThe.setForeground(new Color(255, 255, 255));
		txtrWelcomeToThe.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrWelcomeToThe.setBackground(new Color(0, 0, 0,0));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setText("\t\tWelcome to the learning path..............!!!!\r\n\r\nInstructions\r\n-------------\r\n\r\n----->You will be given with a set of mcq questions in this section.\r\n\r\n----->Timing to answer each question is 20 seconds.\r\n\r\n----->If you are not provided any answers for 20 seconds then the question will be skipped.\r\n\r\n\t\tDo well and get the certificate.....!!!!\r\n");
		txtrWelcomeToThe.setBounds(191, 145, 927, 309);
		contentPane.add(txtrWelcomeToThe);
		
		JButton btnNewButton = new JButton("OK\r\n");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				Scanner sc=new Scanner(System.in);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							selection frame = new selection();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			
				
			}
		});
		btnNewButton.setBounds(955, 521, 89, 23);
		contentPane.add(btnNewButton);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel.setBounds(0, -53, 1316, 1179);
		contentPane.add(lblNewLabel);
	}
}
