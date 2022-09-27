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
public class MP3Player extends Electronics{
    private String colour;

    public MP3Player(double regularPrice) {
        super(regularPrice);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void MP3Player(double regularPrice,String manufacturer, String colour){}

    @Override
    public String getManufactor() {
        return super.getManufactor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Electronics(double regularPrice, String manufacturer) {
        super.Electronics(regularPrice, manufacturer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRegularPrice() {
        return super.getRegularPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double computeSalePrice() {
        return super.computeSalePrice(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
