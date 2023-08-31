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
	public finalpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrCongratulationsCodeMaster = new JTextArea();
		txtrCongratulationsCodeMaster.setOpaque(false);
		txtrCongratulationsCodeMaster.setForeground(new Color(255, 255, 255));
		txtrCongratulationsCodeMaster.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrCongratulationsCodeMaster.setBackground(new Color(0, 0, 0,0));
		txtrCongratulationsCodeMaster.setEditable(false);
		txtrCongratulationsCodeMaster.setText("\t\tCongratulations Code Master...............!!!!!!!!\r\n\r\nYou have successfully completed your Knowledge Testing Path with us...!!!!!\r\nYou are an awesome coder...................!!!!\r\n\r\nCheck the Leaderboard to see your current position....!!!!\r\n\r\n\t\t\tKeep Rocking.............!!!!!!!!!!!!");
		txtrCongratulationsCodeMaster.setBounds(333, 186, 726, 252);
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
		btnNewButton.setBounds(601, 508, 257, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (11).png"));
		lblNewLabel.setBounds(0, 0, 1280, 1063);
		contentPane.add(lblNewLabel);
	}
}
