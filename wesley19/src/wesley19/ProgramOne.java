//Wesley Reid
//COP 2251 - Java Programming 2
//Chapter 19 - Described Problem

package wesley19;

import java.util.Arrays;

public class ProgramOne <E> {
	private Object[] data;
	final private int size;
	
	public ProgramOne(int size) {
		data = new Object[size];
		this.size = size;
	}
	
	public void set(E ob, int index) {
		data[index] = (E)ob;
	}
	
	public static void displayArray(ProgramOne<?> E) {
		System.out.println("Generic array contains " + Arrays.toString(E.data));
		System.out.println("Generic array contained " + E.size + " elements.");
	}

	public static void main(String[] args) {		
		int n = 3;
		ProgramOne<Integer> array1 = new ProgramOne<Integer>(n);		
		for(int i = 0; i < 3; i++) {
			array1.set(i + 1,  i);
		}	
		displayArray(array1);
		System.out.println();	
		n = 5;
		ProgramOne<String> array2 = new ProgramOne<String>(n);
		array2.set("One", 0);
		array2.set("Two", 1);
		array2.set("Three", 2);
		array2.set("Four", 3);
		array2.set("Five", 4);	
		displayArray(array2);
		System.out.println();	
		n = 7;
		ProgramOne<Double> array3 = new ProgramOne<Double>(n);
		Double start = 0.00;	
		for(int i = 0; i < 7; i++) {
			start += 0.01;
			array3.set(start, i);
		}	
		displayArray(array3);
	}

}
