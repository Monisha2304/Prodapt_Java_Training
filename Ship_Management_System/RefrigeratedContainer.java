import java.util.*;
public class RefrigeratedContainer implements container{
	int noOfContainerR;
	int weight;
	int temperature;
	//static int ContainerSizeR=30*5;
	Scanner sc=new Scanner(System.in);
	static int noOfRcontainers=5;
	
	RefrigeratedContainer(ship sh,int size){
		
		System.out.println("Enter the no of products");
		this.noOfContainerR=sc.nextInt();
		System.out.println("Enter the weight of the product.....The weight must be less than 300");
		weight=sc.nextInt();
		this.weight=weight;
		System.out.println("Enter the temperature of the product in degree celcius...The temperature should be greater than or equal to 12");
		temperature=sc.nextInt();
		this.temperature=temperature;
		if(weight>300) {
			System.out.println("Sorry!....The weight was too heavy....so we can't import this item");
		}
		else if(temperature<12) {
			System.out.println("Sorry!...We can't store the item below 12 degree celcius...So we can't export this item");
		}
		else {
		int noOfProducts=size*noOfContainerR;
		sh.p.ContainerSizeR=sh.p.ContainerSizeR-noOfProducts;
		noOfContainerR=sh.p.ContainerSizeR/2500;
		int y=sh.p.noOfRefrigeratedContainers;
		if(sh.p.ContainerSizeR<0){
			sh.p.ContainerSizeR=sh.p.ContainerSizeR+noOfProducts;
			noOfContainerR=sh.p.ContainerSizeR/2500;
			
			System.out.println("There is no space to import the product");
		}
		else {
			noOfContainerR=sh.p.ContainerSizeR/2500;
			sh.p.noOfRefrigeratedContainers=5-noOfContainerR;
			y-=sh.p.noOfRefrigeratedContainers;
			if(y<0) {
				y=(-y);
			}
			sh.priceR+=(y*400);
			
		}
		}
		
		}
		public void getinfo(ship sh) {
			
			System.out.println("No of refrigerated containers available in the ship are :"+this.noOfContainerR);
			System.out.println("Number of refrigerated container filled are :"+(sh.p.noOfRefrigeratedContainers));
			System.out.println("Available refrigerated container size in ship "+sh.p.ContainerSizeR);
		}
		

	
}
