/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetest;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author TRAIN 23
 */
public class FileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
            File file = new File("C:\\Users\\TRAIN 23\\demo\\FileTest\\file.txt");
            System.out.println("File exists?"+file.exists());
            file.createNewFile();
            System.out.println("File exists?"+file.exists());
            System.out.println("File new name "+ file.getName());
            
            file.renameTo(new File("betty "));
            System.out.println("File new name "+ file.getName());
            
    }
    
}
