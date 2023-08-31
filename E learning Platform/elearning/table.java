package elearning;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

import java.awt.EventQueue;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

 

 

 

//import com.mysql.cj.xdevapi.Statement;

 

 

 

import javax.swing.JScrollPane;

import javax.swing.JButton;

import javax.swing.JLabel;
import java.awt.Font;
public class table extends JFrame {
private JPanel contentPane;
private JTable table;
public static void main(String[] args) {
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
   public table() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 1133, 598);

        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    setContentPane(contentPane);
        contentPane.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(171, 159, 882, 420);
        contentPane.add(scrollPane);
        table = new JTable();
        scrollPane.setViewportView(table);
        table.setRowHeight(50);
        table.setModel(new DefaultTableModel(
            new Object[][] {
            },

            new String[] {

                "NAME", "MCQ" , "CODE","OVER ALL"

            }

        ));

 

        JButton btnNewButton = new JButton("Close");

        btnNewButton.setBounds(447, 315, 89, 23);

        contentPane.add(btnNewButton);

 

        JLabel lblNewLabel = new JLabel("Rockers List");
        lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 25));

        lblNewLabel.setBounds(457, 37, 464, 66);

        contentPane.add(lblNewLabel);

        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mini","root","root");
        DefaultTableModel dt= (DefaultTableModel) table.getModel();
        Statement st =connection.createStatement();
        int m=st.executeUpdate("Update login set mmarks=mc+mjava+mcsharp+mcpp+mswift+mpython;");
        m=st.executeUpdate("Update login set score3=score1+score2;");
        m=st.executeUpdate("Update login set overall=score3+mmarks;");
        ResultSet rs = st.executeQuery("select * from login order by overall desc;");
       
        while(rs.next()){
        	dt.addRow(new Object[] { rs.getString(4),rs.getString(23),rs.getString(7),rs.getString(24)});
        }
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
