package reid7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Writefile {  
    public static void createFile(double[] data) throws FileNotFoundException, UnsupportedEncodingException {
        //create a new File instance 
        File file = new File("src/numbers.txt");
        
        //if the file doesn't exist, create one. if exception occurs print the stack trace
        if(!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        
        //create print writer instance for the file 
        PrintWriter writer = new PrintWriter(file, "UTF-8");
        
        //write data to the file, one entry per line
        for(int i = 0; i < data.length; i++) 
            writer.println(data[i]);
        
        //close the writer
        writer.close();
    }
}
