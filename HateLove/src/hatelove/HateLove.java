/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatelove;

import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class HateLove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input the sentence \"I hate you \" the word hate can occur as many times as you wish");
        String s = input.next();
        
       
        
        System.out.println(s.replaceAll("hate", "love"));
        
        
//SingBuilder sb = new StringBuilder(s)Str;       
//        System.out.println(sb);
//        sb = sb.replace(2, 6, "love");
//        System.out.println(sb);
//        
        
        
    }
    
}
