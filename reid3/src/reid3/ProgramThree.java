// Author: Wesley Reid
// Module 3 - Program Three

/*
    Write a program that deliberately contains an endless or infinite while loop. 
    The loop should generate multiplication questions with single digit random integers.
    Users can answer the questions and get immediate feedback. After each question, 
    the user should be able to stop the questions and get an overall result.
*/

package reid3;

//import random for easy number generation
import java.util.Random;

//import scanner for getting user input
import java.util.Scanner;

public class ProgramThree {

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        //define min/max for random number generations 
        int min = 1;
        int max = 9;
        
        //create random object
        Random rand = new Random();
        
        //loop value
        boolean loop = true;
        
        //utilize a do-while loop as we can repeat endlessly until the user specifies not too.
        //i'm a big fan of do-while, its very dynamic and can be used for a bunch of different tasks.
        //you could also just do while(true) or possibly even while(;;) to create a infinite loop that way,
        //but do-while() is just much more comprehensive to me.
        do {
            //generate random integers 1 & 2;
            int num1 = rand.nextInt((max - min) + 1) + min;
            int num2 = rand.nextInt((max - min) + 1) + min;
            
            //determine result
            int result = num1 * num2;
            
            //Display question
            System.out.println("What is " + num1 + " * " + num2 + "? ");
            
            //get their answer to the question
            int user_result = input.nextInt();
            
            //check their input against the result, if correct notify user, if not - display proper value
            if(user_result == result)
                System.out.println("Correct! Try another? (y/n): ");
            else 
                System.out.println("Incorrect! Result is: " + result + ". Try another? (y/n): ");
            
            //gather user input on if they wish to continue or not.
            String prompt = input.next();
            
            //use equals() to see if they wish to continue
            if(prompt.equals("y") || prompt.equals("yes")) {
                continue;
            } else { 
                //anything else and set loop to false, which will terminate the do-while loop 
                System.out.println("Goodbye!");
                loop = false;
            }
        } while(loop);
    }
}