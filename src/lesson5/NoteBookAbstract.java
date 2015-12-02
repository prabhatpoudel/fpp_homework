package lesson5;

final  class NoteBookAbstract extends ComputerAbstract{
	double height ; 
	double width;
	double weight;
	double product;
	

	public NoteBookAbstract (String company, String processor, int ramsize, int diskSize, double processorspeed, double height, double width, double weight,double cost)
	{
		super(company,processor,ramsize,diskSize,processorspeed);
		this.height=height;
		this.width=width;
		this.weight=weight;
		this.product=cost;
		screensize();
	}
	
	double screensize() 
	{
		// return height multiplied by width
		return height*width;
		
	}
	
	//Abstract Method
	double costProduct()
	{
	  return product;	
	}

}
