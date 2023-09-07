package handson;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import elearning.table;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

public class finalpage extends JFrame {

	private JPanel contentPane;
	public finalpage(String achievement) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrCongratulationsCodeMaster = new JTextArea();
		txtrCongratulationsCodeMaster.setOpaque(false);
		txtrCongratulationsCodeMaster.setForeground(new Color(0, 0, 0));
		txtrCongratulationsCodeMaster.setFont(new Font("Monospaced", Font.BOLD, 25));
		txtrCongratulationsCodeMaster.setBackground(new Color(0, 0, 0,0));
		txtrCongratulationsCodeMaster.setEditable(false);
		txtrCongratulationsCodeMaster.setText("\t\tCongratulations Code Master...............!!!!!!!!\r\n\r\nYou have successfully completed your Knowledge Testing Path with us...!!!!!\r\n\r\nYou are an awesome coder...................!!!!\r\n\r\nCheck the Leaderboard to see your current position....!!!!\r\n\r\n\t\t\tKeep Rocking.............!!!!!!!!!!!!");
		txtrCongratulationsCodeMaster.setBounds(0, 139, 1146, 351);
		contentPane.add(txtrCongratulationsCodeMaster);
		 
		JButton btnNewButton = new JButton("View Leader Board");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                try {
		           table frame = new table();
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
		btnNewButton.setBounds(599, 533, 257, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Get the certificate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							certrificate frame = new certrificate(achievement);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(145, 533, 160, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (20).png"));
		lblNewLabel.setBounds(0, -71, 1338, 1225);
		contentPane.add(lblNewLabel);
	}
}
