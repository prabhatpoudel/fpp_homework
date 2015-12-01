package lesson5;

import java.time.LocalDate;
import java.util.Scanner;

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
