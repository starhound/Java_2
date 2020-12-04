package wesley13pt2;

import java.util.Date;

public abstract class Pet {
	private String name;
	private char gender;
	private Date aquired;
	
	Pet(String n, char g, Date a) {
		this.name = n;
		this.gender = g;
		this.aquired = a;
	}
	
	String getName() {
		return this.name;
	}
	
	char getGender() {
		return this.gender;
	}
	
	Date getAcquired() {
		return this.aquired;
	}
	
	public abstract String sound();
}
