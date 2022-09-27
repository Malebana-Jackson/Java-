/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_copy_prog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author TRAIN 23
 */
public class File_Copy_Prog {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        
        new File_Copy_Prog().copy(args);
        
    }

    private void copy(String[]args) throws IOException {
      
        File file1 = new File(args[0]);
      //  File file1 = new File("C:\\Users\\TRAIN 23\\demo\\file1.txt");
        System.out.println("File exisis: " + file1.exists());
        file1.createNewFile();
        
        
         System.out.println("Writing to the file...");
        try(PrintWriter printWriter = new PrintWriter(file1)){
            printWriter.println("Somewhere in the distant future\n"
                             + "Marsians resurface from below the planet surface...\n");
            printWriter.println("To issue a warning\n");
            printWriter.flush();
        } catch(IOException iox) {
            System.out.println("Write Error: " + iox.getMessage());
        }
        File file2 = new File(args[1]);
//        File file2 = new File("C:\\Users\\TRAIN 23\\demo\\file2.txt");
        System.out.println("File exisis: " + file2.exists());
        file2.createNewFile();
        
        
        System.out.println("Reading from the file...");
        try(FileReader fileReader = new FileReader(file1);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
               PrintWriter printWriter = new PrintWriter(file2) ){
            
            String s;
            
             System.out.println("Writing to the file...");
            while((s = bufferedReader.readLine()) != null){
               
                printWriter.println(s.toUpperCase());
                
            }
        } catch(IOException iox){
            System.out.println("Read Error: " + iox.getMessage());
        }
        
        
    }
    
}
