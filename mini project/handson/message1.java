package handson;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import elearning.Login;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;

public class message1 extends JFrame {

	private JPanel contentPane;
	public message1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setOpaque(false);
		txtrWelcomeToThe.setForeground(new Color(255, 255, 255));
		txtrWelcomeToThe.setBackground(new Color(0, 0, 0,0));
		txtrWelcomeToThe.setFont(new Font("Monospaced", Font.BOLD, 25));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setText("Welcome  to the learning path!!!!\r\n\r\nIn our Python path we will be having 3 levels.......\r\n\r\nComplete the levels to complete the path!!!!!\r\n\r\n\t--->Easy\r\n\r\n\t--->Medium \r\n\r\n\t--->Hard");
		txtrWelcomeToThe.setBounds(202, 79, 853, 413);
		contentPane.add(txtrWelcomeToThe);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Statement stmt;
							
							stmt = Login.c.createStatement();
						
							int s1=stmt.executeUpdate("update login set cpython=\"level1\" where username=\""+Login.User+"\";");
							
							pythoneasy frame = new pythoneasy();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		btnNewButton.setBounds(341, 511, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (22).png"));
		lblNewLabel.setBounds(0, -77, 1282, 1232);
		contentPane.add(lblNewLabel);
		
	}

}
