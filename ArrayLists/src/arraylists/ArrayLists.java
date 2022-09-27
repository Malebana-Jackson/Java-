/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

//        ArrayList<String> store = new ArrayList<>();
//        store.add("Sneakers");
//        store.add("Hoodies");
//        store.add("Tracksuit");
//        store.add("Jeans");
//        store.add("Hats");
//
//        System.out.println(store);
//        store.get(1);
//        store.remove(4);
//        store.add("Slides");
//
//        for (String s : store) {
//
//            System.out.print(" " + s);
//
//        }
//        System.out.println("");
//        System.out.println("The number of items in this list is: " + store.size());
//        System.out.println("");
//
//        if (store.contains("Hoodies")) {
//
//            System.out.println("Store still has Hoodies in stock");
//
//        } else {
//
//            System.out.println("Hoodies out of stock");
//
//        }
//
//        //============================================================================================================================================
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

      
        
      
      
//        System.out.println("Please enter WayPoints"+x);
//        while(input.hasNext()){
//        
//        double i = input.nextDouble();
//         WayPoints pts = new WayPoints(x,y,t)
//        
//        }
    }



}
