// Author: Wesley Reid
// Module 6 Programs
//

/*
     Write a Java program that prompts the user to enter a password that matches a specific pattern. 
     Your program must approve the user's entry.. Here is the pattern, in this order:
        1 or more upper case letters
        two lower case letters
        1 or 2 digits
        zero or 1 upper case letters
        any two of this group @#$%^&
*/

package ProgramTwo;

import java.util.Scanner;

public class ProgramTwo {

    public static void main(String[] args) {
        
        //create and pass a scanner instance into a loop that prompts the user for input, checks that input, 
        //and will eventually end itself upon proper input. then notify user of proper data entry.
        Scanner input = new Scanner(System.in);
        while(!inspectPassword(input));
        System.out.println("Password accepted!");
    }
    
    public static boolean inspectPassword(Scanner input) {
        System.out.println("Please enter your password. \nEnter (?) to get information on password requirements: ");
        String password = input.nextLine();
        
        //requirements display
        if(password.contentEquals("?")) {
            System.out.println("Your password must contain all of the following rules:");
            System.out.println("------------------------------------------------------");
            System.out.println("1) Contain one or more uppercase letters.");
            System.out.println("2) Contain two or more lowercase letters");
            System.out.println("3) Contain at least two digits.");
            System.out.println("4) Contain zero or one uppercase letters.");
            System.out.println("5) Contain any two characters of the following group: @ # $ % ^ &\n");
            return false;
        }
        
        //count the amount of upper and lower case characters in the password at the same loop
        int lowerCount = 0;
        int upperCount = 0;
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isLowerCase(ch)) {
                lowerCount++;
            } else if(Character.isUpperCase(ch)) {
                upperCount++;
            }
        }
        
        //perform checks on case count expectations
        if(upperCount < 1) {
            System.out.println("Failure, must contain one uppercase letter.");
            return false;
        }
        
        if(lowerCount < 2) {
            System.out.println("Failure, must contain at least two lowercase characters.");
            return false;
        }
        
        //I'm sure some regex master could combine these queries into a single statement
        //regex for 2 or more digits
        if(!password.matches(".*\\d{2,}.*")) {
            System.out.println("Failure, must contain at least two digits.");
            return false;
        }
        
        /*
            I was a bit confused at this requirement as the first is "one or more upper case", 
            so doing "zero or one" would thus contradict that. Perhaps that is intentional!
            I'm unsure so i did it anyway, but left it commented out. 
        */
        
        /*
        //regex for zero or one uppercase letter
        if(!password.matches(".*[A-Z]??.*")) {
            System.out.println("Failure, must contain zero or one uppercase letters.");
            return false;
        }
        */
        
        //pattern match regex with a count of exactly 2 times
        if(!password.matches(".*[@#$%^&]{2}.*")) {
            System.out.println("Failure, must contain two of the following: @#$%^&");
            return false;
        }
        
        return true;
    }

}
