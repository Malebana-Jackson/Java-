/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclass_prog;



import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author TRAIN 23
 */
public class NestedClass_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new NestedClass_Prog().testing();
    }

    private void testing() {
        
        
        
        Person pers = new Person("Bruce Wayne", "Male");
        Person.Birth_Certificate cert = pers.new Birth_Certificate( LocalDate.of(1995,5,18),"Martha Wayne", "Tomas Wayne", "Gotham City");
        System.out.println("What is your name\t"+ pers.getName());
        System.out.println("What is your gender\t"+pers.getGender());
        
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Who is your mom\t"+cert.getMom());
        System.out.println(" Who is your dad\t"+cert.getDad());
        System.out.println("Where were you born"+ cert.getLocation());
        
        System.out.println("-------------------------------------------------------------------------------------------------------");
        
         Person pers1 = new Person("Clark Kent", "Male");
        Person.Birth_Certificate cert1 = pers.new Birth_Certificate(LocalDate.of(1998,6,9) ,"Martha Kent", "Randy Kent", "Star City");
        System.out.println("What is your name\t"+ pers1.getName());
        System.out.println("What is your gender\t"+pers1.getGender());
        
        System.out.println("-------------------------------------------------------------------------------------------------------");
        
        System.out.println("Who is your mom\t"+cert1.getMom());
        System.out.println(" Who is your dad\t"+cert1.getDad());
        System.out.println("Where were you born\t"+ cert1.getLocation());
        
        System.out.println("-------------------------------------------------------------------------------------------------------");
        
        
        
    }
    
}
