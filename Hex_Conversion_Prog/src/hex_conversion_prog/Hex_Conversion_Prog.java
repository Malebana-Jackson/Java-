/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex_conversion_prog;

import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class Hex_Conversion_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Hex_Conversion_Prog().readValue();
    }
    
    private void readValue(){
    
    try(Scanner input = new Scanner(System.in)){
    
        System.out.println("Please a decimal interger valuse for hexadecimal conversion");
        int value = input.nextInt();
        
        
        convertion(value);
        
    
    }catch(Exception xin){
    
        System.out.println("Failed to read input"+xin.getMessage());
    
    }
    finally{
        System.out.println("Closing the input stream please try restarting the program");
    }
    }

    
    private String convertion(int value) {
        
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
         int rem;  
        String hex=""; 
        
        while(value>0)  
     {  
       rem=value%16;   
       hex=hexchars[rem]+hex;   
       value=value/16;  
     }  
      return hex; 
         
      
    }

    
}
