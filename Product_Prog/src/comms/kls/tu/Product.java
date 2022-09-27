/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comms.kls.tu;

import pak.co.zari.ProductInterface;

/**
 *
 * @author TRAIN 23
 */
public class Product implements ProductInterface {
    private double regularPrice;
    
    public  Product(double regularPrice){
     this.regularPrice = regularPrice;
    
    }

    
    
    @Override
    public double computeSalePrice() {
        return 0;
    }

    @Override
    public double getRegularPrice() {
       return this.regularPrice;
    }

    @Override
    public void setRegularPrice(double regularPrice) {
        this.regularPrice=regularPrice;
    }
    
    
}
