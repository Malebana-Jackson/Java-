/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piggame;

/**
 *
 * @author TRAIN 23
 */
public class Person {
    
    
    private String name;
    private int age;

    public Person() {
    }

   
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
    
}
