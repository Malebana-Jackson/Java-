/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

/**
 *
 * @author TRAIN 23
 */
public class WayPoints {
    
    private double x;
    private double y;
    private int t;

    public WayPoints(double x, double y, int t) {
        this.x = x;
        this.y = y;
        this.t = t;
    }

 
    
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    
    
       @Override
    public String toString() {
        return "WayPoints{" + "x=" + x + ", y=" + y + ", t=" + t + '}';
    }

    

    
    
    
}
