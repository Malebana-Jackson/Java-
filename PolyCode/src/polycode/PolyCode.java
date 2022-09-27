/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polycode;

/**
 *
 * @author TRAIN 23
 */
public class PolyCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shape rect = new Rectangle(10.0,6.0, "Rectangle");
        Shape square = new Square(5.0, "Square");
        Shape cube = new Cube( 6.0, "Cube");
        
        
        System.out.println("Your area is" + rect.calcArea() );
        
       
        
        
    }
    
}
