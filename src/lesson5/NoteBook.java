package lesson5;

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