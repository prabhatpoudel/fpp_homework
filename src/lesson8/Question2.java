package lesson8;

import java.util.ArrayList;

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
	
	

}

public class Question2 {
	public static void main (String [] args)
	{
		ArrayList<Marketing> list = new ArrayList<Marketing>();
		Marketing m1= new Marketing("Joe","Dell",200.90);
		Marketing m2= new Marketing("Smith","Sony",200.90);
		Marketing m3= new Marketing("Carn","HP",200.90);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(list[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		
		return sb.toString();
	}


}
