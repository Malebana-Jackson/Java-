
import java.util.Scanner;
import mecer.Account;
import mecer.BankAccount;
import mecer.ChequeAccount;
import mecer.CreditCardAccount;
import mecer.SavingAccount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class Mustek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      new Mustek().runMe();
        
    }
    
    
     public void runMe(){

         
          Account acc1 = new SavingAccount(100.00);
          System.out.println("Balance in savings is" +acc1.getBalance());
           
         
           acc1.withdraw(30.32);
           System.out.println("Balance in savings is" +acc1.getBalance());
            
           Account acc2 = new ChequeAccount(600.00);
           System.out.println("Balance in cheque is" +acc2.getBalance());
           
           acc2.withdraw(150.32);
           System.out.println("Balance in cheque is" +acc2.getBalance());
           
           Account acc3 = new CreditCardAccount(1000.00,400.00);
            System.out.println("Balance in credit is" +acc2.getBalance());
           acc3.withdraw(150.32);
           System.out.println("Balance in credit is" +acc3.getBalance());
           
           
     
     }
    
    
}
