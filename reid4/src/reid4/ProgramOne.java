// Author: Wesley Reid
// Module 4 - Program One

/*
 * Write a program that analyzes an object falling for 10 seconds. It should contain main and two additional methods. 
 * One of the additional methods should return the distance an object falls in meters when passed the current 
 * second as an argument. See the formula needed below. The third method should convert meters to feet and return feet. 
 * You can look up the conversion factor needed online. The main method should use one loop to call the other methods 
 * and generate a table as shown below. The table should be displayed in formatted columns with decimals as shown.
 */

package reid4;

public class ProgramOne {
    
    //for use later on. not required but i prefer looking at labels over numbers
    static double GRAVITY = 9.8;
    
    public static void main(String[] args) {
        
        //Some titles for each column with formatting
        System.out.format("%-10s", "SEC");
        System.out.format("%-10s", "METERS");
        System.out.format("%-10s", "FEET");
        
        //println() causes a newline itself. So just print()
        System.out.print("\n");
        
        //start loop
        for(int i = 1; i <= 10; i++) {
            //print seconds
            System.out.format("%-10s", i);
            
            //call method that calculates distance in meters
            System.out.format("%-10s", distanceCalculation(i));
            
            //stack calls (generally bad but in simple uses it can be ok)
            System.out.format("%-9s", metersFeet(distanceCalculation(i)));
            
            //print newline again before loop restarts
            System.out.print("\n");
        }
    }
    
    public static double distanceCalculation(int seconds) {
        double out;
        
        //out = 1/2gt^2, where g = 9.8 and t is time. 
        //just wrote out in a method that follows PEMDAS
        out = GRAVITY * (seconds * seconds);
        out = out / 2;
        
        //here i convert the double into a string to get access to a more 
        //desired type of rounding/formatting with the decimal place. 
        //using Math.round() generally did not produce the desired output.
        String stringOut = String.format("%.2f", out);
        
        //we then convert it back into a double as the return value
        return Double.valueOf(stringOut);
    }
    
    public static String metersFeet(double meters) {
        //convert meters into feet
        double feet = meters * 3.28084;
        
        //return as string. can convert back to double, but either works...
        return String.format("%.1f", feet);
    }
}