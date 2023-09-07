package handson;

import java.awt.EventQueue;
import java.sql.Statement;
import java.util.*;
public class learntomcq {
	static String s;
	static int score1=0;
	static String paths="";
	public learntomcq(String s) {
		Scanner sc=new Scanner(System.in);
		String qns="";
		String ans="";
		
		if(s.equals("PYTHON")) {
			try {
				paths="mpython";
				qns="Python.txt";
				ans="Pythonsol.txt";
				
				
			}
			catch(Exception m) {
				
			}
		
		}
		else if(s.equals("C")){
			try {
				paths="mc";
				qns="C.txt";
				ans="Csol.txt";
		}
		catch(Exception m) {
			
		}
		}
		else if(s.equals("JAVA")){
			try {
				paths="mjava";
				qns="Java.txt";
				ans="Javasol.txt";
		}
		catch(Exception m) {
			
		}
		}
		else if(s.equals("C++")){
			try {
				paths="mcpp";
				qns="CPP.txt";
				ans="CPPsol.txt";
		}
		catch(Exception m) {
			
		}
		}
		else if(s.equals("SWIFT")){
			try {
				paths="mswift";
				qns="Swift.txt";
				ans="Swiftsol.txt";
		}
		catch(Exception m) {
			
		}
		}
		else if(s.equals("C#")){
			try {
				paths="mcsharp";
				qns="Csharp.txt";
				ans="Csharpsol.txt";
		}
		catch(Exception m) {
			
		}
		}
		questions q=new questions();
		
			try {
				score1=q.choose(qns,"Solution.txt",s,paths);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println("The marks you scored : "+score1);
//		
//		System.out.println("\nAre you want to see your report?\n\n It will help you to improve your understandings of the concepts\n");
//		System.out.println("y/n");
//		char f=sc.next().charAt(0);
//		if(f=='y') {
//			q.report(ans);
//		}
//		if(score1<40) {
//			Statement stmt;
//			
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						mcqtry frame = new mcqtry(score1,s,paths);
//						frame.setVisible(true);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}
//		else {
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						mcqcomp frame = new mcqcomp(score1,s,paths);
//						frame.setVisible(true);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}
//		
		
	}

}
