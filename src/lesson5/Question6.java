package lesson5;

class Computer_6
{
	String manufacturer;
	String processor;
	int	ramSize;
	int diskSize;
	double processorSpeed;
	
	Computer_6 (String company,String processor,int ramsize,int diskSize,double processorspeed)
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
	
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(obj==null)
		{
			return false;
		}
		Computer_6 c= (Computer_6) obj;
		if(c.manufacturer.equals(manufacturer) && c.processor.equals(processor) && c.ramSize==ramSize && c.diskSize==diskSize && c.processorSpeed==processorSpeed)
		{
			return true;
		}
		
		if (this.getClass() != obj.getClass())
			
			{
			return false;
			}
		
		return false;
	}
	
	public int hashcode()
	{
		final int prime=31;
		int result=1;
		
		result= result*prime+ manufacturer.hashCode()+processor.hashCode()+ramSize+diskSize+Double.hashCode(processorSpeed);
		return result;
	}
}

class NoteBook_6 extends Computer_6
{
	double height ; 
	double width;
	double weight;
	

	public NoteBook_6 (String company, String processor, int ramsize, int diskSize, double processorspeed, double height, double width, double weight)
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
	
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(obj==null)
		{
			return false;
		}
		
		if(!super.equals(obj) || getClass()!=obj.getClass())
		{
			return false;
		}
		NoteBook_6 c= (NoteBook_6) obj;
		if(c.height==height&& c.weight==weight && c.width==width)
		{
			return true;
		}
		
		if (this.getClass() != obj.getClass())
			
			{
			return false;
			}
		
		return false;
	}
	
	public int hashcode()
	{
		final int prime=31;
		int result=super.hashCode();
		
		result= result*prime+Double.hashCode(height) + Double.hashCode(width) + Double.hashCode(weight);
		return result;
	}
}

public class Question6 {
	
	public static void main(String [] args){
		Computer_6 c1= new Computer_6("DELL","I7",8,256,2.7);
		Computer_6 c2= new Computer_6("Sony","I7",8,256,2.7);
		Computer_6 c3= c2;
		
		System.out.println(c1.equals(c2));//false
		System.out.println(c2.equals(c3));//true
	
		NoteBook n1= new NoteBook("DELL","I7",8,256,2.7,14.0,15.0,2.0);
		NoteBook n2= new NoteBook("Sony","I7",8,256,2.7,14.0,15.0,2.0);
		NoteBook n3= n2;
		
		System.out.println(n1.equals(n2));//false
		System.out.println(n2.equals(n3));//true
		

	
	}
	

}