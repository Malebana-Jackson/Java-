/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class RomansNeum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
 
}
  class RomanCount{
    
      
   public void getRoman(){
    int  toRoman;
    
    for(int count = 1; count<=110;count++){
   
     toRoman =count;
     toRoman = makeRoman(toRoman,100,'C');
     
     if(toRoman ==90){
         System.out.println("XC");
         toRoman -=90;
     
     }
     
     toRoman = makeRoman(toRoman,50,'L');
         if(toRoman ==40){
         System.out.println("XL");
         toRoman -=40;
     
     }
     
     toRoman = makeRoman(toRoman,10,'X');
   
       if(toRoman ==9){
         System.out.println("IX");
         toRoman -=9;
     
     }
           if(toRoman ==5){
         System.out.println("V");
         toRoman -=5;
           }
          if(toRoman ==4){
         System.out.println("IV");
         toRoman -=4;
          }
     
     
    toRoman = makeRoman(toRoman,1,'I');
   }
    }
      
    int makeRoman(int in, int dec, char ch){
      
      while(in>dec){
      
          System.out.println("ch");
          in-=dec;
          return in;
      }
       return ch;
      
      

      
    }
  
  
    }