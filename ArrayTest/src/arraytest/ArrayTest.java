/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] numSort = new int[4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numSort.length; i++) {
            //numSort[i] = (int) (Math.random() * 100);
            System.out.println("Please populate array");
            numSort[i] = input.nextInt();

        }

        for (int i = 0; i < numSort.length; i++) {

            for (int j = 0; j < numSort.length-1; j++) {
                {
                    if (numSort[i] > numSort[j]) {
                        int temp = numSort[i];
                        numSort[i] = numSort[j];
                        numSort[j] = temp;
                    }
                }
            }
        }

//        if (numSort[0] > numSort[1]) {
//
//            int temp = numSort[0];
//            numSort[0] = numSort[1];
//            temp = numSort[1];
//
//        }
//
//        if (numSort[1] > numSort[2]) {
//
//            int temp = numSort[1];
//            numSort[1] = numSort[2];
//            temp = numSort[2];
//
//        }
//
//        if (numSort[2] > numSort[3]) {
//
//            int temp = numSort[2];
//            numSort[2] = numSort[3];
//            temp = numSort[1];
//            }
//                if(numSort[3] > numSort[1]){
//               
//            int temp = numSort[3];
//            numSort[3] = numSort[4];
//            temp = numSort[4];
//            
//            }
        for (int i = 0; i < numSort.length; i++) {
            //for (int i = numSort.length-1; i >=0 ; i--) {

            System.out.print(" " + numSort[i]);

        }
        System.out.println("");
    }
}
