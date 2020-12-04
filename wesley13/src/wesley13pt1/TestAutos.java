
package wesley13pt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestAutos {

	public static void main(String[] args) {
		
		//string array for random model selection
		String[] types = { "BMW", "Audi", "Ford", "Honda", "Toyota", "Lexus", "Oldsmobile" };
		
		//ArrayList creation
		ArrayList<Automobile> autos = new ArrayList<Automobile>();
		
		//first loop for population of ArrayList
		for(int i = 0; i < 5; i++) {
			//select random index for model
			int type = new Random().nextInt(types.length);

			//generate random year
			int year = new Random().nextInt((2020 - 1950) + 1) + 1950;
			
			//generate random price
			double price = new Random().nextDouble() * 10000;
			
			//round here for formatting
			Math.round(price);
			
			//inject new object into list
			autos.add(new Automobile(types[type], year, (double)price));
		}
		
		System.out.println("==================================");
		System.out.println("Printing Automobile Array");
		System.out.println("==================================");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Model: " + autos.get(i).getModel());
			System.out.println("Year: " + autos.get(i).getYear());
			System.out.println("Price: " + autos.get(i).getPrice());
			System.out.println("==================================");
		}
		
		System.out.println();
		
		Collections.sort(autos);
		
		System.out.println("==================================");
		System.out.println("Printing Sorted Automobile Array");
		System.out.println("==================================");
		
		autos.forEach(auto -> {
			System.out.println("Model: " + auto.getModel());
			System.out.println("Year: " + auto.getYear());
			System.out.println("Price: " + auto.getPrice());
			System.out.println("==================================");
		});	
	}
}
