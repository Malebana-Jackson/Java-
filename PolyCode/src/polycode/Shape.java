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
public abstract class Shape {
    
    private String name;
   
    
    Shape(String name){
       this.name = name;  
     
    }
    
    Shape(){
    
    this("UNKNOWN");
    
    }

    @Override
    public String toString() {
        return "Shape{" + "shape=" + name + '}';
    }
    
    
    
    public String getName(String name){
    
    return this.name;
    
    }
    
    
    public abstract double calcArea();
    
    
    
    
    
}
