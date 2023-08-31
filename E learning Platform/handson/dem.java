package handson;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import elearning.Login;
import elearning.choice;
import elearning.table;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class dem {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public dem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1283, 861);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to GEARUP ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(495, 93, 249, 29);
		frame.getContentPane().add(lblNewLabel);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setBounds(0,0,screenSize.width, screenSize.height);
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JButton btnNewButton = new JButton("Start to Learn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    frame.dispose();
				    EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								choice frame = new choice();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
//				Test t=new Test();
//				t.mcq();
				
			}
			
		});
		btnNewButton.setBounds(405, 236, 170, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Test My Knowledge");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    frame.dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								select frame = new select();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
//				Test t=new Test();
//				t.mcq();
				
			}
			
		});
		btnNewButton_1.setBounds(581, 354, 170, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login frame = new Login();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(1127, 39, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Achievements");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(927, 575, 170, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LeaderBoard");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
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
		btnNewButton_4.setBounds(763, 457, 169, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\show.jpg"));
		btnNewButton_5.setBounds(0, 421, 277, 268);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel_1.setBounds(0, -35, 1282, 1152);
		frame.getContentPane().add(lblNewLabel_1);
		}
}
