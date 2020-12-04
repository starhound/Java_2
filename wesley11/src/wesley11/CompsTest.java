//Wesley Reid
//COP 2251 - Java 2
//SPC ID: 2385157
//Chapter 11 - Program 1

package wesley11;

import java.util.ArrayList;
import java.util.Arrays;

public class CompsTest {

	public static void main(String[] args) {
		//one declared computer, actual computer
		Computer pc1 = new Computer("SilverDraft Demon", new CPU("Intel Xeon", 2.7, 28), 16, "1TB", 499.99);
		
		//one declared computer, actual type desktop
		Computer pc2 = new Desktop("17 inch", new CPU("Intel i7", 3.1, 4), 8, 399.99, "Apple iMac", "256GB", "Keyboard Included");
		
		//one declared desktop, actual type desktop
		Desktop desk1 = new Desktop("No Monitor", new CPU("AMD Ryzen 3", 3.0, 4), 4, 199.99, "ASUS ROG STRIX GL12", "None Included", "LED Keyboard");
		
		//two declared computer, actual type laptop
		Computer pc3 = new Laptop("15 inch", new CPU("AMD Ryzen 5", 3.5, 8), 8, 259.99,"128GB", "MSI Gaming Laptop", 8.9);
		Computer pc4 = new Laptop("17 inch", new CPU("AMD Ryzen 7", 3.8, 16), 32, 699.99, "256GB", "Gigabyte Gaming Laptop", 10.9);
		
		//two declared laptop, actual type laptop
		Laptop lap1 = new Laptop("16 inch", new CPU("Intel i5", 3.5, 6), 8, 659.99, "500GB","MSI Gaming Laptop v2", 6.9);
		Laptop lap2 = new Laptop("15 inch", new CPU("AMD Ryzen 3 Turbo", 3.7, 4), 4, 219.99, "750GB", "Coolmaster Gaming Laptop", 6.9);
		
		//standard array
		Computer[] pcs = { pc1, pc2, desk1, pc3, pc4, lap1, lap2 };
		
		//ArrayList with array initializer
		ArrayList<Computer> listComputers = new ArrayList<>(Arrays.asList(pcs));
		
		//for-each iteration and object contents display
		for(Computer pc: listComputers) {
			System.out.println(pc.toString());
		}
	}

}
