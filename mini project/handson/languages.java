package handson;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import elearning.code_learning;
public class languages extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					languages frame = new languages("Coding");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public languages(String activity) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select the language in which you are going to code");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(466, 176, 767, 66);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select","Java", "Python"}));
		comboBox.setBounds(804, 330, 130, 31);
		//comboBox.getDropTarget();
		comboBox.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String s=(String) comboBox.getSelectedItem();
				int score=0;
				if(s.equals("Java")) {
				  if(activity.equals("Coding")) {
					try {

						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									message frame = new message();
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
						
					}
					catch(Exception m) {
						
					}
				  }
				  else if(activity.equals("Practice")) {
					  EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									code_learning frame = new code_learning(s);
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
				  }
				
				}
				else if(s.equals("Python")){
					if(activity.equals("Coding")) {
					try {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									message1 frame = new message1();
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
				}
				catch(Exception m) {
					
				}
					}
					else if(activity.equals("Practice")) {
						  EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										code_learning frame = new code_learning(s);
										frame.setVisible(true);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
					  }
					
			
			
				
			}
			}
		});
		contentPane.add(comboBox);
		
		JButton btn = new JButton("OK");
	    contentPane.add(btn);
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setForeground(new Color(0, 0, 0));
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (19).png"));
	    lblNewLabel_1.setBounds(0, -109, 1342, 1301);
	    contentPane.add(lblNewLabel_1);
	}
}
