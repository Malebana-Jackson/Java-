/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class Person {
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    

    @Override
    public boolean equals(Object obj) {
        
       
        if(this == obj){
        
        return true;
        }
        
        if(!(obj instanceof Person)){
        
         return false;
        }
    
       Person p = ( Person) obj;
       return name.equals(p.getName()) && age==p.getAge();
    }

    @Override
    public int hashCode() {
       
        int result =17;
        result = 31 * result + name.hashCode();
        result = 31 * result+ age;
        return result;
        
        
        
    }
    
    
    
    
    
    
    
    
}
