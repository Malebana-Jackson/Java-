/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class GPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner input = new Scanner(System.in);
        
         ArrayList<WayPoints> pts = new ArrayList<WayPoints>();
        
        String ans;
        
      do{
            System.out.println("Please enter a value for x");
            double x = input.nextDouble();
            System.out.println("Please enter a value for y");
            double y = input.nextDouble();
            System.out.println("Please enter the value of t");
            int  t = input.nextInt();

            pts.add(new WayPoints(x, y, t));
            System.out.println("Do you wish to continue y/n");
            ans = input.next();
            
        }  while(ans.equalsIgnoreCase("y"));

      
      
      
        for(WayPoints xy  :pts ){
            
          double totalX = 0,  totalY = 0,  distance ;
          int totalT = 0, speedAvg =0;
        
          int finishX = (int)pts.indexOf(xy.getX())+1;
          
          if(finishX< pts.size()){
          
          
          totalX = pts.get(finishX).getX() - xy.getX();
          
          
          
          }
          
          int finishY = (int)pts.indexOf(xy.getY())+1;
          
          if(finishY< pts.size()){
          
          
              totalY = pts.get(finishY).getX() - xy.getY();
          
          
          }
               
             int finishT = pts.indexOf(xy.getT())+1;
               
          if(finishT< pts.size()){
          
          
              totalT =pts.get(finishT).getT() - xy.getT();
          
          
          
          }
          
          
            distance = (int) Math.sqrt(Math.pow(totalX, 2) - Math.pow(totalY,2));
            
            speedAvg = (int)distance / totalT;
            
            
            System.out.printf("The hiker travele in hrs %s%n", distance, speedAvg);
            

        }   
        
         
         
        
        
        
        
    }
    
}
