package lesson5;

import java.time.LocalDate;

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

