import java.util.*;
public class LiquidContainer implements container{
	Scanner sc=new Scanner(System.in);
	int noOfContainerL;
	int litre;
	
	static int noOfLcontainers=8;
	int ContainerSize=100;
	
	LiquidContainer(ship sh,int size){
		
		System.out.println("Enter the no of products");
		this.noOfContainerL=sc.nextInt();
		System.out.println("Enter the amount of the product in litres....The litres should be less than 300");
		litre=sc.nextInt();
		this.litre=litre;
		if(litre>300) {
			System.out.println("Sorry...!...There is no container to store the item so can't import the item...");
		}
		else {
		int noOfProducts=size*noOfContainerL;
		
		sh.p.ContainerSizeL=sh.p.ContainerSizeL-noOfProducts;
		noOfContainerL=sh.p.ContainerSizeL/5000;
		int y=sh.p.noOfLiquidContainers;
		if(sh.p.ContainerSizeL<0){
			sh.p.ContainerSizeL=sh.p.ContainerSizeL+noOfProducts;
			noOfContainerL=sh.p.ContainerSizeL/5000;
			
			System.out.println("There is no space to import the product");
		}
		else {
			
			noOfContainerL=sh.p.ContainerSizeL/5000;
			sh.p.noOfLiquidContainers=8-noOfContainerL;
			y-=sh.p.noOfLiquidContainers;
			if(y<0) {
				y=(-y);
			}
			sh.priceL+=(y*300);
			
		}
		}
		
		
		
		
	}
	public void getinfo(ship sh) {
		System.out.println("No of liquid containers available in the ship are :"+this.noOfContainerL);
		System.out.println("Number of liquid container filled are :"+(sh.p.noOfLiquidContainers));
		System.out.println("Available liquid container size in ship "+sh.p.ContainerSizeL);
	}
		
		
	
	
}
