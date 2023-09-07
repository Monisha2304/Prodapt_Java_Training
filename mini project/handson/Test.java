package handson;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;
public class Test {
	static int v=0;
	static int num=0;
	public void mcq() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selection frame = new selection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			}
		});
	}
	public void code() {
		int score=0;
		Scanner sc=new Scanner(System.in);
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

}
