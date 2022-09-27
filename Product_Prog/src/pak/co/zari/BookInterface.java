/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pak.co.zari;

/**
 *
 * @author TRAIN 23
 */
public interface BookInterface extends ProductInterface {
    
    public String getPublisher();
    public void setPublisher(String publisher);
    public int getYearPublished();
    public void setYearPublish(int yearPublished);
    
}
