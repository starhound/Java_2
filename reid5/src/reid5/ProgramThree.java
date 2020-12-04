// Author: Wesley Reid
// Module 5 Programs
//

/*
 * Create an ArrayList of strings to store the names of celebrities or athletes. 
 * Add five names to the list. Process the list with a for loop and the get() 
 * method to display the names, one name per line. Pass the list to a void method. 
 * Inside the method, Insert another name at index 2 and remove the name at index 4. 
 * Use a foreach loop to display the arraylist again, all names on one line separated by asterisks. 
 * After the method call in main, create an iterator for the arraylist and use it to display the list one more time.
 */

package reid5;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ProgramThree {
    public static void main(String[] args) {
        //Creating an ArrayList of String
        List<String> names = new ArrayList<>();
        
        //adding names to Arraylist
        names.add("Brian Kernighan");
        names.add("Dennis Ritchie");
        names.add("Y. Daniel Liang");
        names.add("Alan Turing");
        names.add("John von Neumann");
        
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        
        //newline for some spacing
        System.out.print("\n");
        
        changeNames(names);
        
        //displaying names on one line with asterisks
        for(int i = 0; i < names.size(); i++) {
            System.out.print("* " + names.get(i) + " ");
        }
        
        //newline for spacing
        System.out.print("\n\n");
        
        //this seems to be the easy way to use iterator, I believe there are some other methods like
        //forEachRemaining(), a list iterator, or using forEach() and lambda... I would generally attempt to use any 
        //form of foreach() when i can for its awesome simplicity but while() made a better fit today
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
        }
       
    }
    
    public static void changeNames(List<String> names) {
        names.add(2, "James Gosling");
        names.remove(4);
    }
}
