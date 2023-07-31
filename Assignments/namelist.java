package demo1;
import java.util.*;
public class namelist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [] arr=new String[1000];
		int index=0;
		while(true) {
			String h=sc.nextLine();
			if(h.length()>0) {
			arr[index++]=h;
			
			}
			else {
				break;
			}
		}
		int index1=index-1;
		for(int i=0;i<index;i++) {
			String e=new String();
			e="";
			int m=0;
			for(int j=0;j<=index1;j++) {
				if(e=="") {
					e=arr[j];
				}
				else if(e.charAt(0)<arr[j].charAt(0)) {
					e=arr[j];
					m=j;
					
				}
			}
			//System.out.println(e);
			if (e.contains(" ")){
			for(int j=0;j<=index1;j++) {
				int t=-1;
				
					t=e.indexOf(" ");
				
				
				if(t!=-1 && j!=m && (arr[j].substring(0,arr[j].indexOf(" "))).equals(e.substring(0,t)) ) {
					String x=e.substring(t+1,e.length());
					String y=arr[j].substring(arr[j].indexOf(" ")+1,arr[j].length());
					if(y.charAt(0)>x.charAt(0)) {
						//System.out.println(y.charAt(0)+" "+x.charAt(0)+" "+(y.charAt(0)>x.charAt(0)));
						e=arr[j];
						m=j;
						break;
					}
				}
				}
			}
			//System.out.println(e);
			//System.out.println(e);
			arr[m]=arr[index1];
			arr[index1]=e;
			index1--;
		}
		//System.out.println();
		//System.out.println();
		for(int i=0;i<index;i++) {
			System.out.println(arr[i]);
		}

	}

}
