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
public class CreditCardAccount extends BankAccount {
 
    private double credit;

    public CreditCardAccount(double credit,double amount) {
        super(amount);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
   
    
    public void withdraw(double amount){
    
         if (amount <= getBalance()+credit)
        deposit(amount*-1);
    }

    @Override
    public String toString() {
        return "CreditCardAccount{" + "credit=" + credit + '}';
    }
    
    
    
    
    
    
    
    
    
}
