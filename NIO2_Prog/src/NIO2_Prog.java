
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class NIO2_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        new NIO2_Prog().test();
        new NIO2_Prog().test0();
        new NIO2_Prog().test1();
        new NIO2_Prog().test2();
    }

    private static void test() throws IOException {
        
        String newLine = System.lineSeparator();
        Path path = Paths.get("C:\\Users\\TRAIN 23\\demo\\Java-\\nio2.txt");
        String msg = "The World Is Youz"+ newLine;
        Files.write(path, msg.getBytes());
       
        
        
    }

    private void test0() throws IOException {
       String newLine = System.lineSeparator();
        Path path = Paths.get("C:\\Users\\TRAIN 23\\demo\\Java-\\nio2.txt");
        String msg = "only for a season"+ newLine;
        Files.write(path, msg.getBytes(), StandardOpenOption.APPEND);
       
    }

    private void test1() throws IOException {
        
        Path path = Paths.get("C:\\Users\\TRAIN 23\\demo\\Java-\\nio2.txt");
        byte[] stuffRead = Files.readAllBytes(path);
        String read = new String (stuffRead);
        System.out.println(read);
        
    }

    private void test2() throws IOException {
        Path path = Paths.get("C:\\Users\\TRAIN 23\\demo\\Java-\\nio2.txt");
        List<String> reading = Files.readAllLines(path);
        for(String s : reading){
        
            System.out.println(s);
        }
        
        
        
    }
    
}
