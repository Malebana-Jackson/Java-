/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timertest;


public class TimerTest {
 private final int Sec_In_Min =60;
 private final int Sec_In_Hrs = Sec_In_Min * Sec_In_Min;
 private final int Sec_In_Days = Sec_In_Hrs * Sec_In_Min;
 
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        TimerTest hms = new TimerTest(); 
        System.out.println(hms.timerHrsMinSecs(50391 ));
        
    }
    
    
    
    public  String timerDaysHrsMinSecs(long tatalSeconds){
     long day = tatalSeconds/Sec_In_Days;
     long leftOver = tatalSeconds -(day*Sec_In_Days);
     return String.format("Days: %d, %s",day,leftOver);
    
    
    
    }
    
    
    
    public String timerHrsMinSecs( long tatalSeconds){
    
    long hours = tatalSeconds/Sec_In_Hrs;
    long minutes = tatalSeconds -(hours*Sec_In_Hrs)/Sec_In_Hrs;
    long seconds = tatalSeconds- (hours*Sec_In_Hrs) -(minutes*Sec_In_Min);
    return String.format("Hrs: %d, Mins: %d, Secs: %d,", hours,minutes,seconds);
    
    
    }
    
}
