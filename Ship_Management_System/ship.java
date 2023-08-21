import java.util.Scanner;

class ship {
	
	String shipId;
	String source1;
	String source2;
	int flag;
	String username;
	Port p;
	int priceB=0;
	int priceH=0;
	int priceL=0;
	int priceR=0;
	BasicContainer b;
	HeavyContainer h;
	LiquidContainer l;
	RefrigeratedContainer r;
	ship(String Id,String source1,String source2,int flag,String username){
		this.shipId=Id;
		this.source1=source1;
		this.source2=source2;
		this.flag=flag;
		this.username=username;
		this.p=new Port(Id);
		
		
	}
	public void imports(ship sh) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the type of product you are going to deliver through the ship");
		System.out.println("1.Basic Product\n2.Heavy Product\n3.Liquid Product\n4.Refrigerated Product");
		int type=sc.nextInt();
		if(type==1) {
			System.out.println("The space available inside the basic container is "+sh.p.ContainerSizeB+" Enter the total size that can be stored inside the available size");
			System.out.println("Enter the volume of the product");
			int size=sc.nextInt();
			sh.b=new BasicContainer(sh,size);
			sh.b.getinfo(sh);
			//p.noOfBasicContainers=b.noOfContainerB;
			
			
			
		}
		else if(type==2) {
			System.out.println("The space available inside the heavy container is "+sh.p.ContainerSizeH+" Enter the total size that can be stored inside the available size");
			System.out.println("Enter the volume of the product");
			int size=sc.nextInt();
			sh.h=new HeavyContainer(sh,size);
			sh.h.getinfo(sh);
			//p.noOfHeavyContainers=b.noOfContainerH;
			
		}
		else if(type==3) {
			System.out.println("The space available inside the liquid container is "+sh.p.ContainerSizeL+" Enter the total size that can be stored inside the available size");
			System.out.println("Enter the volume of the product");
			int size=sc.nextInt();
			sh.l=new LiquidContainer(sh,size);
			sh.l.getinfo(sh);
			//p.noOfLiquidContainers=b.noOfContainerL;
			
		}
		else if(type==4) {
			System.out.println("The space available inside the refrigerated container is "+sh.p.ContainerSizeR+" Enter the total size that can be stored inside the available size");
			System.out.println("Enter the volume of the product");
			int size=sc.nextInt();
			sh.r=new RefrigeratedContainer(sh,size);
			sh.r.getinfo(sh);
			//p.noOfRefrigeratedContainers=b.noOfContainerR;
		}
		else {
			System.out.println("Sorry..!..You are selected the invalid type of container....Select the valid one");
		}
	}
	public void export(ship sh) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the products has to be export from the ship....");
		System.out.println("1.Basic Product\n2.Heavy Product\n3.Liquid Product\n4.Refrigerated Product");
		int type=sc.nextInt();
		if(type==1) {
			
				
			System.out.println("Enter the number of the product to be exported");
			int amount=sc.nextInt();
			if(amount>sh.p.noOfBasicContainers) {
				System.out.println("The entered number exceeds the available count");
			}
			else {
				sh.p.noOfBasicContainers-=amount;
				sh.p.exportedB+=amount;
				sh.p.ContainerSizeB+=(amount*1000);
			
			}
		
			
			
		}
		else if(type==2) {
			System.out.println("Enter the number of the product to be exported");
			int amount=sc.nextInt();
			if(amount>sh.p.noOfHeavyContainers) {
				System.out.println("The entered number exceeds the available count");
			}
			else {
				sh.p.noOfHeavyContainers-=amount;
				sh.p.ContainerSizeH+=(amount*1000);
				sh.p.exportedH+=amount;
			}
			
			
		}
		else if(type==3) {
			System.out.println("Enter the number of the product to be exported");
			int amount=sc.nextInt();
			if(amount>sh.p.noOfLiquidContainers) {
				System.out.println("The entered number exceeds the available count");
			}
			else {
				sh.p.noOfHeavyContainers-=amount;
				sh.p.ContainerSizeL+=(amount*5000);
				sh.p.exportedL+=amount;
			}
			
		}
		else if(type==4) {
			System.out.println("Enter the number of the product to be exported");
			int amount=sc.nextInt();
			if(amount>sh.p.noOfRefrigeratedContainers) {
				System.out.println("The entered number exceeds the available count");
			}
			else {
				sh.p.noOfRefrigeratedContainers-=amount;
				sh.p.ContainerSizeR+=(amount*2500);
				sh.p.exportedR+=amount;
			}
			
		}
		else {
			System.out.println("Sorry..!..You are selected the invalid type of container....");
		}
		System.out.println("No of Basic containers available: "+sh.p.noOfBasicContainers);
		System.out.println("No of Heavy containers available: "+sh.p.noOfHeavyContainers);
		System.out.println("No of Liquid containers available: "+sh.p.noOfLiquidContainers);
		System.out.println("No of Refrigerated containers available: "+sh.p.noOfRefrigeratedContainers);
		System.out.println("Are you want to export further...y/n");
		char e=sc.next().charAt(0);
		if(e=='n') {
			System.out.println("Hiii User "+sh.username+" Your imported products are delivered at the destination as you want\n");
			System.out.println("The Exported items are......\nThe basic products :"+sh.p.exportedB+"\nThe heavy products :"+sh.p.exportedH+"\nThe liquid products :"+sh.p.exportedL+"\nThe refrigerated products :"+sh.p.exportedR);
			break;
		}
		
		}
		
	}
	
	
}