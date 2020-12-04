// Author: Wesley Reid
// Module 3 - Program Two

/*
    Write a program that generates a two-column table showing Fahrenheit temperatures from -40F to 120F 
    and their equivalent Celsius temperatures. Each line in the table should be 5 degrees F more 
    than the previous one. Both the Fahrenheit and Celsius temperatures should be accurate to 2 decimal place.
*/

package reid3;

public class ProgramTwo {

    public static void main(String[] args) {
        
        //constants for max and low temperatures
        int MAX_TEMP = 120;
        int LOW_TEMP = -40;
        
        //counter value for handling the increments of 5
        int count = 0;
        
        System.out.println("Fahrenheit    Celsius");
        System.out.println("---------------------");
        
        for(int i = LOW_TEMP; i <= MAX_TEMP; i++) {
            //every 5 degrees of change, perform manipulations.
            if(count == 5) {
                //reset counter
                count = 0;
                
                //Formula for F to C:
                //Deduct 32, then multiply by 5, then divide by 9
                double c = i - 32;
                c = c * 5;
                c = c / 9;
                
                //some formatting and displaying 2nd decimal place
                System.out.println(String.format("%-14s", i) + String.format("%.2f", c));
            }
            count++;
        }
    }
}