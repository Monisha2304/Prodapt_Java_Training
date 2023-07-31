package demo1;

import java.util.Scanner;

public class game {
	public static int max(int [] arr1) {
		int s=-2147483647;
		for(int i:arr1) {
			if(i>s) {
				s=i;
			}
		}
		return s;
	}

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
		int n=2147483647;;
		
			int j=0;
			int z=0;
			while(j<index) {
				int t=arr[j];
				int arr1[]=new int[t];
				int index1=0;
				for(int k=0;k<t;k++) {
					arr1[index1++]=arr[j+k];
				}
				int u=max(arr1);
				
				z+=1;
				j+=u;
				
				
			}
			
			
			if(z<n) {
				n=z;
			}
			
		if(z!=2147483647) {
		System.out.println(n);
		}
		else {
			System.out.println(-1);
		}

	}

}
