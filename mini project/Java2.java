import java.util.*;
public class Java2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
			if(arr[i]==2){
				System.out.print(arr[i]+" ");
			}
			else {
				int m=0;
				for(int j=2;j<=(arr[i]/2);j++){
					if(arr[i]%j==0){
						m=1;
						break;
					}
				}
				if(m==0){
					System.out.print(arr[i]+" ");
				}
			}
		}
		System.out.println();
		
	}
}