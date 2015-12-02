package lesson5;

public class Secretary_1 implements Employee {
	int noh;
	int noy;
	double salary;

	// public void getEmpolyeeDetails(String Employeename, String Employeeid,
	// int SSN, String DOB, String Address, int age) {
	//
	// // TODO Auto-generated method stub
	//
	// }
	//
	Secretary_1(int numberOfHour, int numberOfYear) {
		this.noh = numberOfHour;
		this.noy = numberOfYear;
		calculateSalary();
	}

	public double calculateSalary() {
		salary = baseSalary;
		if (noh > 150) {
			salary += (bonus * (noh - 150));

		}

		if (noy > 5) {
			salary += (0.1 * baseSalary);

		}

		return salary;
	}

}
