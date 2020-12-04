// Author: Wesley Reid
// Module 7 Programs
//

/*
    Create a Java program with a method that searches an integer array for a specified integer value 
    (see help with starting the method header below). If the array contains the specified integer, 
    the method should return its index in the array. If not, the method should throw an Exception stating 
    "Element not found in array" and end gracefully. Test the method in main with an array that you make 
    and with user input for the "needle".
*/

package reid7;

import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
        
        //First 15 of the Lucas series 
        int[] numberStack = { 2, 1, 3, 4, 7, 11, 18, 29, 47, 76, 123, 199, 322, 521, 843 };
        
        System.out.println("Please enter a number to search the haystack: ");
        
        //new scanner, gather input, close scanner
        Scanner input = new Scanner(System.in);
        int needle = input.nextInt();
        input.close();
        
        //pass args to method for finding needle
        int index = returnIndex(numberStack, needle);
        
        //final output
        System.out.println("Number: " + needle + " found at index " + index);
    }
    
    public static int returnIndex(int[] haystack, int needle) {
        //variable for if found in haystack
        boolean found = false;
        //placeholder for index needle is found at
        int index = 0;
        
        
        for(int i = 0; i < haystack.length; i++) {
            //if needle is found, set variable place holders
            if(needle == haystack[i])  {
                found = true;
                index = i;
                //terminate loop since we found our number
                break;
            }
        }
        
        //if not found, throw exception. 
        if(!found) {
            throw new IllegalArgumentException("Number: " + needle + " not found.");
        }
        return index;
    }
}