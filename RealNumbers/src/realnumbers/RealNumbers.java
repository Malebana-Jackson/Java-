/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realnumbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class RealNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        double sum =0;
        double realArray[] = new double[6];
        
        for(int i=0;i<=5 ;i++){
        
            System.out.println("Enter 6 different real Numbers");
            realArray[i]= input.nextDouble();
        
            if(realArray.length !=6)
                break;
            sum += realArray[i];
            
            
            }
        
            double avg = sum/6;
        
            System.out.println("The average of the Real Number:" + avg);
        
  
        
        
    }
    
}
