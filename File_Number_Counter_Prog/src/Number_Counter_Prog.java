
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class Number_Counter_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        new Number_Counter_Prog().occurs();
    }

    private void occurs() throws IOException {
       
        Path path = Paths.get("C:\\Users\\TRAIN 23\\demo\\Java-\\occur.txt");
        String msg = "10 4 7 8 10 34 11 10 15 6 10";
        Files.write(path, msg.getBytes());
        
    }
    
}
