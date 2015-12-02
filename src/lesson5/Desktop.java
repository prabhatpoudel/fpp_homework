package lesson5;

final class Desktop extends ComputerAbstract{
	double costProduct;
	
	Desktop(String company,String processor,int ramsize,int diskSize,double processorspeed,double cost)
	{
		super(company,processor,ramsize,diskSize,processorspeed);
		this.costProduct=cost;
	}
	double costProduct()
	{
		return costProduct;
	}

}
