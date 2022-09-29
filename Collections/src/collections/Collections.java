/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author TRAIN 23
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Collections().lists();
        new Collections().sets();
        new Collections().pers_set();
        new Collections().maps();
        new Collections().stack();
        
        
    }

    private void lists() {
        
        List<Person> myList = new ArrayList<>();
        myList.add(new Person("Tshiamo",24));
        myList.add(new Person("Neo", 25));
        myList.add(new Person("Koketso",26));
        myList.add(new Person("Peter", 24));
        myList.add(new Person("Kabelo",23));
        
        myList.stream().forEach((p)->System.out.println(p.getName()));
        
        System.out.println("================================================");
    
        
        
    }

    private void sets() {
       
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        set.add("D");
        set.add("B");
        set.add("C");
        
        set.stream().forEach((q)->System.out.println(q));
        
        System.out.println("================================================");
        

    }

    private void pers_set() {
        
        Set<Person> set = new HashSet<>();
        
        set.add(new Person("Tshiamo",24));
        set.add(new Person("Neo", 25));
        set.add(new Person("Koketso",26));
        set.add(new Person("Peter", 24));
        set.add(new Person("Kabelo",23));
        
        
        set.stream().forEach((r)->System.out.println(r));
        
        System.out.println("================================================");
    }

    private void maps() {
        
        Map<Integer, Person> myMap = new HashMap<>();
        myMap.put(1, new Person("A$AP Rocky", 30));
        myMap.put(2, new Person("Future Hendrixx", 36));
        myMap.put(3, new Person("Isaiah  Rashad", 30));
        myMap.put(1, new Person("Tyler ,the Creator", 30));
        
        for(Integer key: myMap.keySet()){
        
        
            System.out.printf("The Person assciated with key %d is %s\n",key, myMap.get(key).getName());}
        
        System.out.println("================================================");
         
    }

    private void stack() {
        
        
        Stack<Character> stack = new Stack<>();
        
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('X');
        stack.push('Y');
        stack.push('Z');
        
        System.out.println("Popping the stack\t"+ stack.pop());
        
    }
    
}
