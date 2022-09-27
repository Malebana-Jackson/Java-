/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author TRAIN 23
 */
public class Arrays {

 
    
    
   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        int[] myArray1, myArray2;
        int[] myMainArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        myArray1 = myMainArray;

        for (int i = 0; i < myArray1.length; i++) {

            System.out.print(" " + myArray1[i]);

        }

        System.out.println("");

        for (int i = 0; i < myArray1.length; ++i) {
            int fact = myArray1[i];
            fact *= i;
            System.out.print(" " + "Factorial of " + myArray1[i] + " is " + fact);
        }

        System.out.println("");

        myArray2 = myArray1;

        for (int i = 0; i < myArray2.length; i++) {

            System.out.print(" " + myArray2[i]);

        }
        System.out.println("");
        myArray2[1] = 23;
        myArray2[4] = 19;
        myArray2[8] = 1;

        for (int i = 0; i < myArray1.length; i++) {

            System.out.print(" " + myArray1[i]);

        }

        System.out.println(" ");

        int[] myLargeArray = new int[30];

        myArray2 = myLargeArray;

        for (int i = 0; i < myArray2.length; i++) {

            System.out.print(" " + myArray2[i]);

        }

        System.out.println("");

        for (int i = 0; i < myArray1.length; i++) {

            myArray2[i] = myArray1[i];
            System.out.print(" " + myArray2[i]);

        }
        System.out.println("");

        myArray2[0] = 200;
        myArray2[5] = 145;
        myArray2[3] = 19;

        for (int i = 0; i < myArray2.length; i++) {

            System.out.print(" " + myArray2[i]);

        }

        System.out.println(" ");
        for (int i = 0; i < myArray1.length; i++) {

            System.out.print(" " + myArray1[i]);

        }
        System.out.println(" ");

    }

}
