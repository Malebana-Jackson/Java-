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
public class PigGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Person p1 = new Person();
        p1.setName("James");
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice();

        String msg = "";
        int count = 0;
        while (true) {
            int sum = (dice1.roll() + dice2.roll());
            count += 1;
            if (sum == 7) {
                msg = "You win " + p1.getName() + " in a number of throws of " + count;
                break;
            } else if (sum == 3) {

                msg = "You lose "  + p1.getName() + " in a number of throws of " + count;
                break;
            }
        }
        System.out.println(msg);
    }

}
