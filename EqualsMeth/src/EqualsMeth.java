/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class EqualsMeth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       new EqualsMeth().testing();
        
        
    }

    private void testing() {
        Person pers = new Person("Olive Green", 24);
        Person pers0 = new Person("Katlego Malebana", 24);
        Person pers1 = new Person("Olive Green", 24);
        System.out.println("Is this the same person pers && pers0\t"+ pers.equals(pers0));
        System.out.println("Is this the same person pers && pers\t"+ pers.equals(pers));
        System.out.println("Is this the same person pers && pers1\t"+ pers.equals(pers1));
         System.out.println("Is this the same person pers && pers0\t"+ pers.equals(new String("Olive Green")));
        
    }
    
}
