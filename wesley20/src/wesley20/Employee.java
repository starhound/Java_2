//Wesley Reid
//COP 2251 - Java Programming 2
//Chapter 20

package wesley20;

public class Employee {
	private String id;
	private String lastName;
	private String firstName;
	private int salary;
	
	public String getId() {
		return id;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getSalary() {
		return salary;
	}

	public Employee(String idVal, String fName, String lName, int salaryVal) {
		this.id = idVal;
		this.lastName = lName;
		this.firstName = fName;
		this.salary = salaryVal;
	}
	
	public String ToString() {
		String out = "";
		out += "ID: " + getId();
		out += " ";
		out += "First Name: " + getFirstName();
		out += " ";
		out += "Last Name: " + getLastName();
		out += " ";
		out += "Salary: " + getSalary();
		return out;
	}
}
