
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class DIET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
     
      
        double concentration = 0.01;
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the weight of the mouse in grams: ");
        double Mouse_Weight = input.nextDouble();
        
        System.out.println("Enter the desired weight of diete in grams: ");
        double Desired_Weight = input.nextDouble();
        
        double Weight_Ratio = Desired_Weight/Mouse_Weight;
        double Result = Weight_Ratio/ concentration;
      
        
        System.out.println("The amount of soda allowed :" + Result);
        
        
        

       



        
    }
    
   
    
}
