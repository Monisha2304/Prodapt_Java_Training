package handson;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import elearning.Login;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class certrificate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					certrificate frame = new certrificate();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public certrificate(String achievement) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1248, 737);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(Login.Name);
		lblNewLabel.setForeground(new Color(255, 255, 128));
		lblNewLabel.setFont(new Font("Monospaced", Font.ITALIC, 35));
		lblNewLabel.setBounds(324, 280, 491, 162);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					
					public void run() {
						dispose();
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
		btnNewButton.setBounds(1035, 269, 151, 33);
		contentPane.add(btnNewButton);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		JTextArea txtrGearUpProudly = new JTextArea();
		txtrGearUpProudly.setForeground(new Color(255, 255, 255));
		txtrGearUpProudly.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		txtrGearUpProudly.setText("GEAR UP proudly presents this award to this Code Master who \r\nSuccessfully completed the "+achievement+" \r\n\r\n");
		
		txtrGearUpProudly.setOpaque(false);
		txtrGearUpProudly.setEditable(false);
		txtrGearUpProudly.setBounds(177, 409, 603, 63);
		contentPane.add(txtrGearUpProudly);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (34).png"));
		lblNewLabel_1.setBounds(61, 11, 1215, 1186);
		contentPane.add(lblNewLabel_1);
	}
}
