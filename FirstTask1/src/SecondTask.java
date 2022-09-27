
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TRAIN 23
 */
public class SecondTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int final_mark = input.nextInt();

        if(final_mark <0 || final_mark>100){
         
            System.out.println("Invalid Entry");
        }
        String ch = "A";
        
        if (final_mark < 90) {
            ch= "B";
        }
        else if (final_mark < 80) {
           ch="C";
        }
        else if (final_mark < 60) {
            ch="D";
        }
        else if (final_mark < 50) {
            System.out.println("FAIL");
        }
        
        System.out.println(ch);
    }

}
