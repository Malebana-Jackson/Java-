/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adv_stream_prog;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author TRAIN 23
 */
public class Adv_Stream_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Adv_Stream_Prog().testing();
        new Adv_Stream_Prog().testing0();
        
        
        
    }

    private void testing() {
        Integer[] myInt = {1,2,3,4,5,6,};
        Stream<Integer> myStream = Arrays.stream(myInt);
        long count = myStream.filter((i)-> i>2).count();
        System.out.println("Count is"+ count);
        myStream = Arrays.stream(myInt);
        count = myStream.filter((i)-> i>5).count();
        
        
    }

    private void testing0() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
