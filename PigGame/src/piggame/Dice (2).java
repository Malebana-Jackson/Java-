/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piggame;

import java.util.Random;

/**
 *
 * @author TRAIN 23
 */
public class Dice {

    private int sides;

    public Dice() {
        this(6);
    }
    public Dice(int sides) {
       this.sides=sides;
    }

    public String toString() {
        return "Dice{" + "sides=" + sides +"}";
    }

    void setSide(int dSides) {
        sides = dSides;
    }

    int getSides() {
        return sides;
    }

    int roll() {
        return new Random().nextInt(sides) + 1;
    }

}
