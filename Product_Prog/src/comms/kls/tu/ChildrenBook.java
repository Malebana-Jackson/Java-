/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comms.kls.tu;

/**
 *
 * @author TRAIN 23
 */
public class ChildrenBook extends Book {
    private int age;

    public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
        super(regularPrice, publisher, yearPublished);
        this.age =age;
    }

    
   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ChildrenBook{" + "age=" + age + '}';
    }
    
    
    
    public void ChildrenBook(double regularPrice, String publisher,  int yearPublished, int age){}
}
