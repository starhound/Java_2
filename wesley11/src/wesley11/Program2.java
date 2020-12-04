//Wesley Reid
//COP 2251 - Java 2
//SPC ID: 2385157
//Chapter 11 - Program 2

package wesley11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 0; i < 15; i++) {
			int num = rand.nextInt(40 - 20 + 1) + 20;
			list.add(num);
		}
		
		System.out.println("ArrayList pre-shuffle:");
		
		for(Integer x: list) 
			System.out.print(x + " ");
		
		System.out.print("\n");
		Collections.shuffle(list);
		System.out.println("ArrayList post-shuffle");
		
		for(Integer x: list) 
			System.out.print(x + " ");
		
		System.out.print("\n");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number that may be in the array: ");
		
		int input = scan.nextInt();
		scan.close();
		
		if(list.contains(input)) {
			int index = list.indexOf(input);
			System.out.println("Guess correct! Index of: " + index);
		} 
		else 
		{
			//display failed guess
			System.out.println("Guess incorrect!");
		}
		
		int high, low;
		high = java.util.Collections.max(list);
		low = java.util.Collections.min(list);
		System.out.println("Highest Int: " + high + ", Lowest Int: " + low);
	}

}
