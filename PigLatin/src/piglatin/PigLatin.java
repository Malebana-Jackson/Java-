/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

/**
 *
 * @author TRAIN 23
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       String first = "jackson";
       String last = "malebana";
       
       
       StringBuilder sb = new StringBuilder(first);
       StringBuilder sb1 = new StringBuilder(last);
        
       sb.replace(0, sb.length(),sb.substring(1,sb.length()));
       sb.append(first.charAt(0));
       sb.append("ay");
       
       sb1.replace(0,sb1.length(), sb1.substring(1,sb1.length()));
       sb1.append(last.charAt(0));
       sb1.append("ay");
       
       
       System.out.println(sb + " " +sb1);       
       
       
       
       
//        String pigL1 = first.substring(1, first.length()) + first.charAt(0);
//        pigL1 = pigL1.replaceFirst("" +pigL1.charAt(0), "" +pigL1.toUpperCase().charAt(0));
//        pigL1 = pigL1.concat("ay");
//        
//        
//        String pigL2 = last.substring(1, last.length()) + last.charAt(0);
//        pigL2 = pigL2.replaceFirst(""+pigL2.charAt(0),"" +pigL2.toUpperCase().charAt(0)); 
//        pigL2 = pigL2.concat("ay");
//        
//        
//        System.out.println("Your name in pig latin is : " + pigL1 + " " + pigL2);
//        
//      


      
       
       
    }
    
}
