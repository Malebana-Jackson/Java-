
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
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight value");
        double weight = input.nextDouble();
            
        System.out.println("Enter the weight value");
        double height = input.nextDouble();
        
        double bmi= weight / (height*height);
       
        System.out.println("BMI: " + bmi);
    }
    
}
