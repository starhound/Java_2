package reid7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Readfile {
    public static void readFile() throws FileNotFoundException {
        
        //create a file reader instance 
        FileReader fin = new FileReader("src/numbers.txt");
        
        //new scanner
        Scanner file = new Scanner(fin);
        
        //total of the data variable placeholder
        double d = 0.0;
        
        //go line by line, adding up the doubles contained in the file.
        while(file.hasNextDouble()) {
            double place = file.nextDouble();
            d += place;
            //print the double in the file
            System.out.println(place);
        }
        
        //close the file
        file.close();
        
        //print output
        System.out.print("\n");
        System.out.print("Total value of doubles: ");
        System.out.print(String.format("%.2f", d));
    } 
}
