/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morsecode;

import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class MorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your a sentence to translate into morse code: ");
        String s = input.next().toLowerCase();
        for (int pos = 0; pos < s.length(); pos++) {
            char ch = s.charAt(pos);
            if (ch == ',') {
                System.out.print(morse[36]);
            }
            if (ch == '.') {
                System.out.print(morse[37]);
            }
            if (ch >= 'a' && ch <= 'z') {
                System.out.print(morse[ch - 'a']);
            }
            System.out.print("  ");
        }
        // ----------------------------------------------------------------------------------       

//        char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
//                  'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
//                  'y', 'z', ',', '.', '?' };
//
//         
//        
//        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your a sentence to translate into morse code");
//        String s = input.next().toLowerCase();
//  
//        char[] chars = s.toCharArray();
//        String st = "";
//        
//        for (int x =0; x < chars.length; x++){
//        for(int i =0; i < alpha.length; i++){
//        
//           
//            
//            if(chars[x]==alpha[i]){
//                
//                
//                st += morse[i];
//                
//                
//            
//            }
//            
//       
//        }
//        }
//        System.out.println("Translated:" + st);
    }

}
