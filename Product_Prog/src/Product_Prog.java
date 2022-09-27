
import comms.kls.tu.Book;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class Product_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        new Product_Prog().testing();
    }

    private void testing() {
      ArrayList<Book> prodlist = new ArrayList();
      prodlist.add(new Book(332.34, "Dark Knights", 1995));
    }
    
}
