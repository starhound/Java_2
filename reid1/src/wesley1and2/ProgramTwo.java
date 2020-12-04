// Author: Wesley Reid
// Module 1 and 2 Programs
//

//2. Write a program that prompts the user to enter a weight in kilograms and then displays the equivalent weight in pounds. 
//Control of decimal places is not required.

package wesley1and2;

//import scanner utilities to get input from the user later
import java.util.Scanner;

public class ProgramTwo {
    public static void main(String[] args) {
        //create a new scanner object 
        Scanner input = new Scanner(System.in);
        //prompt the use for input
        System.out.println("Enter your weight in Kilograms: ");
        //read the user input as a double, sometimes people use decimals when using kilograms for measurement
        double kilo = input.nextDouble();
        //1 kg = 2.20462262185 lb, rounding off to 2.2 as this is the norm.
        //perform calculation and output on same line!
        System.out.println(kilo + " kilograms is " + (kilo * 2.2) + " pounds.");
    }
}
