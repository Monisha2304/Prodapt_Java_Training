package demo1;
import java.util.*;
public class profitloss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		int index=0;
		while(true) {
			String h=sc.nextLine();
			if(h.length()>0) {
			arr[index++]=Integer.parseInt(h);
			}
			else {
				break;
			}
		}
		int s=-2147483647;
		for(int i=0;i<index;i++) {
			for(int j=i+1;j<index;j++) {
				int m=0;
				for(int k=i;k<=j;k++) {
					m+=arr[k];
					
				}
				if(m>s) {
					s=m;
				}
			}
		}
		System.out.println(s);

	}

}
