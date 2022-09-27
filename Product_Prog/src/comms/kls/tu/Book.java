
package comms.kls.tu;

import pak.co.zari.BookInterface;

public class Book extends Product implements BookInterface {
    
    private String publisher;
    private int yearPublished;

    public Book(double regularPrice, String publisher, int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }


    public void Book(double regularPrice, String publisher,int yearPublished){};

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(String publisher) {
       this.publisher = publisher;
    }

    @Override
    public int getYearPublished() {
       return this.yearPublished;
    }

    @Override
    public void setYearPublish(int yearPublished) {
       this.yearPublished = yearPublished;
    }
    
    @Override
    public double computeSalePrice() {
      return    getRegularPrice()*1.5;
        
       
    }

    @Override
    public String toString() {
        return "Book{" + "publisher=" + publisher + ", yearPublished=" + yearPublished + '}';
    }





}


