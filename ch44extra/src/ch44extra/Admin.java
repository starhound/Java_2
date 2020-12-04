package ch44extra;

import java.time.LocalDate;

public class Admin extends Person {
	private String dept;
	private String office;
	private double salary;
	//private double budget;			removed to simplify class
	
	public Admin(String name, LocalDate date, int id, String dept, String office, double salary) {
		super(name, date, id);
		this.dept = dept;
		this.office = office;
		this.salary = salary;
	}
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void pay() {
		double pay = salary / 12;
		System.out.printf("Annual Salary pays $%,.2f monthly\n",pay);	
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAdmin dept=" + dept + ", office=" + office + ", salary=" + String.format("$%,.0f",salary);
		return s;	
	}
}
