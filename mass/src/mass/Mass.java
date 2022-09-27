/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mass;

import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class Mass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in);
      char ch= 'y';
       
       while( ch =='y'){
        
        System.out.println("Please enter the mass(KG) If the car ");
        double mass = input.nextDouble();
        System.out.println("Where would you like to calculate the mass on earth or the moon?");
        String answer = input.next();
        
        if(answer.equalsIgnoreCase("earth")){
        
            double sum = mass * 9.81;
            
            System.out.println("The car on earth weighs" + sum);
         
        }
        else if (answer.equalsIgnoreCase("moon")){
            
          double sum0 = (mass/9.81)*6;
          System.out.println("he car on the moon weighs" + sum0);
        }
        else{
        
            System.out.println("Invalid");
        
        }
      
        System.out.println("Do you wish to continue y/n");
        ch = input.next().charAt(0);
       
             
        
       
        
    }
    
}
    
}
