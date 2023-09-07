package elearning;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

public class choice extends JFrame {

	private JPanel contentPane;
	static String s;
	public choice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select the language which you are going to learn");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblNewLabel.setBounds(172, 165, 943, 38);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select","PYTHON", "C","JAVA","C++","SWIFT","C#"}));
		comboBox.setBounds(628, 310, 130, 38);
		//comboBox.getDropTarget();
		
		comboBox.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Scanner sc=new Scanner(System.in);
				s=(String) comboBox.getSelectedItem();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Path frame = new Path(s);
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
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane.add(comboBox);
		JButton btn = new JButton("OK");
	    contentPane.add(btn);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (19).png"));
	    lblNewLabel_1.setBounds(0, 0, 1342, 1072);
	    contentPane.add(lblNewLabel_1);
	}
}
