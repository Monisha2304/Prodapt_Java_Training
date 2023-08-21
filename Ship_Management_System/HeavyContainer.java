import java.util.*;
public class HeavyContainer implements container{
	Scanner sc=new Scanner(System.in);
	int noOfContainerH=0;
	int weight;
	static int noOfHcontainers=10;
	
	HeavyContainer(ship sh,int size){
		
		System.out.println("Enter the no of products");
		noOfContainerH=sc.nextInt();
		this.noOfContainerH=noOfContainerH;
		System.out.println("Enter the weight of the product...The weight must be less than 500");
		weight=sc.nextInt();
		this.weight=weight;
		if(weight>500) {
			System.out.println("Sorry..!..Item was heavy weight so...Can't import this item...");
		}
		else {
		
	
	
	int noOfProducts=size*noOfContainerH;
	
	sh.p.ContainerSizeH=(sh.p.ContainerSizeH)-noOfProducts;
	noOfContainerH=sh.p.ContainerSizeH/10000;
	int y=sh.p.noOfHeavyContainers;
	if(sh.p.ContainerSizeH<0){
		sh.p.ContainerSizeH=sh.p.ContainerSizeH+noOfProducts;
		noOfContainerH=sh.p.ContainerSizeH/10000;
		
		System.out.println("There is no space to import the product");
	}
	else  {
		noOfContainerH=sh.p.ContainerSizeH/10000;
		sh.p.noOfHeavyContainers=10-noOfContainerH;
		y-=sh.p.noOfHeavyContainers;
		if(y<0) {
			y=(-y);
		}
		
		sh.priceH+=(y*200);
	}
	}
	}
	public void getinfo(ship sh) {
		System.out.println("No of heavy containers available in the ship are :"+this.noOfContainerH);
		System.out.println("Number of heavy container filled are :"+(sh.p.noOfHeavyContainers));
		System.out.println("Available heavy container size in ship "+sh.p.ContainerSizeH);
		
	}
	
	
	
}
