package lesson5;

import java.time.LocalDate;

public class DeptEmployee {
	protected String name;
	protected LocalDate hiredate;
	final double salary;

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