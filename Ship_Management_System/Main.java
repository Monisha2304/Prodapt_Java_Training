import java.util.*;
public class Main{
	public static void main(String[] args) {
		ArrayList<ship> ships=new ArrayList<ship>();
		ship s1=new ship("A","India","SriLanka",0,"");
		ship s2=new ship("B","India","America",0,"");
		ship s3=new ship("C","America","SriLanka",0,"");
		ship s4=new ship("D","SriLanka","Russia",0,"");
		ships.add(s1);
		ships.add(s2);
		ships.add(s3);
		ships.add(s4);
		Scanner sc=new Scanner(System.in);
		System.out.println("************************Welcome to the Shipping Management System**********************");
		System.out.println("The sevice provided by us is collecting the products to be shipped to the several areas");
		while(true) {
		System.out.println("Are you an Admin or User?");
		String user=sc.next();
		if(user.equals("User")) {
		System.out.println("We have 4 routes to deliver your items which will go to various destinations\n");
		System.out.println("You can select the routes from the below list......\nOne ship will travel between India and SriLanka");
		System.out.println("One ship will travel between India and America\nOne ship will travel between America and SriLanka");
		System.out.println("One ship will travel between SriLanka and Russia");
		while(true) {
			System.out.println("You can import the products which you want to shipped from your selected source to your required destination");
			
			
				String name;
				System.out.println("Enter your name");
				name=sc.next();
		
				System.out.println("Enter the source place");
				String source=sc.next();
				System.out.println("Enter the destination place");
				String destination=sc.next();
				ship sh;
				int q=0;
				for(int i=0;i<ships.size();i++) {
					
					if(ships.get(i).source1.equals(source)&&ships.get(i).source2.equals(destination)) {
						q=1;
						if(ships.get(i).flag==0) {
							while(true) {
								ship g=ships.get(i);
							g.username=name;
							g.imports(ships.get(i));
							System.out.println("Are you want to import further on the same ship?\nIf yes enter y or enter n");
							char e=sc.next().charAt(0);
							if(e=='n') {
								System.out.println("The ship started it's journey");
								System.out.println("*******************Generating your bills "+g.username+"****************************");
								System.out.println("\n------------------Basic Products--------------\nQuantity: "+g.priceB/100+"\nPrice for 1 product: 100\nTotal Price: "+g.priceB);
								System.out.println("\n------------------Heavy Products--------------\nQuantity: "+g.priceH/200+"\nPrice for 1 product: 200\nTotal Price: "+g.priceH);
								System.out.println("\n------------------Liquid Products--------------\nQuantity: "+g.priceL/300+"\nPrice for 1 product: 300\nTotal Price: "+g.priceL);
								System.out.println("\n------------------Refrigerated Products--------------\nQuantity: "+g.priceR/400+"\nPrice for 1 product: 400\nTotal Price: "+g.priceR);
								System.out.println("\n\nThe total amount to be paid is "+(g.priceB+g.priceH+g.priceL+g.priceR));
								g.priceB=0;
								g.priceH=0;
								g.priceL=0;
								g.priceR=0;
								int u=ships.get(i).flag;
								u+=1;
								u%=2;
								g.flag=u;
								break;
							}
							}
							
							
							
							break;
						}
						else {
							System.out.println("The ship is not at the required port");
						}
					}
					else if(ships.get(i).source2.equals(source)&&ships.get(i).source1.equals(destination)) {
						q=1;
						if(ships.get(i).flag==1) {
							while(true) {
								ship g=ships.get(i);
								g.username=name;
								g.imports(ships.get(i));
								System.out.println("Are you want to import further on the same ship?\nIf yes enter y or enter n");
								char e=sc.next().charAt(0);
								if(e=='n') {
									System.out.println("*******************Generating your bills "+g.username+"****************************");
									System.out.println("\n------------------Basic Products--------------\nQuantity: "+g.priceB/100+"\nPrice for 1 product: 100\nTotal Price: "+g.priceB);
									System.out.println("\n------------------Heavy Products--------------\nQuantity: "+g.priceH/200+"\nPrice for 1 product: 200\nTotal Price: "+g.priceH);
									System.out.println("\n------------------Liquid Products--------------\nQuantity: "+g.priceL/300+"\nPrice for 1 product: 300\nTotal Price: "+g.priceL);
									System.out.println("\n------------------Refrigerated Products--------------\nQuantity: "+g.priceR/400+"\nPrice for 1 product: 400\nTotal Price: "+g.priceR);
									System.out.println("\n\nThe total amount to be paid is "+(g.priceB+g.priceH+g.priceL+g.priceR));
									int u=ships.get(i).flag;
									u+=1;
									u%=2;
									g.flag=u;
									break;
								}
								}
							
							break;
						}
						else {
							ship sf=ships.get(i);
							if(sf.flag==0) {
								System.out.println("The ship is not at the required port......It was at the "+sf.source1+" port so wait for the ship to come to the required port");
							}
							else {
							System.out.println("The ship is not at the required port......It was at the "+sf.source2+" port so wait for the ship to come to the required port");
						}
						}
					}
					
					
				
				
				
				
			}
				if(q==0) {
					
					System.out.println("You entered a wrong ship");
				
			}
				System.out.println("Are you want to import in another ship?y/n");
				char e=sc.next().charAt(0);
				if(e=='n') {
					break;
				}
		}
		}
				
				
			
			else if(user.equals("Admin")) {
				System.out.println("We have 4 ships to deliver the items which will go to various destinations\n");
				System.out.println("You can select the ships from the below list......\n Ship A will travel between India and SriLanka");
				System.out.println("Ship B will travel between India and America\nShip C will travel between America and SriLanka");
				System.out.println("Ship D will travel between SriLanka and Russia");
				while (true) {
				System.out.println("Enter the ship from which you want to export");
				String Id=sc.next();
				System.out.println("Enter the destination place");
				String destination=sc.next();
				int q=0;
				
				for(int i=0;i<ships.size();i++) {
					//System.out.println(ships.get(i).source1+" "+ships.get(i).source2+" "+source+" "+destination);
					if(ships.get(i).shipId.equals(Id)) {
						q=1;
					if(ships.get(i).source1.equals(destination)&& ships.get(i).flag==0) {
						    while(true) {
							ships.get(i).export(ships.get(i));
							System.out.println("Are you want to export further from the same ship?\nIf yes enter y or enter n");
							char e=sc.next().charAt(0);
							if(e=='n') {
								break;
							}

							
						    }
							break;
						}
					
					
					
					else if(ships.get(i).source2.equals(destination)&&ships.get(i).flag==1) {
						//System.out.println(ships.get(i).source1+" "+ships.get(i).source2+" "+source+" "+destination);
						while(true) {
							
							ships.get(i).export(ships.get(i));
							System.out.println("Are you want to export further from the same ship?\nIf yes enter y or enter n");
							char e=sc.next().charAt(0);
							if(e=='n') {
								break;
							}
						}
							break;
						
					}
					else {
						ship sf=ships.get(i);
						if(sf.flag==0) {
							System.out.println("The ship is not at the required port......It was at the "+sf.source1+" port so wait for the ship to come to the required port");
						}
						else {
						System.out.println("The ship is not at the required port......It was at the "+sf.source2+" port so wait for the ship to come to the required port");
					}
					}	
					}
				}
					
					
				
					
					
				
				if(q==0) {
					
						System.out.println("You entered a wrong ship");
					
				}
				
				System.out.println("Are you want to export from another ship?y/n");
				char e=sc.next().charAt(0);
				if(e=='n') {
					break;
				}
			}
				
			}
			else {
				System.out.println("Enter a valid input");
			}
			System.out.println("Are you want to quit?...y/n");
			char e=sc.next().charAt(0);
			if(e=='y') {
				break;
			}
		}
		}
}

			
		
		
		
	
	

