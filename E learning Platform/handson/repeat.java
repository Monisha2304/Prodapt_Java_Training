package handson;

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
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class repeat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public repeat(String sel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrYouDidntPassed = new JTextArea();
		txtrYouDidntPassed.setOpaque(false);
		txtrYouDidntPassed.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrYouDidntPassed.setBackground(new Color(255, 255, 255));
		txtrYouDidntPassed.setText("\t\t\tYou didn't passed the level.......\r\n\r\n            Are you ready to take the test again........!!!!!");
		txtrYouDidntPassed.setEditable(false);
		txtrYouDidntPassed.setBounds(219, 228, 646, 122);
		contentPane.add(txtrYouDidntPassed);
		
		JButton btnNewButton = new JButton("Try Again");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if(sel.equals("pe")) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								pythoneasy frame = new pythoneasy();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else if(sel.equals("pm")) {
					EventQueue.invokeLater(new Runnable() {
            			public void run() {
            				try {
            					easycomp1 frame = new easycomp1();
            					frame.setVisible(true);
            				} catch (Exception e) {
            					e.printStackTrace();
            				}
            			}
            		});
				}
				else if(sel.equals("ph")) {
					EventQueue.invokeLater(new Runnable() {
            			public void run() {
            				try {
            					mediumcomp1 frame = new mediumcomp1();
            					frame.setVisible(true);
            				} catch (Exception e) {
            					e.printStackTrace();
            				}
            			}
            		});
				}
				else if(sel.equals("je")) {
					EventQueue.invokeLater(new Runnable() {
    					public void run() {
    						try {
    							javaeasy frame = new javaeasy();
    							frame.setVisible(true);
    						} catch (Exception e) {
    							e.printStackTrace();
    						}
    					}
    				});
				}
				else if(sel.equals("jm")) {
					EventQueue.invokeLater(new Runnable() {
            			public void run() {
            				try {
            					easycomp frame = new easycomp();
            					frame.setVisible(true);
            				} catch (Exception e) {
            					e.printStackTrace();
            				}
            			}
            		});
				}
				else if(sel.equals("jh")) {
					EventQueue.invokeLater(new Runnable() {
            			public void run() {
            				try {
            					mediumcomp frame = new mediumcomp();
            					frame.setVisible(true);
            				} catch (Exception e) {
            					e.printStackTrace();
            				}
            			}
            		});

				}
			}
		});
		btnNewButton.setBounds(175, 527, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(791, 527, 89, 23);
		contentPane.add(btnNewButton_1);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (10).png"));
		lblNewLabel.setBounds(0, -27, 1279, 1107);
		contentPane.add(lblNewLabel);
	}
}
