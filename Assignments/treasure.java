package demo1;

import java.util.Scanner;

public class treasure {
	static int v=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		int index=0;
		int sum=0;
		while(true) {
			String h=sc.nextLine();
			if(h.length()>0) {
			arr[index++]=Integer.parseInt(h);
			sum+=arr[index-1];
			}
			else {
				break;
			}
		}
		for(int i=1;i<index-1;i++) {
		int empty_array[]=new int[i];
		int t[]=combinations(arr,0,arr.length-1,0,i,empty_array,sum);
		int f=0;
		for(int x:t) {
			f+=x;
		}
		int u=sum-f;
		if(u==f) {
			v=1;
			
		}
		}
		if(v==0) {
			System.out.println("False");
		}
		else {
			System.out.println("True");
		}
		

	}
	public static int[] combinations(int[] arr,int start,int end,int array_index,int num,int empty_array[],int sum){
		int n[]=new int[0];
		
		if(array_index==num) {
			return empty_array;
		}
		
		for(int i=start;end-i+1>=num-array_index;i++) {
			empty_array[array_index]=arr[i];
			int r[]=combinations(arr,i+1,end,array_index+1,num,empty_array,sum);
			int f=0;
			for(int x:r) {
				f+=x;
			}
			
			int u=sum-f;
			if(u==f) {
				v=1;
				
			}
		}
		return n;
		
		
	}

}
