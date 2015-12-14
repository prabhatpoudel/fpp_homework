package lesson12;

import java.io.IOException;

public class Question1 {
	public static void main(String [] args)
	{
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		try
		   {
			for(int i=0; i<numer.length;i++)
			{
				System.out.println("Division of "+numer[i]+" by "+denom[i]+" is "+numer[i]/denom[i]);
			}
			
			}
			catch( ArithmeticException e)
			{
			 System.out.println("ArithmeticException occured while dividing.");
			 }
		   catch(IndexOutOfBoundsException e)
		{
			   System.out.println("Array Length of the Denominater is less than the Numerator.");
		}
			
	}

}
