package handson;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.sql.Statement;
import java.util.*;
public class mcqcall {
	static String qn="";
	static String opt1="";
	static String opt2="";
	static String opt3="";
	static String opt4="";
	static String sol="";
	static mytest frame=null;
	mcqcall(String ans,String qns,String s,String paths) {
		Scanner sc=new Scanner(System.in);
		mytest.score=0;
		mytest.num=0;
		int num=1;
		try {
			File f=new File(ans); 
			File f1=new File(qns);
			FileWriter fr=new FileWriter(f);
			//BufferedReader br=new BufferedReader(fr);
			FileReader fr1=new FileReader(f1);
			BufferedReader br1=new BufferedReader(fr1);
			int u=0;
			while((qn=br1.readLine())!=null) {
			StringBuffer sb=new StringBuffer();
			
			opt1=br1.readLine();
			opt2=br1.readLine();
			opt3=br1.readLine();
			opt4=br1.readLine();
			sol=br1.readLine();
			fr.write("\r\n\r\n\r----------------Question "+num+"---------------------\r\n\r\n");
			fr.write("The expected answer for the question number "+num+" is "+sol+"\r\n");
			if(qn!=null) {
			EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					try {
						frame = new mytest(qn,opt1,opt2,opt3,opt4,sol,fr);
						
						
						frame.setVisible(true);
						
		               
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				
					
				}
				
			});
			int x = 20;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			long startTime = System.currentTimeMillis();
			String n="";
			
			try {
				while ((System.currentTimeMillis() - startTime) < x * 1000
				        && !in.ready()) {
					if(mytest.g==1) {
						Thread.sleep(1000);
						break;
					}
				
				}
				
				}
				catch(Exception e) {
					
				}
			frame.dispose();
			num+=1;
		
			
			
	}

}
			fr.close();
		
	}
catch(Exception e) {
			
		}
		if(mytest.score<40) {
			Statement stmt;
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						mcqtry frame = new mcqtry(mytest.score,s,paths,qns);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		else {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						mcqcomp frame = new mcqcomp(mytest.score,s,paths,qns);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		
		
	}
}
	
