/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class newSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double interest = 0.08;
        double amount = 10000.00;
        int years = 5;
        
        
        double SI = (amount * interest * years)/100;
        
        System.out.println("Simple interest on 10 000 is :" + SI);
        
    }
    
}
