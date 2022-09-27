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
public class Car {
    
    
    
    private String make;
    private int age;
    private String model;


    void setMake(String cMake){
     make = cMake;
    
    }
    
     String getMake(){
     return make;
    
    }
    
     
     void setAge(int cAge){
     age = cAge;
    
    }
    
     int getAge(){
     return age;
    
    }
     
     
     
     void setModel(String cModel){
     model = cModel;
    
    }
    
     String getModel(){
     return model;
    
    }

    public Car() {
    }
    
    
    
}
