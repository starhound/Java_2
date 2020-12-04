//Wesley Reid
//COP 2251 - Java Programming 2
//Chapter 19 - Problem 10

package wesley19;

import java.util.ArrayList;

class DataClass {
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E high = null;
		
		for(int i = 0; i < list.size(); i++) {
			if(0 == i) {
				high = list.get(i);
				continue;
			}
			if(list.get(i).compareTo(high) > 0) {
				high = list.get(i);
			}
		}
		return high;
	}
}

public class ProgramTwo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayOne = new ArrayList<Integer>();
		System.out.println("Array Contains:");
		for(int i = 0; i < 10; i++) {
			int rand = (int) (Math.random() * (100 - 1) + 1);
			arrayOne.add(rand);
			System.out.println(rand);
		}
		
		int high = DataClass.max(arrayOne);
		System.out.println("Max Value: " + high);
		
		System.out.println();
		
		ArrayList<String> arrayTwo = new ArrayList<String>();
		arrayTwo.add("One");
		arrayTwo.add("Two");
		arrayTwo.add("Three");
		
		System.out.println("Array Contains:");
		for(int i = 0; i < arrayTwo.size(); i++) {
			System.out.println(arrayTwo.get(i));
		}
				
		String max = DataClass.max(arrayTwo);
		System.out.println("Max Value: " + max);
	}
}
