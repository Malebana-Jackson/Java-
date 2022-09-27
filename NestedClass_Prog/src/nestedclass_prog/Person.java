/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclass_prog;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author TRAIN 23
 */
public class Person {
    
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + '}';
    }
 

    
    
    public class Birth_Certificate{
    
    
    private final LocalDate date_of_birth;
    private final String mom;
    private final String dad;
    private final String location;

        public Birth_Certificate(LocalDate date_of_birth, String mom, String dad, String location) {
            this.date_of_birth = date_of_birth;
            this.mom = mom;
            this.dad = dad;
            this.location = location;
        }

        public LocalDate getDate_of_birth() {
            return date_of_birth;
        }

        public String getMom() {
            return mom;
        }

        public String getDad() {
            return dad;
        }

        public String getLocation() {
            return location;
        }

        @Override
        public String toString() {
            return "Birth_Certificate{" + "date_of_birth=" + date_of_birth + ", mom=" + mom + ", dad=" + dad + ", location=" + location + '}';
        }
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
}
