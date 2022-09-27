/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caffiene;

/**
 *
 * @author TRAIN 23
 */
public class Caffiene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       final double killer_dose = 10000.00;
       double coke = 34;
       double pepsi = 37.5;
       double starbucks = 475;
       
       double amount_coke = Math.ceil(killer_dose/coke);
       double amount_pepsi = Math.ceil(killer_dose/pepsi);
       double amount_starbucks = Math.ceil(killer_dose/starbucks);
       
       
       System.out.println("There is" +coke+ "ml  amount of cans for coke is:" + amount_coke);
       System.out.println("There is" +pepsi+ "ml amount of cans for pepsi is:" + amount_pepsi);
       System.out.println("There is" +starbucks +"ml amount of cans for starbucks is:" + amount_starbucks);
        
       
    }
    
}
