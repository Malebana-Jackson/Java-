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
public class Televison extends Electronics {
    
    private int size;

    public Televison(double regularPrice) {
        super(regularPrice);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Televison{" + "size=" + size + '}';
    }
    
    
    public void Televison(double regularPrice, String manufacturer, int side){}
}
