package handson;
import java.util.*;
import java.io.*;

class questions {
	
	
	public int choose(String qns,String ans)throws Exception {
		Scanner sc=new Scanner(System.in);
		int v=0;
		int num=0;
		
		try {
		File f=new File(ans); 
		File f1=new File(qns);
		FileWriter fr=new FileWriter(f);
		//BufferedReader br=new BufferedReader(fr);
		FileReader fr1=new FileReader(f1);
		BufferedReader br1=new BufferedReader(fr1);
		String line1;
		
		int u=0;
		while((line1=br1.readLine())!=null) {
		StringBuffer sb=new StringBuffer();
		System.out.println(line1);
			
		
		for(int i=0;i<5;i++) {
			line1=br1.readLine();
			if(i<4) {
			sb.append(line1);
			sb.append("\n");
			
			}
			else {
				
				System.out.println(sb.toString());
				sb=new StringBuffer();
				
				
				System.out.println("Enter the option");
				 //System.out.println( n)
				int x = 20; // wait 2 seconds at most

				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				long startTime = System.currentTimeMillis();
				String n="";
				try {
				while ((System.currentTimeMillis() - startTime) < x * 1000
				        && !in.ready()) {
				}

				if (in.ready()) {
					n=in.readLine();
				    //System.out.println("You entered: " + in.readLine());
				} else {
				    System.out.println("You did not enter data");

			}
				}
				catch(Exception e) {
					
				}
				num++;
				fr.write("\n\n----------------Question "+num+"---------------------\n\n");
				fr.write("The expected answer for the question number "+num+" is "+line1+"\n");
				fr.write("The answer you provided is "+n+"\n");
				
				if( line1.equals(n)) {
					System.out.println("Answer Correct");
					v+=10;
				}
				else if(n.length()!=0){
					System.out.println("Answer Wrong");
				}
				sb=new StringBuffer();
				
				
			}
		}
		}
		fr.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return v;
		
	
	}
	public void report(String ans) {
		File f=new File(ans);
		try {
		FileReader fr1=new FileReader(f);
		BufferedReader br1=new BufferedReader(fr1);
		StringBuffer sb=new StringBuffer();
		String line;
		while((line=br1.readLine())!=null) {
			sb.append(line);
			sb.append("\n");
		}
		System.out.println(sb.toString());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}
