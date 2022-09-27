/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecer;

/**
 *
 * @author TRAIN 23
 */
public abstract class BankAccount implements Account{

    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }
    
    
    

    @Override
    public void deposit(double amount) {
        
        this.amount+=amount;
      
    }

    @Override
    public double getBalance() {
       return this.amount;
    }


        @Override
    public void withdraw(double amount) {
         if (amount<=getBalance()){
      
        deposit(amount*-1);
    }
    
    

    
}
}