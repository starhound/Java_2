//Wesley Reid
//COP 2251 - Java Programming 2
//Chapter 20


package wesley20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {
	
	public static void cutBack(LinkedList<Employee> empLinkedList) {
		int maxIndex = 0;
		int max = 0;
		for(int i = 0; i < empLinkedList.size(); i++) {
			if(empLinkedList.get(i).getSalary() > max) {
				maxIndex = i;
				max = empLinkedList.get(i).getSalary();
				continue;
			}
		}
		Employee toRemove = empLinkedList.get(maxIndex);
		System.out.println("Removing the following employee from linked list:\n");
		System.out.println(toRemove.ToString());
		empLinkedList.remove(toRemove);
		System.out.println("Employee removed.\n");
	}

	public static void main(String[] args) {
		Employee empArray[] = new Employee[10];
		Employee emp1 = new Employee("1", "John", "Smith", 50000);
		Employee emp2 = new Employee("1", "Reed", "Richard", 50000);
		Employee emp3 = new Employee("1", "Bill", "Hampton", 50000);
		Employee emp4 = new Employee("1", "Ted", "Waters", 24000);
		Employee emp5 = new Employee("1", "Jim", "Doves", 75000);
		Employee emp6 = new Employee("1", "Bob", "Addison", 80000);
		Employee emp7 = new Employee("1", "Aaron", "Drives", 15000);
		Employee emp8 = new Employee("1", "Blake", "James", 8000);
		Employee emp9 = new Employee("1", "Matt", "Davis", 17000);
		Employee emp10 = new Employee("1", "Steven", "Long", 90000);
		empArray[0] = emp1;
		empArray[1] = emp2;
		empArray[2] = emp3;
		empArray[3] = emp4;
		empArray[4] = emp5;
		empArray[5] = emp6;
		empArray[6] = emp7;
		empArray[7] = emp8;
		empArray[8] = emp9;
		empArray[9] = emp10;
		
		ArrayList<Employee> empList = new ArrayList<Employee>();

		Collections.addAll(empList, empArray);
		
		empList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getLastName));
		
		System.out.println("Printing Sorted Array List:");
		
		empList.forEach(e -> System.out.println(e.ToString()));
		
		LinkedList<Employee> empLinkedList = new LinkedList<Employee>(empList);
		
		cutBack(empLinkedList);
		
		ListIterator<Employee> list = empLinkedList.listIterator();
				
		while(list.hasNext())
	          list.next();
	    
		System.out.println("Printing Linked List Reversed:");
		
		while(list.hasPrevious()) 
			System.out.println(list.previous().ToString());
	}
}
