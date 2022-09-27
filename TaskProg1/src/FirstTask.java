
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
public class FirstTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);  
  
        System.out.println("Enter value for radius");
        double r = input.nextDouble();
       
        double area = 3.141592*(r*r);
       
        System.out.println("The area is :" + area);
        
    }
    
}
