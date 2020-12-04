// Author: Wesley Reid
// Module 5 Programs
//

/*
 * Write a method named sumInts that can take a variable number of int arguments 
 * (see page 274-255 command-line arguments) and return the sum of these arguments. 
 * The ints to be summed up must be entered as command line arguments. 
 * Command line arguments can be simulated in Eclipse. Watch the video. In the main method, 
 * display the ints that were entered on the command line. Then execute sumInts and display the sum it returns.
 */

//My command line args are '1 2 3 4 5 6'

package reid5;

public class ProgramTwo {
    public static void main(String[] args) {
        
        //displaying the command line args, parsing them into integers
        for(int i = 0; i < args.length; i++) {
            System.out.print(Integer.parseInt(args[i]) + " ");
        }
        
        //defining a total variable returned from sumInts
        int total = sumInts(args);
        
        //newline required for formatting
        System.out.print("\n");
        
        //total output
        System.out.println("The total of the command line arguments is: " + total);
    }
    
    public static int sumInts(String[] args) {
        //define variable for return
        int total = 0;
        
        //combine the value of the arguments, once again parsing them
        for(int i = 0; i < args.length; i++) {
            total += Integer.parseInt(args[i]);
        }
        return total;
        
    }
}
