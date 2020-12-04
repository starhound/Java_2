package wesley13pt2;

import java.util.*;

public class TestPet {

	public static void main(String[] args) {
		
		//the use of Date(int, int, int) has been deprecated -- workaround
		Date d1 = new Date(1590969600);
		Date d2 = new Date(1559390774);
		Date d3 = new Date(1522764303);
		Date d4 = new Date(1470423903);
		Date d5 = new Date(1511363043);
		
		Reptile rep = new Reptile("Smithers", 'M', d1);
		rep.type = "Bowa";
		
		System.out.println("Printing Reptile");
		System.out.println("======================");
		System.out.println(rep.toString());
		
		System.out.println("Printing Dog ArrayList");
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		//populate list
		dogs.add(new Dog("Max", 'M', d2));
		dogs.add(new Dog("Buttercup", 'F', d3));
		dogs.add(new Dog("Honey", 'F', d4));
		dogs.add(new Dog("Bob", 'M', d5));
		
		//setting of final values
		dogs.get(0).breed = "Pitbull";
		dogs.get(0).weight = 10;
		dogs.get(1).breed = "German Shepard";
		dogs.get(1).weight = 12;
		dogs.get(2).breed = "Poodle";
		dogs.get(2).weight = 18;
		dogs.get(3).breed = "Bloodhound";
		dogs.get(3).weight = 16;
		
		//display output
		dogs.forEach(pet -> {
			System.out.println("======================");
			System.out.print(pet.toString());
			System.out.print("======================\n\n");
		});
	}

}
