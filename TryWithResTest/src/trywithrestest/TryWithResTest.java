/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trywithrestest;

/**
 *
 * @author TRAIN 23
 */
public class TryWithResTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new TryWithResTest().testing();
    }

    private void testing() {
        try(AutoCloseClass acc = new AutoCloseClass(99)){
            System.out.println("passong in value");
        
        
        
        }catch(Exception ex){
        
            System.out.println("Error");
        
        }
    }
    
    

}

class AutoCloseClass implements AutoCloseable {

    private int value;

    public AutoCloseClass(int value) {
        this.value = value;
    }

      

    public int getValue() {
        return value;
    }
    
    
    
    @Override
    public void close() throws Exception {
        System.out.println("Hi");
       
    }
    }