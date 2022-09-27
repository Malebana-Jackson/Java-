/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author TRAIN 23
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Person p1 = new Person();
        p1.setName ("SquarePants");
        p1.setAge (21);
        Person p2 = new Person();
        p2.setName("Patrick ");
        p2.setAge(20);
        Car c1 = new Car();
        c1.setMake("Ferrari");
        c1.setAge(1);
        c1.setModel("LaFerrari");
        System.out.println(" Name is: "+ p1.getName());
        System.out.println(" Age is: " + p1.getAge());
        
        System.out.println(" Name is: "+ p2.getName());
        System.out.println(" Age is: " + p2.getAge());
        
        System.out.println(" Make is: "+ c1.getMake());
        System.out.println(" Age is: " + c1.getAge());
        System.out.println("Model is: " + c1.getModel());
        
        
    }
    
}
