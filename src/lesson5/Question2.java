package lesson5;

public class Question2 {
	public static void main (String [] args)
	{
		Computer cmp = new NoteBook("DELL","I7",8,256,2.7,14.0,15.0,2.0);
		System.out.printf(" Manufacture is: %s",cmp.manufacturer);
		System.out.printf("\n Processor : %s",cmp.processor);
		System.out.printf("\n Ram is: %s",cmp.getRamSize());
		System.out.printf("\n Disk Space: %.2f",cmp.getDiskSize());
		System.out.println("\n Computer Power is: "+cmp.computePower()+"\n Screen Size is: "+ ((NoteBook) cmp).screensize());
		
	}

}
