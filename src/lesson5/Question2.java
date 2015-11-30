package lesson5;

class Computer
{
	String manufacturer;
	String processor;
	int	ramSize;
	int diskSize;
	double processorSpeed;
	
	Computer (String company,String processor,int ramsize,int diskSize,double processorspeed)
	{
		this.manufacturer=company;
		this.processor=processor;
		this.ramSize=ramsize;
		this.diskSize=diskSize;
		this.processorSpeed=processorspeed;
		computePower();
	}
	
	double getRamSize()
	{
		return (double) ramSize;
	}
	double getDiskSize()
	{
	    return (double) diskSize;
	}
	double getProcessorSpeed()
	{
		return processorSpeed;
	}
	double computePower() 
	{
		return ramSize*processorSpeed;
		
		// return ramSize multiplied by processorSpeed
	}
}

class NoteBook extends Computer
{
	double height ; 
	double width;
	double weight;
	

	public NoteBook (String company, String processor, int ramsize, int diskSize, double processorspeed, double height, double width, double weight)
	{
		super(company,processor,ramsize,diskSize,processorspeed);
		this.height=height;
		this.width=width;
		this.weight=weight;
		screensize();
	}
	
	double screensize() 
	{
		// return height multiplied by width
		return height*width;
		
	}
}




public class Question2 {
	public static void main (String [] args)
	{
		NoteBook cmp = new NoteBook("DELL","I7",8,256,1300.0,14.0,15.0,2.0);
		System.out.printf(" Manufacture is: %s",cmp.manufacturer);
		System.out.printf("\n Processor : %s",cmp.processor);
		System.out.printf("\n Ram is: %s",cmp.getRamSize());
		System.out.printf("\n Disk Space: %.2f",cmp.getDiskSize());
		System.out.println("\n Computer Power is: "+cmp.computePower()+"\n Screen Size is: "+ cmp.screensize());
		
	}

}
