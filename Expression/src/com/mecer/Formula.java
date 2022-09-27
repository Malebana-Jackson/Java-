/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mecer;

/**
 *
 * @author TRAIN 23
 */
public final class Formula {
    
    
    public static double formula_3x(double x){
    
     return 3*x;
    
    
    }
    
     public static double  formula_3xPlusY(double x, double y){
    
     return formula_3x( x) + y;
    
    
    }
        
        
         public static double formula_xPlusYDivZ(double x, double y, double z){
         
          return (x+y)/z;
         
         
         }
         
         
         public static double formula_3xPlusYDivZ(double x, double y, double z, double r){
         
          return formula_3x( (x+y)/(z+r)); 
         
         
         }
    
}
