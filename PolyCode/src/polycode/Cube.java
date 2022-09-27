/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polycode;

/**
 *
 * @author TRAIN 23
 */
public class Cube extends Square {

    public Cube(double width, String shape) {
        super(width, shape);
    }

    public double calcArea() {

        return calcArea() * 6;

    }

}
