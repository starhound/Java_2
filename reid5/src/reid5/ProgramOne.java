// Author: Wesley Reid
// Module 5 Programs
//

/*
 * Declare an array to hold eight integers. Use a for loop to add eight random integers, 
 * all in the range from 50 to 100, inclusive, to this array. Duplicates are okay. 
 * Next, pass the array to a method that sorts the array and returns another array containing 
 * only the largest and smallest elements in the original array. Print these two values in main. 
 * Then use a foreach loop to display all elements of the sorted array on one line separated by a single space. 
 * This latter loop should also count the odd and even numbers in the array and determine the sum of all elements in the array.
 */

package reid5;

import java.util.Random;
import java.util.Arrays;

public class ProgramOne {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int[] intArray = new int[8];
        
        for(int i = 0; i < intArray.length; i++) {
            //should give a random int between 0 and 49
            int randomInt = rand.nextInt(50);
            
            //add 51 to get target range of 50-100
            randomInt += 51;
            
            //add the random int into the int array
            intArray[i] = randomInt;
        }
        
        //create a new int array which will be returned from a method that sorts intArray
        int[] highLowArray = sortArray(intArray);
        
        //print high/low values
        System.out.println("The lowest value is: " + highLowArray[0]);
        System.out.println("The highest value is: " + highLowArray[1]);
        
        //define variables for required output
        int evens = 0, odds = 0, total = 0;
        
        for(int i = 0; i < intArray.length; i++) {
            //print array contents
            System.out.print(intArray[i] + " ");
            
            //check for even/odd, increase counts
            if(intArray[i] % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
            //combine totals
            total += intArray[i];
        }
        
        //newline required
        System.out.print("\n");
        
        //display output
        System.out.println("Evens: " + evens + ", Odds: " + odds);
        System.out.println("Total: " + total);
    }
    
    public static int[] sortArray(int[] intArray) {
        //define new array
        int[] sortedArray = new int[2];
        
        //use Arrays util to sort intArray easily
        Arrays.sort(intArray);
        
        //take high/low values from intArray and plug them into sortedArray
        sortedArray[0] = intArray[0];
        sortedArray[1] = intArray[7];
        
        return sortedArray;
    }
}
