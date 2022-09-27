/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_prog;

/**
 *
 * @author TRAIN 23
 */
public class Singleton_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Logger logClass = Logger.getInstance();
        logClass.setLogger("Jacksons_Logger");
        logClass.log("British Greeting: " + logClass.getLogger());
        Logger olive = logClass.getInstance();
        logClass.log("Heya bro: " + logClass.getLogger());
        logClass.log("Same reference: " + (olive==logClass));

    }

}
