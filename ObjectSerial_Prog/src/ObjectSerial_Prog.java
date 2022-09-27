
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class ObjectSerial_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      
        
        new ObjectSerial_Prog().objectTrst();
        
    }

    private void objectTrst() throws FileNotFoundException {
        
        File fie= new  File("C:\\Users\\TRAIN 23\\demo\\Java-\\human.txt");
        
        System.out.println("File existance?"+ fie.exists());
        Person p = new Person("Pharrel", 21);
        System.out.printf("Person info"+ p);
        
        try(FileOutputStream fis = new  FileOutputStream(fie);
              ObjectOutputStream oos = new ObjectOutputStream(fis)
                
                ){
        
        
        oos.writeObject(p);
        
      }catch(IOException iox){
            
            System.out.println("Error"+ iox.getMessage());
                
        }
        
        System.out.println("Reading object...");
        
        
        try(FileInputStream fis = new  FileInputStream(fie);
           ObjectInputStream ois = new ObjectInputStream(fis)){
        
           Person obj = (Person) ois.readObject();
            System.out.println(" "+ obj);
        
        }catch( IOException | ClassNotFoundException iox){
        
            System.out.println(""+iox.getMessage());
        }
        
        
        System.out.println("");
}}
