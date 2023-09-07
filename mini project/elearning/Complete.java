package elearning;
import handson.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Toolkit;

public class Complete extends JFrame {

	private JPanel contentPane;
	static String paths="";
	public Complete(String path) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JTextArea txtrHurrayyouHaveSuccessfully = new JTextArea();
		txtrHurrayyouHaveSuccessfully.setEditable(false);
		txtrHurrayyouHaveSuccessfully.setOpaque(false);
		txtrHurrayyouHaveSuccessfully.setForeground(new Color(0, 0, 0));
		txtrHurrayyouHaveSuccessfully.setFont(new Font("Monospaced", Font.BOLD, 25));
		txtrHurrayyouHaveSuccessfully.setBackground(new Color(0, 0, 0,0));
		txtrHurrayyouHaveSuccessfully.setText("\tHurray!!!!!!...You have successfully completed your Learning Path.....!!!!\r\n\r\n\r\n\t   Test your knowledge by taking the test in our platform.......!!!!!\r\n\r\n\r\n\t           See you in the Leaderboard.......!!!!");
		txtrHurrayyouHaveSuccessfully.setBounds(-33, 118, 1145, 302);
		contentPane.add(txtrHurrayyouHaveSuccessfully);
		
		JButton btnNewButton = new JButton("Go to MCQ Test");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				
				if(path.equals("ljava")) {
					paths="JAVA";
				}
				if(path.equals("lpython")) {
					paths="PYTHON";
				}
				if(path.equals("lc")) {
					paths="C";
				}
				if(path.equals("lcpp")) {
					paths="C++";
				}
				if(path.equals("lcsharp")) {
					paths="C#";
				}
				if(path.equals("lswift")) {
					paths="SWIFT";
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							mcqin frame = new mcqin(paths);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace(); 
						}
					}
				});
//				EventQueue.invokeLater(new Runnable() {
//					
//					public void run() {
//						try {
//							select frame = new select();
//							frame.setVisible(true);
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//					}
//				});
			}
		});
		btnNewButton.setBounds(690, 473, 247, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.WHITE);
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
		btnNewButton_1.setBounds(311, 473, 129, 39);
		contentPane.add(btnNewButton_1);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(UIManager.getColor("ToggleButton.shadow"));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (20).png"));
		lblNewLabel.setBounds(0, -70, 1337, 1222);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(526, 485, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
