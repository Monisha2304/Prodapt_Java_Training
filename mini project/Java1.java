import java.util.*;
public class Java1{
	public static void main(String [] args){

		//Code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}
	