/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class ReplaceStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReplaceStr str0 = new ReplaceStr();
        System.out.println(str0.replaceFirstOccurance("I hate you","hate", "love"));
        System.out.println(str0.replaceAllOccurance("I hate you","hate", "love"));
        
        
    }
    
    public  String replaceFirstOccurance(String str, String replace, String replaceWith){
    
     return str.replaceFirst(replace, replaceWith);
    
    
 
    }
    
    public  String replaceAllOccurance(String str, String replace, String replaceWith){
    
     return str.replaceAll(replace, replaceWith);
    
    
    
    }
}
