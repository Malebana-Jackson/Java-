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
public interface Account {
    
    
    void deposit(double amount);
    double getBalance();
    void withdraw(double amount);
    
}
