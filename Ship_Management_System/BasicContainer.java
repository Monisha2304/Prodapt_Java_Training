import java.util.Scanner;
public class BasicContainer implements container{
	Scanner sc=new Scanner(System.in);
	int noOfContainerB=0;
	static int noOfBcontainers=17;
	BasicContainer(ship sh,int size){
		
		System.out.println("Enter the no of products");
		this.noOfContainerB=sc.nextInt();
		int noOfProducts=size*noOfContainerB;
		sh.p.ContainerSizeB=(sh.p.ContainerSizeB)-noOfProducts; 
		noOfContainerB=sh.p.ContainerSizeB/1000;
		int y=sh.p.noOfBasicContainers;
		if(sh.p.ContainerSizeB<0){
			sh.p.ContainerSizeB=(sh.p.ContainerSizeB)+noOfProducts;
			noOfContainerB=sh.p.ContainerSizeB/1000;
			
			System.out.println("There is no space to import the product");
		}
		else {
			noOfContainerB=sh.p.ContainerSizeB/1000;
			
			sh.p.noOfBasicContainers=17-noOfContainerB;
			y-=sh.p.noOfBasicContainers;
			if(y<0) {
				y=(-y);
			}
			y*=100;
			sh.priceB+=y;
		}
		
		
	}
	public void getinfo(ship sh){
		System.out.println("No of basic containers available in the ship are "+this.noOfContainerB);
		System.out.println("Number of basic container filled in the ship are "+(sh.p.noOfBasicContainers));
		System.out.println("Available basic container size in ship "+sh.p.ContainerSizeB);
		
	}
	
	
}
