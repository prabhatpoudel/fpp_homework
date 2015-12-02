package lesson5;

public class Question3 {
	public static void main (String [] args)
	{
		ComputerAbstract [] comp = { 
				                    new NoteBookAbstract("Dell","2.7",8,256,130,14.1,12.1,2.3,400),
				                    new Desktop("Apple","3",12,800,14,1000)
				                   };
		for(ComputerAbstract ca : comp)
		{
			System.out.printf(" Manufacture is: %s",ca.manufacturer);
			System.out.printf("\n Processor : %s",ca.processor);
			System.out.printf("\n Ram is: %s",ca.getRamSize());
			System.out.printf("\n Disk Space: %.2f",ca.getDiskSize());
			System.out.println("\n Computer Power is: "+ca.computePower());
			System.out.println("\n Cost is: "+ca.costProduct());
			if(ca instanceof NoteBookAbstract)
			{
				System.out.println("Screen Size is: "+((NoteBookAbstract) ca).screensize());
			}
			
		}
	}

}
