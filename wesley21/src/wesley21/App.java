//Wesley Reid
//COP 2251 - Java Programming 2
//Chapter 21

package wesley21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		Employee empArray[] = new Employee[10];
		Employee emp1 = new Employee("1631", "John", "Smith", 50000);
		Employee emp2 = new Employee("3312", "Reed", "Richard", 50000);
		Employee emp3 = new Employee("2362", "Bill", "Hampton", 50000);
		Employee emp4 = new Employee("5312", "Ted", "Waters", 24000);
		Employee emp5 = new Employee("4111", "Jim", "Doves", 75000);
		Employee emp6 = new Employee("7906", "Bob", "Addison", 80000);
		Employee emp7 = new Employee("6431", "Aaron", "Drives", 15000);
		Employee emp8 = new Employee("9323", "Blake", "James", 8000);
		Employee emp9 = new Employee("8345", "Matt", "Davis", 17000);
		Employee emp10 = new Employee("1042", "Steven", "Long", 90000);
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
		
		System.out.println("All Employees:");
		
		for(Employee emp : empList) 
			System.out.println(emp.ToString());
		
		TreeMap<String, Employee> empTreeMap = new TreeMap<>();
		
		empList.forEach(e -> empTreeMap.put(e.getId(), e));
		
		System.out.println();
		System.out.println("Employees By ID #");
		
		empTreeMap.forEach((k, v) -> System.out.println(v.ToString()));
	}
}
