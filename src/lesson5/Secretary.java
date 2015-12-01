package lesson5;

import java.time.LocalDate;

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