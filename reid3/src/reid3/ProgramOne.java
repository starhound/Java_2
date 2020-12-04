// Author: Wesley Reid
// Module 3 - Program One

/*
    Write a program that uses one loop to process the integers from 300 down to 200, inclusive. 
    The program should detect multiples of 11 or 13, but not both. The multiples should be printed 
    left-aligned in columns 8 characters wide, 5 multiples per line (See Example Output). 
    When all multiples have been displayed, the program should display the number of multiples found and their sum. 
 */

package reid3;

public class ProgramOne {

    public static void main(String[] args) {
        //define constants for modulus operator, not required but it makes it easier to read (personally)
        int ELEVEN = 11;
        int THIRTEEN = 13;

        //define integer for column spacing and totals, and count of valid matches
        int col = 0;
        int total = 0;
        int count = 0;
        
        //begin a for loop
        for(int i = 300; i >= 200; i--) {
            //if divisible by 11 AND thirteen, skip.
            if(i % ELEVEN == 0 && i % THIRTEEN == 0)
                continue;
            //if divisible by 11 OR thirteen, perform actions
            if(i % ELEVEN == 0 || i % THIRTEEN == 0) {
                //column spacing 
                if(col == 5) {
                    System.out.println("\n");
                    col = 0;
                }
                
                //print the value found that matches requirements, 8 characters wide. 
                System.out.printf("%-8d", i);
                
                //add value to the total integer
                total += i;
                
                //increase the column count
                col++;
                
                //increase the found values count
                count++;
            }
        }
        
        //print count and total values
        //new line
        System.out.println("\n");
        System.out.println("Found: " + count + " Total: " + total);
    }
}