package wesley13pt2;

import java.util.Date;

public class Reptile extends Pet implements Mobility {

	public String type;
	
	Reptile(String n, char g, Date a) {
		super(n, g, a);
	}
	
	public String move() {
		return "Slither or shuffle";
	}
	
	public String sound() {
		return "Hiss";
	}
	
	public String toString() {
		String out = "";
		out += "Name: " + this.getName() + "\n";
		out += "Gender: " + this.getGender() + "\n";
		out += "Date Aquired: " + this.getAcquired() + "\n";
		out += "Type: " + this.type + "\n";
		return out;
	}

}
