import java.util.*;
public class Java3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a=sc.nextInt();
		int arr[][]=new int[a][a];
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++){
			sum+=arr[0][i];
			sum+=arr[a-1][i];
			
		}
		for(int i=1;i<a-1;i++){
			sum+=arr[i][0];
			sum+=arr[i][a-1];
		}
		System.out.println(sum);
	}
}
		