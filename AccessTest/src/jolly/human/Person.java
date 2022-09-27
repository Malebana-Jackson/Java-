package jolly.human;

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

    public Person(String name) {
        this.name = name;
    }
//   private String nsme;
//
//    public String getNsme() {
//        return nsme;
//    }
//
//    public void setNsme(String nsme) {
//        this.nsme = nsme;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" + "nsme=" + nsme + '}';
//    }

//    protected String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" + "name=" + name + '}';
//    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }

}
