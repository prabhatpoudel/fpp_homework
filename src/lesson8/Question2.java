package lesson8;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Marketing {
	String employeename;
	String productname;
	double salesamount;
	
	Marketing (String ename, String pname, double samount)
	{
	 this.employeename=ename;
	 this.productname=pname;
	 this.salesamount=samount;
	}
	
	public String toString()
	{
		
		return "Employee Name is "+employeename + " \t ProductName is: "+productname + "\t Sales Amount is: "+salesamount;
	}
	
	public static final Comparator ENAME = new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			
			String ename1 = ((Marketing)o1).employeename;
			String ename2 = ((Marketing)o2).employeename;
			return ename1.compareTo(ename2);
		}
	};
	
	public static final Comparator PNAME = new Comparator(){
		@Override
		public int compare(Object o1, Object o2) {
			String pname1 = ((Marketing)o1).productname;
			String pname2 = ((Marketing)o2).productname;
			return pname1.compareTo(pname2);
		}
	};
	

}

public class Question2 {
	public static void main (String [] args)
	{
		ArrayList<Marketing> list = new ArrayList<Marketing>();
		Marketing m1= new Marketing("Joe","Dell",200.91);
		Marketing m2= new Marketing("Smith","Sony",200.92);
		Marketing m3= new Marketing("Carn","HP",200.93);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		list.set(2, new Marketing("Govinda", "ASUS", 750));
		
		list.remove(2);
		System.out.println("********List values after sorting by employeename*********");
		Collections.sort(list, Marketing.ENAME);
		for(int i=0; i<list.size(); i++)
		{
			Marketing m = list.get(i);
			System.out.println(m);
		}
		System.out.println("**********List values after sorting by productname*******");		
		Collections.sort(list, Marketing.PNAME);
		
		for(int i=0; i<list.size(); i++)
		{
			Marketing m = list.get(i);
			System.out.println(m);
		}
		
		System.out.println("The size of the list is: "+list.size());
	}


}
