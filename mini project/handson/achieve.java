package handson;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import elearning.Login;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class achieve extends JFrame {
	private JTable table;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					achieve frame = new achieve();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public achieve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 1133, 598);

        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    setContentPane(contentPane);
        contentPane.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(230, 83, 882, 420);
        contentPane.add(scrollPane);
        table = new JTable();
        scrollPane.setViewportView(table);
        table.setRowHeight(50);
        table.setModel(new DefaultTableModel(
            new Object[][] {
            },

            new String[] {

                "ACHIEVEMENT", "REMARKS"

            }

        ));
        
         
        
                JLabel lblNewLabel = new JLabel("Stepped Stones");
                scrollPane.setColumnHeaderView(lblNewLabel);
                lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 25));

 

        JButton btnNewButton = new JButton("Close");

        btnNewButton.setBounds(447, 315, 89, 23);

        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Home");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		EventQueue.invokeLater(new Runnable() {
        			public void run() {
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
        btnNewButton_1.setBounds(629, 559, 89, 23);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(0, -13, 1973, 1080);
        contentPane.add(lblNewLabel_1);
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (25).png"));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0,0,screenSize.width, screenSize.height);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
        try {
        	
        DefaultTableModel dt= (DefaultTableModel) table.getModel();
        Statement st =Login.c.createStatement();
       
        
        ResultSet rs=st.executeQuery("select * from login where username=\""+Login.User+"\";");
        rs.next();
        System.out.println(rs.getString(1));
        Vector<String> arr=new Vector<String>();
        if(rs.getString(8)!=null && rs.getString(8).equals("Done")) {
        	arr.add("Java Modules");
        }
        if(rs.getString(9)!=null &&rs.getString(9).equals("Done")) {
        	arr.add("C Modules");
        }
        if(rs.getString(10)!=null &&rs.getString(10).equals("Done")) {
        	arr.add("C++ Modules");
        }
        if(rs.getString(11)!=null &&rs.getString(11).equals("Done")) {
        	arr.add("C Sharp Modules");
        }
        if(rs.getString(12)!=null &&rs.getString(12).equals("Done")) {
        	arr.add("Python Modules");
        }
        if(rs.getString(13)!=null &&rs.getString(13).equals("Done")) {
        	arr.add("Swift Modules");
        }
        if(rs.getString(14)!=null && (Integer.parseInt(rs.getString(14)))!=0) {
        	arr.add("Java MCQ Test");
        }
        if(rs.getString(15)!=null &&(Integer.parseInt(rs.getString(15)))!=0) {
        	arr.add("C MCQ Test");
        }
        if(rs.getString(16)!=null &&(Integer.parseInt(rs.getString(16)))!=0) {
        	arr.add("C++ MCQ Test");
        }
        if(rs.getString(17)!=null &&(Integer.parseInt(rs.getString(17)))!=0) {
        	arr.add("C Sharp MCQ Test");
        }
        if(rs.getString(18)!=null &&(Integer.parseInt(rs.getString(18)))!=0) {
        	arr.add("Python MCQ Test");
        }
        if(rs.getString(19)!=null &&(Integer.parseInt(rs.getString(19)))!=0) {
        	arr.add("Swift MCQ Test");
        }
        if(rs.getString(20)!=null &&rs.getString(20).equals("completed")) {
        	arr.add("Java Coding Test");
        }
        if(rs.getString(21)!=null &&rs.getString(21).equals("completed")) {
        	arr.add("Python Coding Test");
        }
        
        
        
//        int m=st.executeUpdate("Update login set mmarks=mc+mjava+mcsharp+mcpp+mswift+mpython;");
//        m=st.executeUpdate("Update login set score3=score1+score2;");
//        m=st.executeUpdate("Update login set overall=score3+mmarks;");
//        ResultSet rs = st.executeQuery("select * from login order by overall desc;");
       
        for(String str:arr) {
        	System.out.println(str);
        	dt.addRow(new Object[] {str,"Completed"});
        }
        
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
	}
}
