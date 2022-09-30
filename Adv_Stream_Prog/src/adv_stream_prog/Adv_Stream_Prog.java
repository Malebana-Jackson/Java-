/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adv_stream_prog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author TRAIN 23
 */
public class Adv_Stream_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Adv_Stream_Prog().testing();
        new Adv_Stream_Prog().testing0();
        new Adv_Stream_Prog().testing1();
        
        
    }

    private void testing() {
        Integer[] myInt = {1,2,3,4,5,6,};
        Stream<Integer> myStream = Arrays.stream(myInt);
        long count = myStream.filter((i)-> i>2).count();
        System.out.println("Count is"+ count);
        myStream = Arrays.stream(myInt);
        count = myStream.filter((i)-> i>5).count();
        
        
    }

    private void testing0() {
         List<Person> person = new ArrayList<>();
         System.out.println(new Person("Rakim", 30, "Male", 250000.00));
         System.out.println(new Person("Riri", 33, "Female", 550000.00));
         System.out.println(new Person("Isiah", 30, "Male", 200000.00));
         System.out.println(new Person("SZA", 30, "Female", 350000.00));
         System.out.println(new Person("Sean", 50, "Male", 1250000.00));
         System.out.println(new Person("Beyonce", 30, "Female", 1150000.00));
         
         
         Stream<Person> myStream0 = person.stream().filter(p->p.getGender()!="Male");
         myStream0.forEach(p->  System.out.println("The Names: " + p.getName()));
         
        System.out.println("");
         Stream<Person> myStream1 = person.stream().filter(p->p.getGender()=="Male"&&p.getSalary()>250000);
         myStream1.forEach(p->  System.out.println("The Names: " + p.getName()));
         
         List <Person> myPList =person.stream().filter(p->p.getAge()>30).collect(Collectors.toList());
         
         for(Person p : myPList){
         
             System.out.println(" "+ p);
         
         }
         myPList.forEach(System.out::println);
         
         
         person.stream().filter(p->p.getAge()>29).sorted((p1,p2)-> p1.getAge()-p2.getAge()).forEach(p->System.out.println(""+ p) );
         
         
        double salaryTotal= person.stream().map(p->p.getSalary()).reduce(0.0,(sum,salary) -> sum+salary);
        System.out.println("Salary total" + salaryTotal );
         
    }

    private void testing1() {
      
        try {
            Stream<String> mystream = Files.lines(Paths.get("C:\\Users\\TRAIN 23\\demo\\Java-\\file1.txt"));
            
            mystream.forEach(lineRead ->{
            String [] str = lineRead.split("");
            for(String s: str){
            
            
                System.out.println(s);
            }
            
                    });
            
        } catch (IOException ex) {
            Logger.getLogger(Adv_Stream_Prog.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    
}
