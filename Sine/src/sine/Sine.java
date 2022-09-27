/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sine;

/**
 *
 * @author TRAIN 23
 */
public class Sine {

    
 static void printSinWave(int wave_height,int wave_length){
 
    // inner space and outer space.
    int is = 1, os = 2;
 
    int inc = 1;
    int jump = (wave_height * 3) -
               (wave_height + 1);
    int ch = 'A' + wave_height - 1;
 
    // for loop for height of wave
    for (int i = 1; i <= wave_height; i++)
    {
 
        // for loop for wave length
        for (int j = 1; j <= wave_length; j++)
        {
 
            // intermediate spaces
            for (int k = 1; k <= os; k++)
                System.out.printf(" ");        
            System.out.printf("%c", ch);
 
            for (int k = 1; k <= is; k++)
                System.out.printf(" ");        
 
            ch += inc;
 
            if (ch > 'Z')
                ch = ch - 26;        
            System.out.printf("%c", ch);
 
            for (int k = 1; k <= os; k++)
                System.out.printf(" ");
 
            System.out.printf(" ");
            ch += jump;
            if (ch > 'Z')
                ch = ch - 26;        
        }
 
        // set value of os to 1 if i+1 is not
        // equal to wave height or 0 otherwise
        os = (i + 1 != wave_height) ? 1 : 0;
 
        // set value of is to 3 if i+1 is not
        // equal to wave height or 5 otherwise
        is = (i + 1 != wave_height) ? 3 : 5;
 
        ch = 'A' + wave_height - i - 1;
        inc = inc + 2;
        jump -= 2;
 
        System.out.printf("\n");
    }
}
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int wave_height = 5, wave_length = 10;
           
        printSinWave(wave_height, wave_length);
        
        
    }
    
}
