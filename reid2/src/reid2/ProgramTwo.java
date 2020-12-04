// Author: Wesley Reid
// Module 2 - Program Two

/*
    Write a program that generates two random integers, both in the range 25 to 75, inclusive. 
    Use the Math class. Print both integers and then display the positive difference between the two integers, 
    but use a selection. Do not use the absolute value method of the Math class.
 */

package reid2;

public class ProgramTwo {

    public static void main(String[] args) {
        //use constants for later use for Math.random() ranges and checking of the generated values
        int MIN_VALUE = 25;
        int MAX_VALUE = 75;
        
        //generate two random numbers under the max specification
        int numberOne = (int) (Math.random() * MAX_VALUE);
        int numberTwo = (int) (Math.random() * MAX_VALUE);
        
        /*
         * So I don't believe this is quite ideal. But it does appear to work as desired.
         * I accept any feedback on a better method to ensure the number is in proper range.
         * I tried utilizing examples from the textbook, along with the examples from the chapter 4 slides, 
         * and even stack exchange, however, I kept getting values outside of the target ranges. 
         * 
         * This was the simple method I could visualize of ensuring both numbers we're inside the 
         * ideal range specified when using the Math class. It appears that there is also a Random() 
         * class we can use for Java versions 8+ that handles ranges easily? 
         * But it was not specified if that was allowed to be used or not.
         */
        
        //by default we expect we'll want to loop repeatedly 
        boolean loop = true;
        
        //start a do-while loop. other loops may also be acceptable, but do-while was best i thought.
        do {
            //if numberOne is greater than or equal to MIN_VALUE and less than or equal to MAX_VALUE
            if(numberOne >= MIN_VALUE && numberOne <= MAX_VALUE) {
                //so now we can assume we want to end the do-while loop here.
                loop = false;
            } else {
                //else: generate a new number
                numberOne = (int) (Math.random() * MAX_VALUE);
                //and restart the loop here.
                continue;
            }
            //if numberTwo is greater than or equal to MIN_VALUE and less than or equal to MAX_VALUE
            if(numberTwo >= MIN_VALUE && numberTwo <= MAX_VALUE) {
                //end the loop here, both numbers are in target range.
                break;
            } else {
                //else: generate a new second number, and reset the loop value.
                numberTwo = (int) (Math.random() * MAX_VALUE);
                loop = true;
            }
        } while (loop);
        
        //next we will cast if statements to determine which number is higher, and subtract the two for the 
        //positive difference. 
        
        //result value storage
        int result = 0;
        
        //if numberOne and numberTwo are equal, then result should remain as 0, thus meaning 
        //we don't need to utilize if/else if statement to define a case for the two being equal.
        if(numberOne > numberTwo) {
            result = (numberOne - numberTwo);
        } else {
            result = (numberTwo - numberOne);
        }
        
        //display output
        System.out.println("First Number: " + numberOne + "\nSecond Number: " + numberTwo);
        System.out.println("The positive difference of the two numbers is " + result);
    }

}
