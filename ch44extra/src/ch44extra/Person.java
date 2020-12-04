package ch44extra;

import java.time.LocalDate;

// abstract because it contains the abstract method pay
public abstract class Person implements Comparable<Person> {
	protected String name;
	protected LocalDate date;
	protected int id; 				// deleted salary field, added id
	
	public Person(String name, LocalDate date, int id) {
		super();
		this.name = name;
		this.date = date;
		this.id = id;
	}
	
	public Person() {
	}

	// getters not needed since attributes are now protected

	// abstract method, so Person class must be abstract
	public abstract void pay();  // no braces, no body
	
	@Override
	public int compareTo(Person arg0) {
		return date.compareTo(arg0.date);
	}
	
	@Override
	public String toString() {
		return "Name=" + name + ", hired=" + date + ", id number=" + id ;
	}
	
}
