/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytask2;

/**
 *
 * @author TRAIN 23
 */
public class ArrayTask2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int my2DArray[][] = new int[4][]; 
        int anotherArray[];
        int array[] = new int[4];
        
        int myArray1 [] =  new int [4];
        int myArray2 [] = new int [5];
        int myArray3 [] = new int[6];
        int myArray4 [] = new int[7];
        
        my2DArray[0] = myArray1;
        my2DArray[1] = myArray2;
        my2DArray[2] = myArray3;
        my2DArray[3] = myArray4;
        my2DArray[1] = array;
        
        anotherArray = array;
        
        for(int i =0; i< my2DArray.length; i++){
            
            for(int l =0; l<my2DArray[i].length; l++){
            
                System.out.print(" " + my2DArray[i][l]);
            
            
            }System.out.println("");
        
            
        
        }
        
           for(int i =0; i< my2DArray.length; i++){
            
            for(int l =0; l<myArray1.length; l++){
            
                System.out.print(" " + my2DArray[i][l]);
            
            
            }System.out.println("");
        
    }
           for(int l =0; l<anotherArray.length; l++){
            
                System.out.print(" " + anotherArray[l]);
            
            
            }System.out.println("");
    
}
}