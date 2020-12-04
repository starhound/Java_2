package ch44extra;

import java.time.LocalDate;

public class Hourly extends Person {
	private double payRate;
	private double hours;
	private String job;
	
	public Hourly(String name, LocalDate date, int id, double payRate, double hours, String job) {
		super(name, date, id);
		this.payRate = payRate;
		this.hours = hours;
		this.job = job;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override					// implements abstract method pay inherited from Person
	public void pay() {
		double pay = payRate * hours;
		System.out.printf("%.2f hours @ $%.2f = $%.2f weekly\n",hours,payRate,pay);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "payRate=" + String.format("$%.2f",payRate) + ", hours=" + hours + ", job=" + job;
	}
}
