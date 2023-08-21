abstract class info{
	info(String Id){
		System.out.println("Ship "+Id+" available");
	}
}
public class Port extends info{
	
	int noOfBasicContainers=0;
	int noOfHeavyContainers=0;
	int noOfLiquidContainers=0;
	int noOfRefrigeratedContainers=0;
	int ContainerSizeB=1000*17;
	int ContainerSizeH=10000*10;
	int ContainerSizeL=5000*8;
	int ContainerSizeR=2500*5;
	int exportedB=0;
	int exportedH=0;
	int exportedL=0;
	int exportedR=0;
	int noOfAvailableContainers=noOfBasicContainers+noOfHeavyContainers+noOfLiquidContainers+noOfRefrigeratedContainers;
	Port(String Id){
		super(Id);
	}
	public void data() {
		System.out.println("No of Basic containers available: "+this.noOfBasicContainers);
		System.out.println("No of Heavy containers available: "+this.noOfHeavyContainers);
		System.out.println("No of Refrigerated containers available: "+this.noOfLiquidContainers);
		System.out.println("No of Refrigerated containers available: "+this.noOfRefrigeratedContainers);
	}
}
