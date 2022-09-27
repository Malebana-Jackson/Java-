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
public class Rectangle extends Shape {

    private double length;
    private double breath;

    public Rectangle(double length, double breath, String shape) {
        super(shape);
        this.length = length;
        this.breath = breath;
    }

    public double getLength(double length) {

        return this.length = length;

    }

    public double getBreath(double breath) {

        return this.breath = breath;

    }

    public double calcArea() {

        return length * breath;

    }

}
