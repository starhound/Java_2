// Author: Wesley Reid
//
// Module 2 - Program One

/*
 * Prompt the user to enter any full name (first middle surname). Do not bother with surnames like O'Reilly, Van Helsing, de Ville etc. 
 * Then output the following in this order with a message and the data on separate lines:
 *    the length of the full name, including spaces.
 *    the length of the middle name.
 *    the three initials of the name.
 *    the name in all upper case.
 */

package reid2;

import java.util.Scanner;

public class ProgramOne {

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user for data
        System.out.println("Please enter your full name (First, Middle, Last), separated by spaces:");
        
        //set input data as a string and start a new line
        String name = input.nextLine();
        
        //determine the length of the string the user input. 
        int fullNameLength = name.length();
        
        //create a temporary array to hold the individual words in string form from the user input 
        String[] tempArray;
        
        //limiting to 3 strings maximum within tempArray, as most names are made up of three words.
        //Using an string with a simple space as the first argument for split(), which should break up the entered 
        //string by spaces. 3 is the second argument, specifying that at most we will have 3 strings contained in the array.
        tempArray = name.split(" ", 3);
        
        //determine the length of the middle name, which should be index 1 in tempArray
        int middleNameLength = tempArray[1].length();
        
        //construct a string from the first characters of all strings contained in tempArray
        //first, define an empty string for storage
        String initials = "";
        
        //utilize a for loop to pass over all strings in tempArray
        //this should pull a char value from each string inside tempArray then convert it to a string, and also 
        //perform concatenation with it into the initials string defined above.
        for(int i = 0; i < tempArray.length; i++)
            initials += String.valueOf(tempArray[i].charAt(0));
        
        //now we'll set the entered string to all upper-case.
        String upperCaseName = name.toUpperCase();
        
        //finally, display all output.
        System.out.println("Your name is: " + name);
        System.out.println("The length of your full name is " + fullNameLength + " characters long (including spaces).");
        System.out.println("The length of your middle name is " + middleNameLength + " characters long.");
        System.out.println("Your initials are: " + initials);
        System.out.println("Your name in all uppercase letters is: " + upperCaseName);
    }
}
