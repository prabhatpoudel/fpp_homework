package lesson5;

import java.time.LocalDate;
import java.util.Scanner;

class DeptEmployee {
	private String name;
	private LocalDate hiredate;
	double salary;

	DeptEmployee(String name, LocalDate hiredate, double salary) {
		this.name = name;
		this.hiredate = hiredate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	double computeSalary() {
		return this.salary;
	}

}

class Professor extends DeptEmployee {
	int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	Professor(String name, LocalDate hdate, double salary,
			int numberOfPublications) {
		super(name, hdate, salary);
		this.numberOfPublications = numberOfPublications;
	}
}

class Secretary extends DeptEmployee {
	double overtimeHours;

	// DeptEmployee de = new DeptEmployee();

	Secretary(String name, LocalDate hdate, double salary, double overtime) {
		super(name, hdate, salary);
		this.overtimeHours = overtime;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	double computeSalary() {

		return super.computeSalary() + 12 * overtimeHours;
	}
}

public class Question1 {
	public static void main(String[] args) {
		double sumProfessor = 0.0;
		double sumSecretary = 0.0;
		double totalSalary = 0.0;
		int count = 0;
		String choice = "N";
		DeptEmployee[] departments = new DeptEmployee[5];
		departments[0] = new Professor("Govinda", LocalDate.now(), 100.00, 0);
		departments[1] = new Professor("Madan", LocalDate.now(), 1000.00, 1);
		departments[2] = new Professor("Gunjan", LocalDate.now(), 2000.00, 2);
		departments[3] = new Secretary("Nagendra", LocalDate.now(), 2000.00, 10);
		departments[4] = new Secretary("Samrat", LocalDate.now(), 1500.00, 5);

		for (DeptEmployee de : departments) {
			if (de instanceof Professor) {
				sumProfessor = sumProfessor + de.computeSalary();
				System.out
						.printf("\nName : %s \n HireDate: %s \n Salary %.2f \n Publication: %d",
								de.getName(), de.getHiredate(),
								de.computeSalary(),
								((Professor) de).getNumberOfPublications());
			} else {
				sumSecretary = sumSecretary + de.computeSalary();
				System.out
						.printf("\nName : %s \n HireDate: %s \n Salary %.2f \n Overtime: %.2f",
								de.getName(), de.getHiredate(),
								de.computeSalary(),
								((Secretary) de).getOvertimeHours());

			}

		}
		Scanner input = new Scanner(System.in);
		do {
			if (count == 0) {
				System.out
						.println("\n Do You Want to print the Salary Sum of Professor?? ");
				totalSalary = sumProfessor;

			} else if (count == 1) {
				System.out
						.println("\n Do You Want to print the Salary Sum of Secretary?? ");
				totalSalary = sumSecretary;
			}

			else if (count == 2) {
				System.out
						.printf("\n Do You Want to print the All Sum of Salary?? ");
				totalSalary = sumProfessor + sumSecretary;
			} else {
				System.out.println("********************************");
				break;
			}

			choice = input.nextLine();

			switch (choice) {
			case "Y":
				System.out.printf("\n Total Salary is: %.2f", totalSalary);
			}

			count++;
			// System.out.println(choice);
			// System.out.println(count);

		} while (choice.equals("N"));

		input.close();

	}

}
