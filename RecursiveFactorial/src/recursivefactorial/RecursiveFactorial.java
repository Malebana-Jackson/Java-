/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefactorial;

/**
 *
 * @author TRAIN 23
 */
public class RecursiveFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Factorial" + new RecursiveFactorial().doFactorial(3));
    }
    
    public long doFactorial(int series){
    
     if(series<=1){
     
     return 1L;
     }else{
     
     return (series*doFactorial(series-1));
     }
    
    
    }
    
}
