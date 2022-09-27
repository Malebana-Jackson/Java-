/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colour;

import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class Colour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        char[] colour = new char[5];

        for (int i = 0; i < colour.length; i++) {

            System.out.println("Create a new 5 character colour using R,G,B ");
            colour[i] = input.next().charAt(0);

        }
        for (int j = 0; j < colour.length; j++) {
            if ((j + 1) < colour.length) {

                if (colour[j] == colour[j + 1]) {
                    System.out.println("Invalid ");
                }else
                {
                    System.out.println("Your new colour is"+colour);
                
                }
            }

        }

    }

}
