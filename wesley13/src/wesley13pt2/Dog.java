package wesley13pt2;

import java.util.Date;

public class Dog extends Pet implements Mobility {
	
	public String breed;
	public int weight;
	
	Dog(String n, char g, Date a) {
		super(n, g, a);
		
	}
	
	String getBreed() {
		return this.breed;
	}
	
	int getWeight() {
		return this.weight;
	}
	
	public String move() {
		return "Run or Prance";
	}
	
	public String toString() {
		String out = "";
		out += "Name: " + this.getName() + "\n";
		out += "Gender: " + this.getGender() + "\n";
		out += "Date Aquired: " + this.getAcquired() + "\n";
		out += "Breed: " + this.breed + "\n";
		out += "Weight: " + this.weight + "\n";
		out += "Sound: " + this.sound() + "\n";
		out += "Move: " + this.move() + "\n";
		return out;
	}

	@Override
	public String sound() {
		return "bark";
	}
	
	public int compareTo(Dog arg) {
		// TODO Auto-generated method stub
		int compare = this.weight - arg.getWeight();
		return compare;
	}

}
