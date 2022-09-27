/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class AttackAndDelay {
    
    
    private final StringBuilder stringbuilder;
    private final Person p;
    private final int attack;
    private final int delay;

    public AttackAndDelay(StringBuilder stringbuilder, Person p, int attack, int delay) {
        this.stringbuilder = new StringBuilder(stringbuilder);
        this.p = new Person(p.getName());
        this.attack = attack;
        this.delay = delay;
    }

    
   

    public StringBuilder getStringbuilder() {
        return new StringBuilder (stringbuilder);
    }

    public Person getP() {
        return new Person(p.getName()) ;
    }


    public int getAttack() {
        return attack;
    }

    public int getDelay() {
        return delay;
    }

    @Override
    public String toString() {
        return "AttackAndDelay{" + "stringbuilder=" + stringbuilder + ", p=" + p + ", attack=" + attack + ", delay=" + delay + '}';
    }
    
    
    
    
    
    
    
   
    
}
