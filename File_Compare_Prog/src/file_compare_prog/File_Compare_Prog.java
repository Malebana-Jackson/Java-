/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_compare_prog;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TRAIN 23
 */
public class File_Compare_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        new File_Compare_Prog().compare(args);
    }

    private long compare(String[] args) throws FileNotFoundException, IOException {
        
        Path path = Paths.get( args[0]);
        Path path1 = Paths.get( args[1]);
        
        
       
          
           
       try (BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(path.toFile()));
         BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream(path1.toFile()))) {
        
        int ch = 0;
        long pos = 1;
        while ((ch = fis1.read()) != -1) {
            if (ch != fis2.read()) {
                return pos;
            }
            pos++;
        }
        if (fis2.read() == -1) {
            return -1;
        }
        else {
            return pos;
        }
    }
    
           
           
           
 
    
           
       
       
        
       
       
       
       
        
    }


    
}
