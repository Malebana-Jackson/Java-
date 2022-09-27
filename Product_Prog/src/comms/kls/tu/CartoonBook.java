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
public class CartoonBook extends Book {
    private String characterName;

    public CartoonBook(double regularPrice, String publisher, int yearPublished,String characterName) {
        super(regularPrice, publisher, yearPublished);
        this.characterName = characterName;
    }



    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public String toString() {
        return "CartoonBook{" + "characterName=" + characterName + '}';
    }


    
    
    
    public void CartoonBook(double regularPrice, String publisher, int yearPublished, String characterName){}
}
