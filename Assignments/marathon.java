package demo1;
import java.util.*;
public class marathon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a starting distance (between 5km to 8km:");
		int a;
		while(true) {
			a=sc.nextInt();
			if(a<5||a>8) {
				System.out.println("Sorry, Choose between 5km to 8km");
				
			}
			else {
				break;
			}
		}
		int m=a;
		while(a>=0) {
			if(a==m) {
				System.out.println("Distance to run :"+a);
			}
			else if(a==m-1) {
				System.out.println("Distance to run :"+a);
				System.out.println("Good start, keep it up!");
			}
			else if(a==1) {
				System.out.println("Almost there!");
				System.out.println("Distance to run :"+a);
			}
			else if(a==0) {
				System.out.println("Almost there!");
				System.out.println("Done for the day!");
			}
			else {
				System.out.println("Distance to run :"+a);
			}
			a--;
			
		}

	}

}
