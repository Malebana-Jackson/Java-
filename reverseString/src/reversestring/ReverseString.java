/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author TRAIN 23
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String s = input.next().toLowerCase();
        StringBuilder sb = new StringBuilder();
        String ss=null;
       
        
      
      //  sb.reverse();
//        for(int m =sb.length(); m>=0; m--){
//         
//            
//             sb.replace(0,sb.length(),sb.substring(1,sb.length()) + sb.charAt(0));
//        
//        System.out.println(sb.toString());
//        
//        }
        
        
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        
        System.out.println(sb.toString());
    }
    
}
