/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams_prog;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author TRAIN 23
 */
public class IO_Streams_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        new IO_Streams_Prog().streams();
        new   IO_Streams_Prog().dataStream();
    }

    private void streams() {
        
        File file = new File("C:\\Users\\TRAIN 23\\demo\\Java-\\oFile.txt");
        byte[] byteArr = {66, 67, 77 ,78,88 ,89,99, 0x0a, 0x0c};
        
        try(FileOutputStream fos = new  FileOutputStream(file)){
        
        
        fos.write(12);
        fos.write(byteArr);
        fos.write(byteArr,2,6);
        
        
        
        } catch(IOException iox){
        
        
            System.out.println(" Error" +iox.getMessage());
        
        }
         File file2 = new File("C:\\Users\\TRAIN 23\\demo\\Java-\\oFile.txt");
        
         byte[] arrIn1 = new byte[2];
         byte[] arrIn2 = new byte[10];
         
        try(FileInputStream fis = new FileInputStream(file2)){
        
        fis.read(arrIn1,1,5);
        fis.read(arrIn2);
        
        
        
        }catch(IOException iox){
        
            System.out.println("Error" + iox.getMessage());
        }
        
        for(byte b : arrIn1){
        
            System.out.println(b);
        
        }
         for(byte b : arrIn2){
        
            System.out.println(b);
        
        }
        
        
        
        
    }

    private void dataStream() throws IOException {

        double pi = 3.14159;
        int i = 12345;
        short s= 987;
        
        try(FileOutputStream fos = new  FileOutputStream("C:\\Users\\TRAIN 23\\demo\\Java-\\dFile.txt");
               DataOutputStream dos = new DataOutputStream(fos)){
          
         dos.writeDouble(pi);
         dos.writeInt(i);
         dos.writeShort(s);
        
        }catch(IOException iox){
            
            System.out.println("Error"+ iox.getMessage());
                
        }
        
        try(FileInputStream fis = new  FileInputStream("C:\\Users\\TRAIN 23\\demo\\Java-\\dFile.txt");
               DataInputStream dis = new DataInputStream(fis)){
        
            double d = dis.readDouble();
            int i2 = dis.readInt();
            short s2 = dis.readShort();
            
            
            
            System.out.printf(" double %f, Int: %d, Short %d", d,i2,s2);
            
        
        }catch(IOException iox){
            
            System.out.println("Error"+ iox.getMessage());
                
        }
    }
    
   
}




