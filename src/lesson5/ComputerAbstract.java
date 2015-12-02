package lesson5;

abstract class ComputerAbstract {
	String manufacturer;
	String processor;
	int	ramSize;
	int diskSize;
	double processorSpeed;
	
	ComputerAbstract (String company,String processor,int ramsize,int diskSize,double processorspeed)
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
	
	abstract double costProduct() ;



}
