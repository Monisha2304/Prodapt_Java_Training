package handson;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;

public class mytest extends JFrame {
	static String line1="";
	static int g=0;
	static int num=0;
	static int score=0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					mytest frame = new mytest();
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
	public mytest(String qn,String opt1,String opt2,String opt3,String opt4,String sol,FileWriter fr) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		rdbtnNewRadioButton.setBounds(104, 387, 1036, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(104, 439, 1036, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setOpaque(false);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_2.setBounds(104, 490, 1036, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setOpaque(false);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_3.setBounds(104, 548, 1036, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		ButtonGroup group = new ButtonGroup();
	    group.add(rdbtnNewRadioButton_1);
	    group.add(rdbtnNewRadioButton_2);
	    group.add( rdbtnNewRadioButton);
	    group.add(rdbtnNewRadioButton_3);
	    JLabel lblNewLabel = new JLabel("");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    lblNewLabel.setBounds(20, 267, 1202, 71);
	    contentPane.add(lblNewLabel);
	    JButton btnNewButton = new JButton("Next");
	    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    //System.out.println(qn);
	    
			lblNewLabel.setText(qn);	
			
			
				
				rdbtnNewRadioButton.setText(opt1);
				
				rdbtnNewRadioButton_1.setText(opt2);
				
				rdbtnNewRadioButton_2.setText(opt3);
			
				rdbtnNewRadioButton_3.setText(opt4);
				g=0;
				btnNewButton.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		dispose();
			    		if(rdbtnNewRadioButton.isSelected()) {
			    			try {
								fr.write("The answer you provided is a \r\n");
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
			    	    	if(sol.equals("a")) {
			    	    		g=1;
			    	    		
			    	    		JOptionPane.showMessageDialog(btnNewButton, "Correct");
			    	    		score+=10;
			    	    	}
			    	    	else {
			    	    		g=1;
			    	    		
			    	    		JOptionPane.showMessageDialog(btnNewButton, "InCorrect");
			    	    	}
			    	    }
			    		if(rdbtnNewRadioButton_1.isSelected()) {
			    			g=1;
			    			try {
								fr.write("The answer you provided is b \r\n");
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
			    			if(sol.equals("b")) {
			    	    		
			    	    		JOptionPane.showMessageDialog(btnNewButton, "Correct");
			    	    		score+=10;
			    	    	}
			    	    	else {
			    	    		
			    	    		JOptionPane.showMessageDialog(btnNewButton, "InCorrect");
			    	    	}
			    	    }
			    		if(rdbtnNewRadioButton_2.isSelected()) {
			    			g=1;
			    			try {
								fr.write("The answer you provided is c \r\n");
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
			    			if(sol.equals("c")) {
			    	    		
			    	    		JOptionPane.showMessageDialog(btnNewButton, "Correct");
			    	    		score+=10;
			    	    	}
			    	    	else {
			    	    		
			    	    		JOptionPane.showMessageDialog(btnNewButton, "InCorrect");
			    	    	}
			    	    }
			    		if(rdbtnNewRadioButton_3.isSelected()) {
			    			g=1;
			    			try {
								fr.write("The answer you provided is d \r\n");
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
			    			if(sol.equals("d")) {
			    	    		
			    	    		JOptionPane.showMessageDialog(btnNewButton, "Correct");
			    	    		score+=10;
			    	    	}
			    	    	else {
			    	    		
			    	    		JOptionPane.showMessageDialog(btnNewButton, "InCorrect");
			    	    	}
			    	    }
			    	}
			    });
				
				
			

	    
					
	    
	    if(g==0) {
	    	dispose();
	    }
	    
	    btnNewButton.setBounds(807, 609, 89, 33);
	    contentPane.add(btnNewButton);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (36).png"));
	    lblNewLabel_1.setBounds(0, 0, 1340, 1080);
	    contentPane.add(lblNewLabel_1);
	    
	    
	    
	    
	    
	}
				
}

