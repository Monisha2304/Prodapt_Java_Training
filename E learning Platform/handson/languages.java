package handson;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class languages extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					languages frame = new languages();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public languages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select the language in which you are going to code");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(455, 246, 450, 22);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select","Java", "Python"}));
		comboBox.setBounds(615, 354, 130, 22);
		//comboBox.getDropTarget();
		comboBox.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String s=(String) comboBox.getSelectedItem();
				int score=0;
				if(s.equals("Java")) {
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
				else if(s.equals("Python")){
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
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
	    lblNewLabel_1.setBounds(0, -109, 1342, 1301);
	    contentPane.add(lblNewLabel_1);
	}
}
