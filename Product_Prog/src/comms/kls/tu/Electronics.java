/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comms.kls.tu;

import pak.co.zari.ElectronicsInterface;

/**
 *
 * @author TRAIN 23
 */
public class Electronics extends Product implements ElectronicsInterface{
    
    private String manufacturer;

    public Electronics(double regularPrice) {
        super(regularPrice);
    }

 

  

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    
    
    public void Electronics(double regularPrice, String manufacturer){}

    

    @Override
    public String getManufactor() {
      return   this.manufacturer;
    }


    
}
