/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambpred;

/**
 *
 * @author TRAIN 23
 */
public class LambPred {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        
      
        
        
    }
    
    
    private void runMe(){
    
        System.out.println("" + check((h)->h.contains("777")));
    
    
    }
    
    private boolean check(Testing t, String h){
     return t.express(h);
    
    }
    
    
}

@FunctionalInterface
interface Testing{
 
    boolean express(String s);


}