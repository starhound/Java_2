// Author: Wesley Reid
// Module 4 - Program Two

/*
 * Write a program that simulates tossing a coin. Prompt the user for how many times to toss the coin. 
 * Code a method with no parameters that randomly returns either the String "heads"or the string "tails". 
 * Call this method in main as many times as requested and report the results.
 */

package reid4;

import java.util.Scanner;

public class ProgramTwo {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt for input
        System.out.println("Number of coin flips: ");
        
        //capture input
        int tosses = input.nextInt();
        
        //initialize variables for storage
        int heads = 0; 
        int tails = 0;
        
        //begin loop
        for(int i = 0; i <= tosses; i++) {
            //get randomized heads/tails string
            String result = tossCoin();
            
            //inspect string and increase variables as desired
            if(result == "heads")
                heads++;
            else
                tails++;
        }
        
        //display output
        System.out.println("Result of " + tosses + " coin tosses.");
        System.out.println("Heads: " + heads + ", Tails: " + tails);
    }
    
    public static String tossCoin() {
        //random() returns value between 0.0 and 1.0 so if we have greater than 
        //0.5, result is heads. less than 0.5 and the result is tails.
        if(Math.random() < 0.5)
            return "heads";
        else
            return "tails";
    }
}