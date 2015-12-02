package lesson5;

public class Manager implements Employee {
	int noh;
	int noy;
	int eh;
	double salary;
//	@Override
//	public void getEmpolyeeDetails(String Employeename, String Employeeid, int SSN, String  DOB, String Address) {
//		// TODO Auto-generated method stub
//
//	}
	
	 Manager(int numberOfHour, int numberOfYear, int extraHour)
	{
		this.noh=numberOfHour;
		this.noy=numberOfYear;
		this.eh=extraHour;
		calculateSalary();
	}
	
	public double calculateSalary() 
	{
		salary=baseSalary*(2*noh);
		if(noh>150)
		{
			salary+=extrahour*(noh-150);
		}
		
		return salary;
	}
}
