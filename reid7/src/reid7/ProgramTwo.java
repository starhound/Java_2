// Author: Wesley Reid
// Module 7 Programs
//

/*
    Write a program in a single file that:
    
    Main:
        Creates 10 random doubles, all between 1 and 11,
        Calls a class that writes 10 random doubles to a text file, one number per line.
        Calls a class that reads the text file and displays all the doubles and their sum accurate to two decimal places.
*/

package reid7;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class ProgramTwo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
        //create a random instance for data generation
        Random r = new Random();
        
        //form a double array of 10 values
        double[] randomVals = new double[10];
        
        //randomVals.length would also work here but we know the array isn't going to change size
        for(int i = 0; i < 10; i++) 
            //this should produce doubles anywhere from over 1 and under 11.
            randomVals[i] = 1.0 + (11.0 - 1.0) * r.nextDouble(); 
        
        //call custom classes to write and read data
        Writefile.createFile(randomVals);
        Readfile.readFile();   
    }
}
