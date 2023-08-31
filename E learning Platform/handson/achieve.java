package handson;

import java.awt.EventQueue;
import java.awt.Font;
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
        scrollPane.setBounds(270, 170, 882, 420);
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
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monisha.m\\Downloads\\Untitled design (10).png"));
        lblNewLabel_1.setBounds(30, -126, 1360, 1332);
        contentPane.add(lblNewLabel_1);

        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mini","root","root");
        DefaultTableModel dt= (DefaultTableModel) table.getModel();
        Statement st =connection.createStatement();
        String h="monisha.m";
        
        ResultSet rs=st.executeQuery("select * from login where username=\""+h+"\";");
        rs.next();
        System.out.println(rs.getString(23));
        Vector<String> arr=new Vector<String>();
        if(rs.getString(8)!=null && rs.getString(8).equals("Done")) {
        	arr.add("Java");
        }
        if(rs.getString(9)!=null &&rs.getString(9).equals("Done")) {
        	arr.add("C");
        }
        if(rs.getString(10)!=null &&rs.getString(10).equals("Done")) {
        	arr.add("C++");
        }
        if(rs.getString(11)!=null &&rs.getString(11).equals("Done")) {
        	arr.add("C Sharp");
        }
        if(rs.getString(12)!=null &&rs.getString(12).equals("Done")) {
        	arr.add("Python");
        }
        if(rs.getString(13)!=null &&rs.getString(13).equals("Done")) {
        	arr.add("Swift");
        }
        if(rs.getString(14)!=null &&rs.getString(14).equals("0")) {
        	arr.add("Java MCQ");
        }
        if(rs.getString(15)!=null &&rs.getString(15).equals("0")) {
        	arr.add("C MCQ");
        }
        if(rs.getString(16)!=null &&rs.getString(16).equals("0")) {
        	arr.add("C++ MCQ");
        }
        if(rs.getString(17)!=null &&rs.getString(17).equals("0")) {
        	arr.add("C Sharp MCQ");
        }
        if(rs.getString(18)!=null &&rs.getString(18).equals("0")) {
        	arr.add("Python MCQ");
        }
        if(rs.getString(19)!=null &&rs.getString(19).equals("0")) {
        	arr.add("Swift MCQ");
        }
        if(rs.getString(20)!=null &&rs.getString(20).equals("Completed")) {
        	arr.add("Java Coding Test");
        }
        if(rs.getString(21)!=null &&rs.getString(21).equals("Completed")) {
        	arr.add("Python Coding Test");
        }
        
        
        
//        int m=st.executeUpdate("Update login set mmarks=mc+mjava+mcsharp+mcpp+mswift+mpython;");
//        m=st.executeUpdate("Update login set score3=score1+score2;");
//        m=st.executeUpdate("Update login set overall=score3+mmarks;");
//        ResultSet rs = st.executeQuery("select * from login order by overall desc;");
       
        for(String str:arr) {
        	dt.addRow(new Object[] {str,"Completed"});
        }
        
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
	}
}
