package wesley13pt1;

public class Automobile implements Comparable<Automobile> {

	private String model;
	private int year;
	private double price;
	
	Automobile(String m, int y, double p) {
		this.model = m;
		this.year = y;
		this.price = p;
	}
	
	public Automobile() {
	}

	String getModel() {
		return model;
	}
	
	int getYear() {
		return year;
	}
	
	double getPrice() {
		return price;
	}
	
	@Override
	public int compareTo(Automobile arg) {
		// TODO Auto-generated method stub
		int compare = this.year - arg.getYear();
		return compare;
	}


}
